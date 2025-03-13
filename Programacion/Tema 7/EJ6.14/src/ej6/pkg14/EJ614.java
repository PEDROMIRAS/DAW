/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg14;

import java.util.Arrays;

/***
 * Ejercicio 14
 * Implementar el m�todo no est�tico:
 * void insertarFinal(int nuevo)
 * que inserta un n�mero entero al final de tablaEnteros[], que es un atributo no est�tico de la
 * clase Main. Escribir un programa que inicialice el array con los n�meros del 1 al 10 y despu�s lo
 * muestre por consola.
 */
/**
 *
 * @author pedromiras
 */
public class EJ614 {
    int tablaEnteros[] = new int[0];
    public void insertarFinal(int num){
        this.tablaEnteros = Arrays.copyOf(this.tablaEnteros, this.tablaEnteros.length+1);
        this.tablaEnteros[this.tablaEnteros.length-1] = num;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       EJ614 m = new EJ614();
       
        for (int i = 0; i < 10; i++) {
            m.insertarFinal(i);
        }
        
        System.out.println("Array: "+Arrays.toString(m.tablaEnteros));
       
    }
    
}
