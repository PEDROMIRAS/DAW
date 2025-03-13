function calculoEdad() {
 let edadPerro = parseFloat(document.getElementById('edadPerro').value);
            
    if (isNaN(edadPerro) || edadPerro <= 0) {
        document.getElementById('resultado').textContent = "Introduce una edad válida.";
        return;
    }

    let edadCanina = edadPerro * 7;
    document.getElementById('resultado').textContent = edadCanina;
}

document.getElementById('btn-Calcular').addEventListener('click', calculoEdad);