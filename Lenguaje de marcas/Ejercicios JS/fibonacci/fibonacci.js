function fibonacci(n) {
  let secuencia = [0, 1];

    for (let i = 2; i < n; i++) {
        secuencia.push(secuencia[i - 1] + secuencia[i - 2]);
    }
    return secuencia;
}

let numeros = parseFloat(prompt("Ingrese el numero de elementos de la serie Fibonacci: "));

if(!isNaN(numeros) && numeros > 0){
  console.log("La serie Fibonacci de " + numeros + " elementos es: " + fibonacci(numeros));
}else{
    console.log("Ingrese un número válido");
}