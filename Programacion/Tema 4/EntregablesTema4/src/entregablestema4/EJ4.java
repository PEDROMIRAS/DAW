/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema4;

import java.util.Random;
import java.util.Scanner;

/***
 * Ejercicio 4
    Crea una función que muestre por consola una serie de números aleatorios enteros. Los
    parámetros de la función serán: la cantidad de números aleatorios que se mostrarán y los
    valores mínimos y máximos que estos pueden tomar.
 */
/**
 *
 * @author pedromiras
 */
public class EJ4 {
    public static void numAleatorios(int cantidad, int min, int max){
        Random random = new Random();
        
        for (int i = 0; i < cantidad; i++) {
            int numRandom = random.nextInt((max - min) + 1) + min;
            System.out.println(numRandom);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros aleatorios a generar: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el valor minimo: ");
        int min = sc.nextInt();

        System.out.print("Ingrese el valor maximo: ");
        int max = sc.nextInt();
        
        numAleatorios(cantidad, min, max);
    }
    
}
