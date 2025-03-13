/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg3;
/***
 * Crear un array de 10 espacios y aumentalo a 11 espacios. Cuando insertamos un nuevo valor no queremos 
 * que se inserte de 1 en 1.
 */
/**
 *
 * @author pedromiras
 */
public class EJ53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = {0,1,2,3,4,5,6,7,8,9};
        int numeros2[] = new int[11];
        
        for (int i = 0; i < 10; i++) {//numeros.length--> te devuelve el numero de espacios del array
            numeros2[i] = numeros[i];
        }
        
        numeros = numeros2;
        numeros2 = null;
        
        System.out.println(numeros);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    
}
