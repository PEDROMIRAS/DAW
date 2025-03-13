function ocultarDIV2() {
    document.getElementById('div1').style.display = 'none';
    document.getElementById('div2').style.display = 'block';
}
function ocultarDIV1() {
    document.getElementById('div1').style.display = 'block';
    document.getElementById('div2').style.display = 'none';
}

document.getElementById('boton1').addEventListener('click', ocultarDIV2);   
document.getElementById('boton2').addEventListener('click', ocultarDIV1);