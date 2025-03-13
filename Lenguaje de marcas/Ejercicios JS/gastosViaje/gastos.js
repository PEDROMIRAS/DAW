function calcularGastos(){
    let alojamientos = parseFloat(document.getElementById("alojamientos").value) || 0;
    let comidas = parseFloat(document.getElementById("comidas").value) || 0;
    let entretenimiento = parseFloat(document.getElementById("entretenimiento").value) || 0;

    let costeTotal = alojamientos + comidas + entretenimiento;
    document.getElementById("resultado").textContent = "El coste total del viaje ha sido de " + costeTotal.toFixed(2) + " euros.";
}

document.getElementById("calcularBtn").addEventListener("click", calcularGastos);
