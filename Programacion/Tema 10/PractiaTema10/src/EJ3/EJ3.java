/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * EJERCICIO 3
 * Este programa compara dos archivos de texto línea por línea y carácter por carácter.
 * Si encuentra una diferencia, muestra en qué línea y carácter ocurre.
 * También avisa si los archivos tienen diferente número de líneas.
 */

public class EJ3 {

    public static void main(String[] args) {
        String texto1 = "texto1.txt"; // Nombre del primer archivo
        String texto2 = "texto2.txt"; // Nombre del segundo archivo
        
        // try-with-resources: asegura que los archivos se cierran automáticamente
        try (BufferedReader bfr1 = new BufferedReader(new FileReader(texto1)); 
             BufferedReader bfr2 = new BufferedReader(new FileReader(texto2))) {
            
            String t1, t2; // Para guardar cada linea leida
            int numLinea = 1; // Contador de linea
            boolean sonIguales = true; // Bandera para saber si son iguales
            
            // Leer linea por linea mientras ambos archivos tengan contenido
            while ((t1 = bfr1.readLine()) != null && (t2 = bfr2.readLine()) != null) {
                if (!t1.equals(t2)) { // Si las lineas son distintas
                    int minLength = Math.min(t1.length(), t2.length()); // Longitud minima entre ambas lineas
                    
                    // Comparar caracter por caracter hasta encontrar la diferencia
                    for (int i = 0; i < minLength; i++) {
                        if (t1.charAt(i) != t2.charAt(i)) {
                            System.out.println("Diferencia en linea " + numLinea + ", caracter " + (i + 1));//se suma uno porque i  empieza en 0
                            System.out.println("Archivo 1: '" + t1.charAt(i) + "'");
                            System.out.println("Archivo 2: '" + t2.charAt(i) + "'");
                            sonIguales = false;
                            break; // Salir del bucle for
                        }
                    }

                    // Si no hubo diferencias pero las lineas tienen diferente longitud
                    if (sonIguales && t1.length() != t2.length()) {
                        System.out.println("Diferencia en linea: " + numLinea + ", caracter: " + (minLength + 1));
                        System.out.println("Archivo 1: " + (t1.length() > minLength ? "'" + t1.charAt(minLength) + "'" : "fin de linea"));
                        System.out.println("Archivo 2: " + (t2.length() > minLength ? "'" + t2.charAt(minLength) + "'" : "fin de linea"));
                        sonIguales = false;
                    }

                    if (!sonIguales) break; // Salir del while si ya se encontro una diferencia
                }
                numLinea++; // Pasar a la siguiente linea
            }

            // Si uno de los archivos tiene mas lineas que el otro
            if (sonIguales && (bfr1.readLine() != null || bfr2.readLine() != null)) {
                System.out.println("Los archivos tienen diferente numero de lineas.");
                System.out.println("La diferencia esta a partir de la linea " + numLinea);
            } else if (sonIguales) {
                System.out.println("Los archivos son identicos.");
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex); // Manejo de errores de lectura
        }
    }
}