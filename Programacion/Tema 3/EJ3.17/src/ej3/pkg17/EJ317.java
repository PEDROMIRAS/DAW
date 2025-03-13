/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg17;

/**
 *
 * @author pedromiras
 */
public class EJ317 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Primer bucle: recorre los números del 1 al 10 (tablas)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");
            
            // Segundo bucle: recorre los números del 1 al 10 (multiplicadores)
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            // Línea en blanco para separar las tablas
            System.out.println();
        }
        
    }
    
}
