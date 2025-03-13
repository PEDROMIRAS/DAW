// Clase que representa un globo en el juego
class Globo {
    constructor(juego) {
        this.juego = juego; // Referencia al juego para poder interactuar con él
        this.diametro = Math.random() * 50 + 30; // Tamaño aleatorio del globo entre 30px y 80px
        this.x = Math.random() * (1200 - this.diametro); // Posición horizontal aleatoria dentro del área de juego
        this.y = 0; // Inicia desde la parte inferior

        // Color aleatorio para el globo
        this.color = `rgb(${Math.random() * 255}, ${Math.random() * 255}, ${Math.random() * 255})`;

        // Creación del elemento HTML del globo
        this.elemento = document.createElement("div");
        this.elemento.classList.add("globo");
        this.elemento.style.width = this.diametro + "px";
        this.elemento.style.height = (this.diametro * 1.4) + "px"; // Un poco más alto para parecer un globo
        this.elemento.style.backgroundColor = this.color;
        this.elemento.style.left = this.x + "px"; // Ubicación horizontal
        this.elemento.style.bottom = "0px"; // Inicia desde la parte inferior
        this.elemento.style.position = "absolute";

        // Creación del "nudo" del globo (parte inferior)
        let nudo = document.createElement("div");
        nudo.classList.add("nudo");
        nudo.style.backgroundColor = this.color;
        this.elemento.appendChild(nudo);

        this.velocidad = Math.random() * 3 + 1; // Velocidad aleatoria de ascenso entre 1 y 4

        // Evento para explotar el globo al hacer clic
        this.elemento.addEventListener("click", () => this.explotar());

        // Agrega el globo al área de juego
        document.getElementById("pantalla").appendChild(this.elemento);
        
        // Inicia el movimiento del globo hacia arriba
        this.moverArriba();
    }

    // Método para hacer que el globo suba
    moverArriba() {
        this.intervalo = setInterval(() => {
            this.y += this.velocidad; // Incrementa la posición vertical
            this.elemento.style.bottom = this.y + "px"; // Actualiza la posición

            // Si el globo sale del área de juego, termina el juego
            if (this.y >= 800) {
                clearInterval(this.intervalo);
                this.juego.terminarJuego();
            }
        }, 20);
    }

    // Método para explotar el globo al hacer clic
    explotar() {
        this.eliminar(); // Elimina el globo
        this.juego.incrementarPuntuacion(); // Aumenta la puntuación
    }

    // Método para eliminar el globo del DOM y del juego
    eliminar() {
        clearInterval(this.intervalo); // Detiene su movimiento
        this.elemento.remove(); // Elimina el globo del HTML
        this.juego.globos = this.juego.globos.filter(globo => globo !== this); // Lo quita de la lista de globos activos
    }
}

// Clase principal que maneja el juego
class Juego {
    constructor() {
        this.puntos = 0; // Puntuación inicial
        this.globos = []; // Lista de globos activos
        this.activo = true; // Estado del juego (activo o terminado)
        this.iniciar();
    }

    // Método para iniciar el juego
    iniciar() {
        this.activo = true;
        this.puntos = 0;
        document.getElementById("puntos").textContent = this.puntos; // Reinicia la puntuación en pantalla
        document.getElementById("gameOver").style.display = "none"; // Oculta el mensaje de "Game Over"

        // Genera globos continuamente cada 800ms
        this.intervaloGlobos = setInterval(() => this.crearGlobo(), 800);
    }

    // Método para crear un nuevo globo
    crearGlobo() {
        if (this.activo) { // Solo se crean globos si el juego está activo
            let nuevoGlobo = new Globo(this);
            this.globos.push(nuevoGlobo); // Añadirlo a la lista de globos
        }
    }

    // Método para aumentar la puntuación
    incrementarPuntuacion() {
        if (this.activo) {
            this.puntos++;
            document.getElementById("puntos").textContent = this.puntos; // Actualiza la puntuación en pantalla
        }
    }

    // Método para finalizar el juego cuando un globo se escapa
    terminarJuego() {
        if (this.activo) {
            this.activo = false; // Desactiva el juego
            clearInterval(this.intervaloGlobos); // Detiene la generación de globos
            document.getElementById("gameOver").style.display = "block"; // Muestra el mensaje de "Game Over"

            // Elimina todos los globos que siguen en pantalla
            this.globos.forEach(globo => globo.eliminar());
            this.globos = [];
        }
    }
}

// Variable global del juego
let juego;

// Función para reiniciar el juego cuando se presiona la barra espaciadora
function reiniciarJuego(event) {
    if (event.code === "Space") {
        juego = new Juego();
    }
}

// Inicia el juego cuando se carga la página y escucha la tecla "Espacio" para reiniciar
window.onload = () => {
    juego = new Juego();
    document.addEventListener("keydown", reiniciarJuego);
};