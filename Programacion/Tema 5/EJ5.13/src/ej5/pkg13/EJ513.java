
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg13;

/***
 * Implementar la funcion: int[] sinRepetidos(int t[]) que construye y devuelve un array de la
 * longitud apropiada, con elementos de t, donde se han eliminado los datos repetidos
 */

import java.util.Arrays;

public class EJ513 {
    public static int[] sinRepetidos(int array1[]) {
        // Array auxiliar para almacenar los elementos únicos
        int[] arrayAux = new int[array1.length];
        int tamaño = 0;

        // Recorrer el array original
        for (int i = 0; i < array1.length; i++) {
            boolean repetido = false;

            // Verificar si el elemento ya está en el array auxiliar
            for (int j = 0; j < tamaño; j++) {
                if (array1[i] == arrayAux[j]) {
                    repetido = true;
                    break;
                }
            }

            // Si no está repetido, agregar al auxiliar
            if (!repetido) {
                arrayAux[tamaño] = array1[i];
                tamaño++;
            }
        }

        // Usar Arrays.copyOf para devolver un array con la longitud exacta
        return Arrays.copyOf(arrayAux, tamaño);
    }

    public static void main(String[] args) {
        int[] array1 = {12, 23, 12, 45, 3, 3, 4, 5, 5};

        // Llamar a la función para eliminar repetidos
        int[] arraySinRepetidos = sinRepetidos(array1);

        // Mostrar el resultado
        System.out.println(Arrays.toString(arraySinRepetidos));
    }
}