const canvas = document.getElementById("gameCanvas");
const ctx = canvas.getContext("2d");
const scoreDisplay = document.getElementById("score");
const gameOverText = document.getElementById("gameOver");

canvas.width = 400;
canvas.height = 500;

let score = 0;
let gameOver = false;
const balloons = [];

// Crear globos aleatorios
function createBalloon() {
    if (gameOver) return;
    
    const radius = 20;
    const x = Math.random() * (canvas.width - radius * 2) + radius;
    balloons.push({ x, y: canvas.height, radius, speed: Math.random() * 2 + 1 });

    setTimeout(createBalloon, 1000); // Generar un nuevo globo cada segundo
}

// Dibujar globos
function drawBalloons() {
    balloons.forEach(balloon => {
        ctx.beginPath();
        ctx.arc(balloon.x, balloon.y, balloon.radius, 0, Math.PI * 2);
        ctx.fillStyle = "purple";
        ctx.fill();
        ctx.stroke();
    });
}

// Actualizar el juego
function update() {
    if (gameOver) return;

    ctx.clearRect(0, 0, canvas.width, canvas.height);

    // Mover globos hacia arriba
    balloons.forEach((balloon, index) => {
        balloon.y -= balloon.speed;

        // Si un globo llega arriba, pierdes
        if (balloon.y + balloon.radius < 0) {
            gameOver = true;
            gameOverText.classList.remove("hidden");
        }
    });

    drawBalloons();
    requestAnimationFrame(update);
}

// Detectar clics en los globos
canvas.addEventListener("click", (e) => {
    if (gameOver) return;

    const clickX = e.offsetX;
    const clickY = e.offsetY;

    balloons.forEach((balloon, index) => {
        const distance = Math.sqrt((clickX - balloon.x) ** 2 + (clickY - balloon.y) ** 2);

        if (distance < balloon.radius) {
            balloons.splice(index, 1); // Eliminar globo
            score++;
            scoreDisplay.textContent = score; // Actualizar puntuación
        }
    });
});

// Iniciar juego
createBalloon();
update();


