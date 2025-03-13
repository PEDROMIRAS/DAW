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
        // Crear un objeto Texto con una longitud m�xima de 50 caracteres
        Texto miTexto = new Texto(50);

        // A�adir caracteres individuales al texto
        miTexto.anadirCaracter('H', false);
        miTexto.anadirCaracter('o', false);
        miTexto.anadirCaracter('l', false);
        miTexto.anadirCaracter('a', false);

        // A�adir una cadena al final
        miTexto.anadirTexto(" Mundo", false);

        // A�adir una cadena al inicio
        miTexto.anadirTexto("Bienvenido! ", true);

        // Mostrar la informaci�n del objeto Texto
        miTexto.mostrarInformacion();
    }
    
}
