/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg5;

/***
 * Un centro de investigacion de la flor urbana necesita una aplicacion que muestre cual es el 
 * arbol mas alto. Para ello se introducirá por teclado la altura(en cm) de cada arbol(terminando
 * la introduccion de datos cuando se utilice -1 como altura).Los arboles se identifican mediante 
 * etiquetas con numeros correlativos, comenzando en 0. Diseñar una aplicacion que resuelva el 
 * problema planteado.
 * 
 */

/**
 *
 * @author pedromiras
 */

import java.util.Scanner;

public class EJ35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int etiqueta = 0;
        double alturaMaxima = -1;
        int etiquetaArbolMasAlto = -1;

        System.out.println("Introduce la altura de cada arbol en cm (usa -1 para terminar):");

        while (true) {
            System.out.print("Altura del arbol con etiqueta " + etiqueta + ": ");
            double altura = sc.nextDouble();

            // Verificar si el usuario desea terminar
            if (altura == -1) {
                break;
            }

            // Validar que la altura sea no negativa
            if (altura < 0) {
                System.out.println("La altura no puede ser negativa. Intentalo de nuevo.");
                continue;
            }

            // Determinar si este árbol es el más alto registrado
            if (altura > alturaMaxima) {
                alturaMaxima = altura;
                etiquetaArbolMasAlto = etiqueta;
            }

            etiqueta++; // Incrementar el identificador del siguiente árbol
        }

        if (etiquetaArbolMasAlto != -1) {
            System.out.println("\nEl arbol mas alto es el de etiqueta " + etiquetaArbolMasAlto +
                               " con una altura de " + alturaMaxima + " cm.");
        } else {
            System.out.println("No se han registrado arboles.");
        }

        sc.close();
    }
}
