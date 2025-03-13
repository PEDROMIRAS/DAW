var vValor1     = 0;
var vValor2     = 0;
var bNuevovalor = false;
var vOperacion  = '';
var historial = [];//Ar

function depurando(title){
    console.log(title+' >>');
    console.log('   v1:'+vValor1+' op:'+vOperacion+' v2:'+vValor2);
}

function inicializa(bMuestra){
    vValor1 = 0;
    vValor2 = 0;
    vOperacion = '';
    bNuevovalor = false;
    if (bMuestra) muestra_valor(0);    
};

function resuelve(last_operador){
    var resultado = 0;
    depurando('a resolver ('+last_operador+')');        
    switch (vOperacion){
        case '+': resultado = vValor1 + vValor2; break;
        case '-': resultado = vValor1 - vValor2; break;
        case '*': resultado = vValor1 * vValor2; break;
        case '/': resultado = vValor1 / vValor2; break;
        case '^': resultado = Math.pow(vValor1, vValor2); break;
        default : resultado = -1.1;
    };

    // Guardar en historial
    var operacionCompleta = `${vValor1} ${vOperacion} ${vValor2} = ${resultado}`;
    historial.push(operacionCompleta);
    
    vValor1 = resultado; //Guardar el resultado en el valor 1 para seguir operando con el 
    bNuevovalor = false; 
    return resultado;
};

function muestra_valor(valor_a_mostrar){
    var display = document.getElementById('visor');
    console.log('mostrar: '+valor_a_mostrar);
    display.value = valor_a_mostrar;
};

function pulsa_nu(valor_nu){
    console.log('pulsado_nu: '+valor_nu);
    if (bNuevovalor){
        vValor2 = (vValor2*10)+parseInt(valor_nu);
        muestra_valor(vValor2);
    } else {
        vValor1 = (vValor1*10)+parseInt(valor_nu);
        muestra_valor(vValor1);
    }
};

function pulsa_op(operacion) {
    var resultado = 0;

    if (operacion == 'C') {
        inicializa(true);
    } else if (operacion == '=') {
        resultado = resuelve(operacion);
        muestra_valor(resultado);
        vOperacion = ''; // **Limpia la operación para evitar cálculos automáticos**
        bNuevovalor = true; // **Indica que un nuevo número debe ingresarse**
    } else if (operacion == '√') {
        resultado = Math.sqrt(vValor1);
        muestra_valor(resultado);
        vValor1 = resultado;
        vOperacion = ''; // **Evita que la raiz se combine con una operación anterior**
        bNuevovalor = true;
    } else {
        if (vOperacion != '' && bNuevovalor) {
            resultado = resuelve(operacion);
            muestra_valor(resultado);
        }
        vOperacion = operacion;
        bNuevovalor = true;
        vValor2 = 0;
    }
}

function mostrarHistorial() {//Funcion para mostrar el historial de operaciones con un alert
    if (historial.length === 0) {
        alert("No hay operaciones en el historial.");
    } else {
        alert("Historial de operaciones:\n" + historial.join("\n"));
    }
}