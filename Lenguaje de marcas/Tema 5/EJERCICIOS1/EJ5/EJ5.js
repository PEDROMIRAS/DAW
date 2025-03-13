function cambiarTextoImagen() {
    // Modificar el contenido HTML
    const contenido = document.getElementById("contenido");
    contenido.innerHTML = `
        <img src="fotoCampoLopez4-min.jpg" alt="Moto" style="max-width: 100%; height: auto;">
    `;
};
// Asociar la función al botón
document.getElementById("boton1").addEventListener("click", cambiarTextoImagen);