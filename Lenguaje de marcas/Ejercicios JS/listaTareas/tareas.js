let textoTarea = document.getElementById('entradaTarea');
let botonAgregar = document.getElementById('botonAgregar');
let listaTareas = document.getElementById('listaTareas');

function agregarTarea() {
  let textoTarea = entradaTarea.value;

  if (textoTarea) {
    let elementoTarea = document.createElement('li');
    elementoTarea.textContent = textoTarea;

    let botonEliminar = document.createElement('button');
    botonEliminar.textContent = 'X';

    botonEliminar.addEventListener('click', () => {
      elementoTarea.remove();
    });

    botonEliminar.classList.add('botonEliminar');  
    elementoTarea.appendChild(botonEliminar);

    elementoTarea.addEventListener('click', () => {
      elementoTarea.style.color = 'red';
    });
    
    listaTareas.appendChild(elementoTarea);
    entradaTarea.value = '';
  }
}

botonAgregar.addEventListener('click', agregarTarea);

document.addEventListener('DOMContentLoaded', () => {
    let botonTema = document.getElementById('botonTema');

    if (localStorage.getItem('tema') === 'oscuro') {
        document.body.classList.add('dark-mode');
        botonTema.textContent = 'Modo Claro';
    }

    // Evento para cambiar de tema
    botonTema.addEventListener('click', () => {
        document.body.classList.toggle('dark-mode');
        
        if (document.body.classList.contains('dark-mode')) {
            localStorage.setItem('tema', 'oscuro');
            botonTema.textContent = 'Modo Claro';
        } else {
            localStorage.setItem('tema', 'claro');
            botonTema.textContent = 'Modo Oscuro';
        }
    });
});