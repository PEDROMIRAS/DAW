function esPrimo(numero){
    if(numero <= 1) return false;

    for(let i = 2; i < numero; i++){
        if(numero % i === 0) return false;
    }
    return true;
}

let inicio = parseFloat(prompt("Ingrese el número inicial: "));
let fin = parseFloat(prompt("Ingrese el número final: "));

console.log("Los números primos entre " + inicio + " y " + fin + " son: ");

for(let i = inicio; i <= fin; i++){
    if(esPrimo(i)){
        console.log(i);
    }
}