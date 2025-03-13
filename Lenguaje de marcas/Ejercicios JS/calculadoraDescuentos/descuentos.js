function calcularDescuento() {
    let precioBase = parseFloat(document.getElementById('precioBase').value);
    let porcentajeDescuento = parseFloat(document.getElementById('porcentajeDescuento').value);
    
    if (!isNaN(precioBase) && !isNaN(porcentajeDescuento) && precioBase > 0 && porcentajeDescuento >= 0 && porcentajeDescuento <= 100) {
        let descuento = (precioBase * porcentajeDescuento) / 100;
        let precioFinal = precioBase - descuento;
        document.getElementById('precioFinal').value = precioFinal.toFixed(2);
    } else {
        document.getElementById('precioFinal').value = "Entrada inválida";
    }
}

document.addEventListener("DOMContentLoaded", function() {
    document.getElementById('botonCalcular').addEventListener("click", calcularDescuento);
});
