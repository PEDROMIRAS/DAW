// Función para manejar los mensajes
function cambiarTexto() {
    // Modificar el contenido HTML
    const contenido = document.getElementById("contenido");
    contenido.innerHTML = "<strong><em>Tremendo bigote</em></strong>";
};
// Asociar la función al botón
document.getElementById("boton1").addEventListener("click", cambiarTexto);