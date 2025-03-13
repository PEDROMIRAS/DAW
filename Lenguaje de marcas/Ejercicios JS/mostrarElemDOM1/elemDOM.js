const box = document.getElementById('box');
const toggle = document.getElementById('toggleBtn');

function toggleBox(){
    if(box.style.display === 'none'){
        box.style.display = 'block';
        toggle.textContent = 'Ocultar';
    }else{
        box.style.display = 'none';
        toggle.textContent = 'Mostrar';
    }
}

toggle.addEventListener('click', toggleBox);