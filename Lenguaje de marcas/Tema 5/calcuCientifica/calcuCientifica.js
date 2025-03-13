// Variables que almacenan los valores de entrada y el operador seleccionado
let entradaActual = ''; // Número actual ingresado
let entradaAnterior = ''; // Número ingresado anteriormente
let operador = null; // Operador seleccionado (+, -, *, /, ^)

// Agrega un evento 'click' a todos los botones de la calculadora
// Cada botón tiene un valor asociado en "data-valor"
document.querySelectorAll('.boton').forEach(boton => {
    boton.addEventListener('click', () => manejarClicBoton(boton.dataset.valor));
});

// Función que maneja los clics en los botones de la calculadora
function manejarClicBoton(valor) {
    if (!isNaN(valor)) { // Si el valor es un número
        agregarNumero(valor);
    } else if (valor === 'C') { // Si es 'C', se limpia la pantalla
        limpiarPantalla();
    } else if (valor === '=') { // Si es '=', se calcula el resultado
        calcular();
    } else { // Si es otro, se maneja como operación especial o científica
        manejarOperacionesEspeciales(valor);
    }
}

// Agrega el número seleccionado a la entrada actual
function agregarNumero(numero) {
    entradaActual += numero; // Concatena el número al valor actual
    actualizarPantalla(entradaActual); // Actualiza la pantalla
}

// Maneja operadores básicos y funciones científicas
function manejarOperacionesEspeciales(op) {
    if (['+', '-', '*', '/', '^'].includes(op)) {
        establecerOperador(op); // Si es operador básico o potencia, lo asigna
    } else {
        realizarOperacionCientifica(op); // Si es una función científica, la ejecuta
    }
}

// Establece el operador matemático para la operación actual
function establecerOperador(op) {
    if (entradaActual === '') return; // No hace nada si no hay número ingresado
    if (operador !== null) calcular(); // Si ya hay un operador, realiza el cálculo anterior
    operador = op; // Guarda el operador
    entradaAnterior = entradaActual; // Guarda el número actual como anterior
    entradaActual = ''; // Limpia la entrada actual para el próximo número
}

// Realiza la operación matemática según el operador seleccionado
function calcular() {
    if (!operador || entradaActual === '' || entradaAnterior === '') return;
    const anterior = parseFloat(entradaAnterior);
    const actual = parseFloat(entradaActual);
    let resultado;

    // Ejecuta la operación correspondiente
    switch (operador) {
        case '+': resultado = anterior + actual; break;
        case '-': resultado = anterior - actual; break;
        case '*': resultado = anterior * actual; break;
        case '/': resultado = actual !== 0 ? anterior / actual : 'Error'; break; // Manejo de división por 0
        case '^': resultado = Math.pow(anterior, actual); break; // Cálculo de potencia
        default: return;
    }

    entradaActual = resultado.toString(); // Convierte el resultado en texto
    operador = null;
    entradaAnterior = '';
    actualizarPantalla(entradaActual); // Muestra el resultado en pantalla
}

// Realiza operaciones científicas como seno, coseno, logaritmo, etc.
function realizarOperacionCientifica(op) {
    if (entradaActual === '' && op !== 'pi') return; // No ejecutar si no hay número (excepto para π)
    let resultado;
    const num = parseFloat(entradaActual);

    switch (op) {
        case 'sqrt': resultado = Math.sqrt(num); break; // Raíz cuadrada
        case 'log': resultado = Math.log10(num); break; // Logaritmo base 10
        case 'sin': resultado = Math.sin(num * Math.PI / 180); break; // Seno en grados
        case 'cos': resultado = Math.cos(num * Math.PI / 180); break; // Coseno en grados
        case 'tan': resultado = Math.tan(num * Math.PI / 180); break; // Tangente en grados
        case 'pi': resultado = Math.PI; break; // Valor de π
        case 'factorial': resultado = factorial(num); break; // Factorial de un número
        default: return;
    }

    entradaActual = resultado.toString(); // Convierte el resultado en texto
    actualizarPantalla(entradaActual); // Muestra el resultado en pantalla
}

// Calcula el factorial de un número de forma iterativa
function factorial(n) {
    if (n < 0) return 'Error'; // No se puede calcular factorial de negativos
    if (n === 0 || n === 1) return 1; // Factorial de 0 y 1 es 1
    let res = 1;
    for (let i = 2; i <= n; i++) {
        res *= i;
    }
    return res;
}

// Limpia la pantalla y reinicia las variables
function limpiarPantalla() {
    entradaActual = '';
    entradaAnterior = '';
    operador = null;
    actualizarPantalla(''); // Borra el contenido de la pantalla
}

// Actualiza el contenido de la pantalla de la calculadora
function actualizarPantalla(valor) {
    document.getElementById('pantalla').value = valor;
}
