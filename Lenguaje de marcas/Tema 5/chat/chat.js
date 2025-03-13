//version: 1.5
// Variables
var usuarioTexto = document.getElementById("user");
var passwordTexto = document.getElementById("password");
var cancelButton = document.getElementById("cancel");
var dialogLogin = document.getElementById("dialogLogin");
var confirmButton = document.getElementById("submit");
var chatContainer = document.getElementById("chatBody"); 
var chatButton = document.getElementById("chatButton");
var chatInput = document.getElementById("chatInput");
var chat = document.getElementById("chat");
var userInfo = document.getElementById("userInfo");

// Lista de usuarios permitidos
const users = {
    "pmpc@": "1234",
    "marti@": "4321"
};

// Respuestas automáticas basadas en palabras clave
var respuestas = {
    "hola": ["¡Hola! ¿Cómo estás?", "¡Hey! ¿Qué tal?", "¡Hola! ¿En qué puedo ayudarte?"],
    "ayuda": ["Claro, dime en qué necesitas ayuda.", "Estoy aquí para ayudar, dime tu problema.", "Dime más detalles para poder ayudarte mejor."],
    "precio": ["Los precios varían según el producto. ¿Qué necesitas saber exactamente?", "Consulta nuestra lista de precios en la web."],
    "gracias": ["¡De nada!", "Para eso estamos.", "¡Con gusto!"],
    "adios": ["Hasta luego.", "¡Nos vemos pronto!", "Cuídate, adiós."],
    "horario": ["Nuestro horario es de 3:00 PM a 9:00 PM.", "Damos clase de 3:00 PM a 9:00 PM.", "Puedes encontrarnos de 3:00 PM a 9:00 PM."],
};

//Crear lista de palabras clave para probar 
function actualizarInfo() {
    userInfo.innerHTML = "<h3>Palabras clave</h3>";
    let lista = document.createElement("ul");

    Object.keys(respuestas).forEach(palabra => {
        let item = document.createElement("li");
        item.textContent = palabra; // Solo mostramos la palabra clave
        lista.appendChild(item);
    });

    userInfo.appendChild(lista);
}

// Función para cerrar el diálogo de login
function cerrarDialogo() {
    dialogLogin.close();
}

// Función para mostrar el chat
function mostrarChat() {
    chat.style.display = "flex"; // Mostrar el chat
    cerrarDialogo(); // Cerrar el diálogo de login
    actualizarInfo(); // Actualizar información de palabras clave
}

// Función para enviar mensaje
function escribirYEmitir() {
    var mensajeTexto = chatInput.value.trim(); // Obtener mensaje
    if (mensajeTexto === "") return; // Evita mensajes vacíos

    var mensajeNuevo = document.createElement("div"); // Crear nuevo mensaje
    mensajeNuevo.textContent = mensajeTexto;
    mensajeNuevo.style.padding = "10px";
    mensajeNuevo.style.background = "#e1e1e1";
    mensajeNuevo.style.borderRadius = "5px";
    mensajeNuevo.style.alignSelf = "flex-end";

    chatContainer.appendChild(mensajeNuevo); // Agregar mensaje al chat
    chatInput.value = ""; // Limpiar input

    contestarMensaje(mensajeTexto); // Responder automáticamente
}

// Función para contestar con respuesta automática
function contestarMensaje(mensajeUsuario) {
    var mensajeUsuario = mensajeUsuario.toLowerCase().trim(); // Convertir a minúsculas
    var respuesta = "Lo siento, no entiendo tu mensaje."; // Respuesta por defecto

    // Buscar palabras clave en el mensaje del usuario
    for (var palabra in respuestas) {
        if (mensajeUsuario.includes(palabra)) {
            var listaRespuestas = respuestas[palabra]; // Obtener respuestas posibles
            respuesta = listaRespuestas[Math.floor(Math.random() * listaRespuestas.length)]; // Elegir una aleatoria
            break;
        }
    }

    // Crear mensaje de respuesta
    var mensajeRespuesta = document.createElement("div"); 
    mensajeRespuesta.textContent = respuesta;
    mensajeRespuesta.style.padding = "10px";
    mensajeRespuesta.style.background = "#e1e1e1";
    mensajeRespuesta.style.borderRadius = "5px";
    mensajeRespuesta.style.alignSelf = "flex-start";

    setTimeout(function() {
        chatContainer.appendChild(mensajeRespuesta);
    }, 2000);
}

// Eventos
cancelButton.addEventListener("click", cerrarDialogo);
chatButton.addEventListener("click", escribirYEmitir);

// Evento para validar credenciales antes de cerrar el diálogo
if (confirmButton) {
    confirmButton.addEventListener("click", function(event) {
        event.preventDefault(); // Evita que el formulario cierre el diálogo automáticamente

        if (users[usuarioTexto.value] === passwordTexto.value) {
            mostrarChat();
        } else {
            alert("Usuario y/o contraseña incorrectos");
            usuarioTexto.value = "";
            passwordTexto.value = "";
        }
    });
}

