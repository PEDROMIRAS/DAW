const pantalla = document.getElementById('pantalla');

    function agregarValor(valor) {
      pantalla.value += valor;
    }

    function limpiarPantalla() {
      pantalla.value = '';
    }

    function calcularResultado() {
      try {
        pantalla.value = eval(pantalla.value);
      } catch {
        pantalla.value = 'Error';
      }
    }