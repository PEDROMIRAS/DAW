/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg16;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Diseñar una aplicación para gestionar un campamento de programación, donde se introduce la puntuación (enteros) 
 * obtenida por 5 programadores, conforme van terminando su prueba. La aplicación debe mostrar las puntuaciones 
 * ordenadas de los 5 participantes. En ocasiones, cuando finalizan los 5 participantes anteriores, se suman al campeonato
 * de programadores de exhibición, cuyos puntos se incluyen con el resto. La forma de especificar que no intervienen más 
 * programadores de exhibición es introducir como puntuación un -1. La aplicación debe mostrar, finalmente, los puntos 
 * ordenados de todos los participantes.
 */
/**
 *
 * @author pedromiras
 */
public class EJ516 {

    public static int[] insertarProgramadores(int[] programadores) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < programadores.length; i++) {
            System.out.printf("Puntuacion del programador %d: ", i + 1);
            programadores[i] = sc.nextInt();
        }
        return programadores;
    }

    public static int[] insertarExhibicion(int[] programadores) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte la puntuacion del programador de exhibicion (-1 para terminar):");
        int pExhibicion = sc.nextInt();

        while (pExhibicion != -1) {
            // Actualizar el array con la nueva puntuación
            programadores = insercionOrdenada(programadores, pExhibicion);
            System.out.println("Inserte la puntuaci0n del programador de exhibicion (-1 para terminar):");
            pExhibicion = sc.nextInt();
        }

        return programadores;
    }

    public static int[] insercionOrdenada(int[] programadores, int pExhibicion) {
        // Crear un nuevo array con espacio para un elemento adicional
        int[] arrayAux = new int[programadores.length + 1];

        // Buscar la posición donde insertar el nuevo elemento
        int indiceBusqueda = Arrays.binarySearch(programadores, pExhibicion);
        if (indiceBusqueda < 0) {
            indiceBusqueda = -indiceBusqueda - 1;
        }

        // Copiar los elementos hasta la posición de inserción
        System.arraycopy(programadores, 0, arrayAux, 0, indiceBusqueda);

        // Insertar el nuevo elemento
        arrayAux[indiceBusqueda] = pExhibicion;

        // Copiar los elementos restantes
        System.arraycopy(programadores, indiceBusqueda, arrayAux, indiceBusqueda + 1, programadores.length - indiceBusqueda);

        return arrayAux;
    }

    public static void main(String[] args) {
        int[] programadores = new int[5];

        // Insertar puntuaciones iniciales
        System.out.println("Inserte las puntuaciones de los programadores iniciales:");
        programadores = insertarProgramadores(programadores);
        Arrays.sort(programadores);

        System.out.println("Puntuaciones iniciales ordenadas:");
        System.out.println(Arrays.toString(programadores));

        // Agregar puntuaciones de exhibición
        programadores = insertarExhibicion(programadores);

        // Mostrar puntuaciones finales ordenadas
        System.out.println("Puntuaciones finales ordenadas:");
        System.out.println(Arrays.toString(programadores));
    }
}