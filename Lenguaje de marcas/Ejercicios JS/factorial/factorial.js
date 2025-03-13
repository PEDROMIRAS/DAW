function calcularFactorial(numero) {
    let factorial = 1;
    for (let i = 1; i <= numero; i++) {
        factorial *= i;
    }
    return factorial;
}

let usuario = prompt("Introduce un número para calcular su factorial: ");

let numero = parseInt(usuario);

if(!isNaN(numero) && numero >= 0) {
    let factorial = calcularFactorial(numero);
    console.log(`El factorial de ${numero} es ${factorial}`);
}else {
    console.log("El número introducido no es válido");
}