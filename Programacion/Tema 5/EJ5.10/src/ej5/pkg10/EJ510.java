/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * EJ10 Escribir la funcion int [] rellenarPares(int longitud, int fin), que crea y devuelve un array
 * ordenado de la funcion especficada, que se encuentra rellenado con numeros pares aleatorios
 * comprendidos en el rango de 2 hasta fin (inclusive).
 */
public class EJ510 {

    public static int[] rellenarPares(int longitud, int fin) {
        // Crear el array para almacenar los números pares
        int[] pares = new int[longitud];
        Random random = new Random();
        int contador = 0;

        while (contador < longitud) {
            int numRandom = random.nextInt((fin + 1)) ; // Generar un número par entre 2 y fin
            
            if (numRandom%2==0) {
                pares[contador] = numRandom;
                contador++;
            }

        }
        
        Arrays.sort(pares);
        return pares;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la longitud del array al usuario
        System.out.print("Introduce el numero de numeros a generar: ");
        int longitud = sc.nextInt();

        // Solicitar el valor máximo del rango
        System.out.print("Introduce el numero maximo: ");
        int fin = sc.nextInt();

        // Generar el array y mostrarlo
        int[] resultado = rellenarPares(longitud, fin);
        System.out.println("Array de numeros pares generados: " + Arrays.toString(resultado));
    }
}