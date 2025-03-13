// Version: 1.0
function mostrarTextoIngresado(){
    var texto = document.getElementById("textNombre").value;
    document.getElementById("div1").innerHTML ="<p>Hola, "+texto+"</p>";
}

document.getElementById("boton1").addEventListener("click", mostrarTextoIngresado);