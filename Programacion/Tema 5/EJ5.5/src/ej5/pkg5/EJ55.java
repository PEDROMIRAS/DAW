/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg5;
/***
 * Ejercicio 5:
 * Crea un array de longitud 10 que se inicializara con numeros aleatorios comprendidos entre 1 y 100.
 * Mostrar la suma de todos los numeros aleatorios que se guardan en el array.
 */
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author pedromiras
 */
public class EJ55 {
    public static void sumaArray(int numeros[]){
        Random random = new Random();
        int sumaRandom=0;
        for (int i = 0; i < numeros.length; i++) {
            int numRandom = random.nextInt((99)+1);
            sumaRandom+=numRandom;
        }
        System.out.println("La suma es: "+sumaRandom);
    }
    public static void rellenarArray(int numeros[]){
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            int numRandom = random.nextInt((99)+1);
            numeros[i]=numRandom;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeros[] = new int[10];
        
        rellenarArray(numeros);
        System.out.println(Arrays.toString(numeros));
        sumaArray(numeros);
    }
    
}
