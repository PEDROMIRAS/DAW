/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8.pkg4;

/**
 *
 * @author pedromiras
 */
public class Piano extends Instrumento{

    public Piano(String[] melodia) {
        super(melodia);
        for (String nota : melodia) {
            super.add(NotasMusicales.valueOf(nota)); // Convierte las notas a enum
        }
    }

    @Override
    public void interpretar() {
        System.out.print("Piano interpreta: ");
        for (NotasMusicales nota : melodia) {
            System.out.print(nota + " ");
        }
        System.out.println(); // Salto de línea al final
    }
    
}
