/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
/**
 *
 * @author pedromiras
 */
public class ClasePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", 24, 1.65);
        Persona p2 = new Persona("Pedro", 29, 1.67);

        p1.imprimirNombre();
        p1.cumplirAnios();

        p2.imprimirNombre();
        p2.cumplirAnios();
       
        p2.esHoy(3);
       
    }
    
}
