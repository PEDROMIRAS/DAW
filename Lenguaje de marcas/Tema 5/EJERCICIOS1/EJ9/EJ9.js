// Función para mostrar el texto ingresado y cambiar la vista
function mostrarTextoIngresado(){
    var texto = document.getElementById("textNombre").value;
    document.getElementById("nombreMostrado").innerHTML ="<h1> "+texto+"</h1>";
    document.getElementById('div1').style.display = 'none';
    document.getElementById('div2').style.display = 'block';
}
// Función para regresar al formulario
function regresarAlFormulario() {
    document.getElementById('textNombre').value = null;
    document.getElementById('div1').style.display = 'block';
    document.getElementById('div2').style.display = 'none';
}

// Asignar eventos a los botones
document.getElementById('boton1').addEventListener('click', mostrarTextoIngresado);
document.getElementById('boton2').addEventListener('click', regresarAlFormulario);
