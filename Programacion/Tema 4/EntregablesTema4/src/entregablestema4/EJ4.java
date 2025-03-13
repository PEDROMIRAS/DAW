/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema4;

import java.util.Random;
import java.util.Scanner;

/***
 * Ejercicio 4
    Crea una funci�n que muestre por consola una serie de n�meros aleatorios enteros. Los
    par�metros de la funci�n ser�n: la cantidad de n�meros aleatorios que se mostrar�n y los
    valores m�nimos y m�ximos que estos pueden tomar.
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
