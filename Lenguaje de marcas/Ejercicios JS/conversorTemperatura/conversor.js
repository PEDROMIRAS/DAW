function celsiusToFahrenheit(celsius) {
  return celsius * 9/5 + 32;
}

function fahrenheitToCelsius(fahrenheit) {
  return (fahrenheit - 32) * 5/9;
}

function temperaturaConversor(){
    let opcion = prompt("¿Qué conversión deseas hacer? \n 1. Celsius a Fahrenheit \n 2. Fahrenheit a Celsius");

    opcion = parseInt(opcion);

    let temperatura = prompt("Introduce la temperatura a convertir");
    temperatura = parseInt(temperatura);

    let resultado;

    if(opcion === 1){
        resultado = celsiusToFahrenheit(temperatura);
        alert(`${temperatura} grados Celsius son ${resultado} grados Fahrenheit`);
    }else {
        resultado = fahrenheitToCelsius(temperatura);
        alert(`${temperatura} grados Fahrenheit son ${resultado} grados Celsius`);
    }
}

temperaturaConversor();