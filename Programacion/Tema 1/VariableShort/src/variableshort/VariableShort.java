/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package variableshort;
/**
 * Actividad 1.5
 * El tipo shot permite almacenar valores conprendidos entre -32768 y 32787.
 * Escribir un programa que compruebe que el rango de un tipo se comporta de manera
 * ciclica, es decir, el valor siguiente al maximo es el minimo.
 */
/**
 *
 * @author pedromiras
 */
public class VariableShort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short b=(short) 32767;
        System.out.println("El valor mas alto que comprende la variable short es: "+ b);
        
        System.out.println("El siguiente valor es: "+ ++b +" el mas pequeño.");
    }
    
}
