/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg19;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * El "numero de la suerte" de una persona puede clacularse a partir de sus numeros favoritos
 * De entre estos, se eleccionan dos diferentes al azar, y se eliminanran de las lista, pero 
 * en su lugar se añade la media aritmetica de los eliminados de la lista de numeros favoritos.
 * El proceso se repite hasta que solo quede un numero, que resultara el numero de la suerte 
 * para esa persona. Para calcular bien el numero de la suerte es impresindible que la lista 
 * de numeros se encuentre siempre ordenada. Escribe una aplicacion que solidite al usuario 
 * sus numeros favoritos y calcula su numero de la suerte.
 * 
 * Investigar como comparar dos arrays, para ver si son iguales.
 * 
/**
 *
 * @author pedromiras
 */

public class EJ519 {
    
    // Función para rellenar un array con un rango de números
    public static int[] rellenarArray(int num1, int num2) {
        // Asegurar que num1 es menor o igual a num2 para simplificar el rango
        int inicio = Math.min(num1, num2);
        int fin = Math.max(num1, num2);

        // Calcular la longitud del array
        int longitud = fin - inicio + 1;

        // Crear y rellenar el array
        int[] arrayRango = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            arrayRango[i] = inicio + i;
        }

        return arrayRango;
    }

    // Función para calcular el "número de la suerte"
    public static int[] eliminarRandomAnadirMedia(int[] arrayBase) {
        Random random = new Random();

        while (arrayBase.length > 1) {
            // Seleccionar dos índices diferentes al azar
            int index1 = random.nextInt(arrayBase.length);
            int index2;
            do {
                index2 = random.nextInt(arrayBase.length);
            } while (index1 == index2);

            // Ordenar índices para evitar errores de eliminación
            int menor = Math.min(index1, index2);
            int mayor = Math.max(index1, index2);

            // Obtener los números seleccionados y calcular la media
            int num1 = arrayBase[menor];
            int num2 = arrayBase[mayor];
            int media = (num1 + num2) / 2;

            // Crear un nuevo array sin los números seleccionados
            int[] nuevoArray = new int[arrayBase.length - 1];
            int k = 0;

            for (int i = 0; i < arrayBase.length; i++) {
                if (i != menor && i != mayor) {
                    nuevoArray[k++] = arrayBase[i];
                }
            }

            // Añadir la media al nuevo array
            nuevoArray[k] = media;

            // Ordenar el array actualizado
            Arrays.sort(nuevoArray);
            arrayBase = nuevoArray;
        }

        return arrayBase;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.printf("Inserte un número favorito: ");
        int num1 = sc.nextInt();
        System.out.printf("Inserte otro número favorito: ");
        int num2 = sc.nextInt();

        // Rellenar el array con el rango y calcular el número de la suerte
        int[] arrayRango = rellenarArray(num1, num2);
        int[] resultado = eliminarRandomAnadirMedia(arrayRango);

        // Mostrar el resultado
        System.out.println("Tu número de la suerte es: " + Arrays.toString(resultado));
    }
}