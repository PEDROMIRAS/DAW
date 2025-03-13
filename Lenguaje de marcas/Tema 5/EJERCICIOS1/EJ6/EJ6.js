function cambiarTextoImagen() {
    // Modificar el contenido HTML
    const contenido = document.getElementById("contenido");
    contenido.innerHTML = `
        <img src="fotoCampoLopez4-min.jpg" alt="Moto" style="max-width: 100%; height: auto;">
    `;
};
function cambiarImagenImagen() {
    // Modificar el contenido HTML
    const contenido = document.getElementById("contenido");
    contenido.innerHTML = `
        <img src="B9B0E65F-D910-44A5-BF63-82CBAF1E4060_1_105_c.jpeg" alt="Moto" style="max-width: 100%; height: auto;">
    `;
};
// Asociar la función al botón
document.getElementById("boton1").addEventListener("click", cambiarTextoImagen);
document.getElementById("boton2").addEventListener("click", cambiarImagenImagen);