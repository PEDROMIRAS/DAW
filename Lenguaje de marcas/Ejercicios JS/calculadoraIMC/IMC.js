 document.getElementById("calcularBtn").addEventListener("click", function() {
            let peso = parseFloat(document.getElementById("peso").value);
            let altura = parseFloat(document.getElementById("altura").value);
            
            if (isNaN(peso) || isNaN(altura) || peso <= 0 || altura <= 0) {
                document.getElementById("resultado").textContent = "Por favor, introduce valores válidos.";
                return;
            }
            
            let imc = peso / (altura * altura);
            let mensaje = "Tu IMC es: " + imc.toFixed(2) + " - ";
            
            if (imc < 18.5) {
                mensaje += "Peso insuficiente";
            } else if (imc < 24.9) {
                mensaje += "Peso normal";
            } else if (imc < 26.9) {
                mensaje += "Sobrepeso grado I";
            } else if (imc < 29.9) {
                mensaje += "Sobrepeso grado II";
            } else {
                mensaje += "Obesidad";
            }
            
            document.getElementById("resultado").textContent = mensaje;
        });