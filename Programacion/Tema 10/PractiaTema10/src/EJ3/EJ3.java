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
            
            String t1, t2; // Para guardar cada línea leída
            int numLinea = 1; // Contador de línea
            boolean sonIguales = true; // Bandera para saber si son iguales
            
            // Leer línea por línea mientras ambos archivos tengan contenido
            while ((t1 = bfr1.readLine()) != null && (t2 = bfr2.readLine()) != null) {
                if (!t1.equals(t2)) { // Si las líneas son distintas
                    int minLength = Math.min(t1.length(), t2.length()); // Longitud mínima entre ambas líneas
                    
                    // Comparar carácter por carácter hasta encontrar la diferencia
                    for (int i = 0; i < minLength; i++) {
                        if (t1.charAt(i) != t2.charAt(i)) {
                            System.out.println("Diferencia en línea " + numLinea + ", carácter " + (i + 1));
                            System.out.println("Archivo 1: '" + t1.charAt(i) + "'");
                            System.out.println("Archivo 2: '" + t2.charAt(i) + "'");
                            sonIguales = false;
                            break; // Salir del bucle for
                        }
                    }

                    // Si no hubo diferencias pero las líneas tienen diferente longitud
                    if (sonIguales && t1.length() != t2.length()) {
                        System.out.println("Diferencia en línea: " + numLinea + ", carácter: " + (minLength + 1));
                        System.out.println("Archivo 1: " + (t1.length() > minLength ? "'" + t1.charAt(minLength) + "'" : "fin de línea"));
                        System.out.println("Archivo 2: " + (t2.length() > minLength ? "'" + t2.charAt(minLength) + "'" : "fin de línea"));
                        sonIguales = false;
                    }

                    if (!sonIguales) break; // Salir del while si ya se encontró una diferencia
                }
                numLinea++; // Pasar a la siguiente línea
            }

            // Si uno de los archivos tiene más líneas que el otro
            if (sonIguales && (bfr1.readLine() != null || bfr2.readLine() != null)) {
                System.out.println("Los archivos tienen diferente número de líneas.");
                System.out.println("La diferencia está a partir de la línea " + numLinea);
            } else if (sonIguales) {
                System.out.println("Los archivos son idénticos.");
            }

        } catch (IOException ex) {
            System.out.println("Error: " + ex); // Manejo de errores de lectura
        }
    }
}