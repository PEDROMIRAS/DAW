/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg7;

import Textos.Texto;

/**
 *
 * @author pedromiras
 */
public class EJ67 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto Texto con una longitud máxima de 50 caracteres
        Texto miTexto = new Texto(50);

        // Añadir caracteres individuales al texto
        miTexto.anadirCaracter('H', false);
        miTexto.anadirCaracter('o', false);
        miTexto.anadirCaracter('l', false);
        miTexto.anadirCaracter('a', false);

        // Añadir una cadena al final
        miTexto.anadirTexto(" Mundo", false);

        // Añadir una cadena al inicio
        miTexto.anadirTexto("Bienvenido! ", true);

        // Mostrar la información del objeto Texto
        miTexto.mostrarInformacion();
    }
    
}
