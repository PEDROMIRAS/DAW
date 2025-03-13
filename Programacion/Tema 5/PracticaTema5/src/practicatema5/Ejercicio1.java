/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicatema5;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Ejercicio 1
    Realiza la funci�n: int [] buscarTodos(int t[], int clave), que crea y devuelve un array con todos
    los �ndices de los elementos donde se encuentra la clave de b�squeda. En el caso de que clave
    no se encuentre en el array t, la funci�n devolver� un array vac�o.
 */
/**
 *
 * @author pedromiras
 */

public class Ejercicio1 {
    public static int[] buscarTodos(int arrayBase[], int clave) {
        // Primero contamos cu�ntas veces aparece la clave
        int contador = 0;
        for (int num : arrayBase) {
            if (num == clave) {
                contador++;
            }
        }

        // Si no se encontr� la clave, devolvemos un array vac�o
        if (contador == 0) {
            return new int[0];
        }

        // Creamos el array con el tama�o exacto
        int[] arrayClave = new int[contador];
        int index = 0;

        // Llenamos el array con los �ndices donde aparece la clave
        for (int i = 0; i < arrayBase.length; i++) {
            if (arrayBase[i] == clave) {
                arrayClave[index++] = i;
            }
        }

        return arrayClave;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arrayBase[] = {1, 2, 2, 3, 45, 5, 6, 6, 7, 7, 8, 8};

        System.out.print("Indique el numero a buscar en el array: ");
        int clave = sc.nextInt();

        int[] resultado = buscarTodos(arrayBase, clave);

        // Mostramos el resultado
        System.out.println("Indices encontrados: " + Arrays.toString(resultado));

        sc.close(); // Cerramos el scanner
    }
}

