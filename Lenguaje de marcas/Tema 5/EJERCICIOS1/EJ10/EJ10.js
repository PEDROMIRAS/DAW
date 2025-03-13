function recogerNumero(){
    let numero = document.getElementById("textNumero").value;
    let sumaNumero = parseInt(numero) + 1;
    alert("El número ingresado es: " + sumaNumero);
}
document.getElementById("boton1").addEventListener("click", recogerNumero);