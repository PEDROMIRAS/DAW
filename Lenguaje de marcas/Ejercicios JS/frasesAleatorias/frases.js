let frasesInformatica = [
    "La informática es la ciencia que estudia el tratamiento automático de la información.",
    "La programacion es el arte de crear programas de computadora.","El codigo es el lenguaje de los programadores.",
    "La informatica es una disciplina que se encarga del tratamiento automatico de la informacion.",
    "Los programadores son los creadores de las aplicaciones que usamos a diario."
];

function fraseAleatoria(){
    let indice = Math.floor(Math.random() * frasesInformatica.length);
    let texto = document.getElementById("texto-informatica");

    texto.textContent = frasesInformatica[indice];
};

document.addEventListener("DOMContentLoaded", function(){
    var boton = document.getElementById("ver-mas");
    boton.addEventListener("click", fraseAleatoria);
});