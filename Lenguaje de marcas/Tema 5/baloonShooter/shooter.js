
class Globo {
    constructor(juego) {
        this.juego = juego; // Referencia al juego al que pertenece el globo
        this.diametro = Math.random() * 50 + 30; // Tamaño aleatorio del globo entre 30 y 80 píxeles
        this.x = Math.random() * (1200 - this.diametro); // Posición horizontal aleatoria dentro de un rango de 1200px
        this.y = 0; // Posición inicial en la parte inferior de la pantalla
        this.color = `rgb(${Math.random() * 255}, ${Math.random() * 255}, ${Math.random() * 255})`; // Color aleatorio

        // Creación del elemento HTML que representa al globo
        this.elemento = document.createElement("div");
        this.elemento.classList.add("globo"); // Se asigna la clase "globo" para su estilización
        this.elemento.style.width = this.diametro + "px";
        this.elemento.style.height = (this.diametro * 1.4) + "px"; // Se ajusta la altura del globo
        this.elemento.style.backgroundColor = this.color;
        this.elemento.style.left = this.x + "px"; // Posicionamiento en la pantalla
        this.elemento.style.bottom = "0px"; // Aparece en la parte inferior
        this.elemento.style.position = "absolute"; // Posición absoluta en la pantalla

        // Creación del nudo del globo (parte inferior)
        let nudo = document.createElement("div");
        nudo.classList.add("nudo");
        nudo.style.backgroundColor = this.color; // Mismo color que el globo
        this.elemento.appendChild(nudo); // Se añade el nudo como hijo del globo

        // Se agrega un evento de clic para que el usuario pueda explotar el globo
        this.elemento.addEventListener("click", () => this.explotar());

        // Se añade el globo a la pantalla
        document.getElementById("pantalla").appendChild(this.elemento);

        // Se inicia el movimiento ascendente del globo
        this.moverArriba();
    }

    // Método que mueve el globo hacia arriba
    moverArriba() {
        this.intervalo = setInterval(() => {
            this.y += this.juego.velocidadGlobal; // Se incrementa la posición vertical según la velocidad del juego
            this.elemento.style.bottom = this.y + "px"; // Se actualiza la posición en la pantalla

            // Si el globo alcanza la parte superior de la pantalla, el juego termina
            if (this.y >= 800) {
                clearInterval(this.intervalo);
                this.juego.terminarJuego();
            }
        }, 20); // Se actualiza cada 20ms
    }

    // Método que se ejecuta cuando el usuario explota el globo
    explotar() {
        this.eliminar(); // Se elimina el globo de la pantalla
        this.juego.incrementarPuntuacion(); // Se incrementa la puntuación del juego
    }

    // Método para eliminar el globo del juego
    eliminar() {
        clearInterval(this.intervalo); // Se detiene el movimiento del globo
        this.elemento.remove(); // Se elimina el elemento HTML del DOM
        this.juego.globos = this.juego.globos.filter(globo => globo !== this); // Se elimina de la lista de globos en el juego
    }
}

class Juego {
    constructor() {
        this.puntos = 0; // Puntuación inicial
        this.globos = []; // Lista de globos en pantalla
        this.activo = true; // Estado del juego (activo o terminado)
        this.velocidadGlobal = 1; // Velocidad inicial de los globos
        this.iniciar(); // Se inicia el juego automáticamente
    }

    // Método para iniciar el juego
    iniciar() {
        this.activo = true; // Se establece el estado del juego como activo
        this.puntos = 0; // Se reinicia la puntuación
        this.velocidadGlobal = 1; // Se reinicia la velocidad global
        document.getElementById("puntos").textContent = this.puntos; // Se actualiza la puntuación en pantalla
        document.getElementById("gameOver").style.display = "none"; // Se oculta el mensaje de "Game Over"

        // Se genera un nuevo globo cada 800ms
        this.intervaloGlobos = setInterval(() => this.crearGlobo(), 700);

        // Aumenta la velocidad global cada 15 segundos, hasta un máximo de 4
        this.intervaloVelocidad = setInterval(() => {
            if (this.velocidadGlobal < 4) {
                this.velocidadGlobal += 1;
            }
        }, 15000);
    }

    // Método para crear un nuevo globo
    crearGlobo() {
        if (this.activo) { // Solo se crean globos si el juego sigue activo
            let nuevoGlobo = new Globo(this);
            this.globos.push(nuevoGlobo); // Se añade el globo a la lista
        }
    }

    // Método para aumentar la puntuación
    incrementarPuntuacion() {
        if (this.activo) {
            this.puntos++; // Se incrementa la puntuación
            document.getElementById("puntos").textContent = this.puntos; // Se actualiza la puntuación en pantalla
        }
    }

    // Método que finaliza el juego
    terminarJuego() {
        if (this.activo) {
            this.activo = false; // Se desactiva el juego
            clearInterval(this.intervaloGlobos); // Se detiene la creación de globos
            clearInterval(this.intervaloVelocidad); // Se detiene el aumento de velocidad
            document.getElementById("gameOver").style.display = "block"; // Se muestra el mensaje de "Game Over"
            
            // Se eliminan todos los globos en pantalla
            this.globos.forEach(globo => globo.eliminar());
            this.globos = []; // Se vacía la lista de globos
        }
    }
}

// Variable global para la instancia del juego
let juego;

// Función para reiniciar el juego cuando el usuario presiona la barra espaciadora
function reiniciarJuego(event) {
    if (event.code === "Space") { // Si se presiona la tecla "Espacio"
        juego = new Juego(); // Se crea una nueva instancia del juego
    }
}

// Se inicia el juego cuando se carga la página y se escucha la tecla "Espacio" para reiniciar
window.onload = () => {
    juego = new Juego();
    document.addEventListener("keydown", reiniciarJuego);
};