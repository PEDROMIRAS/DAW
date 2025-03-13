// Variables que almacenan el estado actual de la calculadora
let entradaActual = ''; // Número actual ingresado
let entradaAnterior = ''; // Número ingresado anteriormente
let operador = null; // Operador seleccionado (+, -, *, /)

// Agrega un evento 'click' a todos los botones con la clase 'boton'
document.querySelectorAll('.boton').forEach(boton => {
    boton.addEventListener('click', ()=>manejarClicBoton(boton.dataset.valor));
});
// Función principal para manejar los clics de los botones
function manejarClicBoton(valor) {
    if (!isNaN(valor)) {
        // Si el valor es un número, lo agrega al número actual
        agregarNumero(valor);
    } else if (valor === 'C') {
        // Si el valor es 'C', limpia la pantalla
        limpiarPantalla();
    } else if (valor === '=') {
        // Si el valor es '=', realiza el cálculo
        calcular();
    } else {
        // Si es un operador (+, -, *, /), lo establece como el operador actual
        establecerOperador(valor);
    }
}

// Agrega el número seleccionado a la entrada actual
function agregarNumero(numero) {
    entradaActual += numero; // Concatena el número al número actual
    actualizarPantalla(entradaActual); // Actualiza la pantalla con el nuevo valor
}

// Establece el operador para la operación actual
function establecerOperador(op) {
    if (entradaActual === '') return; // No hace nada si no hay un número actual
    if (operador !== null) calcular(); // Si ya hay un operador, realiza el cálculo
    operador = op; // Establece el operador actual
    entradaAnterior = entradaActual; // Guarda el número actual como el anterior
    entradaActual = ''; // Limpia la entrada actual para el siguiente número
}

// Realiza el cálculo según el operador y los números ingresados
function calcular() {
    if (operador === null || entradaActual === '' || entradaAnterior === '') return;
    const anterior = parseFloat(entradaAnterior); // Convierte la entrada anterior a número
    const actual = parseFloat(entradaActual); // Convierte la entrada actual a número
    let resultado;

    // Realiza la operación según el operador
    switch (operador) {
        case '+':
            resultado = anterior + actual;
            break;
        case '-':
            resultado = anterior - actual;
            break;
        case '*':
            resultado = anterior * actual;
            break;
        case '/':
            resultado = actual !== 0 ? anterior / actual : 'Error'; // Maneja división por cero
            break;
        default:
            return;
    }

    entradaActual = resultado.toString(); // Convierte el resultado a cadena para mostrarlo
    operador = null; // Resetea el operador
    entradaAnterior = ''; // Limpia la entrada anterior
    actualizarPantalla(entradaActual); // Actualiza la pantalla con el resultado
}

// Limpia la pantalla y reinicia todas las variables
function limpiarPantalla() {
    entradaActual = ''; // Limpia la entrada actual
    entradaAnterior = ''; // Limpia la entrada anterior
    operador = null; // Resetea el operador
    actualizarPantalla(''); // Limpia la pantalla
}

// Actualiza el valor mostrado en la pantalla de la calculadora
function actualizarPantalla(valor) {
    document.getElementById('pantalla').value = valor; // Asigna el valor al elemento de pantalla
}