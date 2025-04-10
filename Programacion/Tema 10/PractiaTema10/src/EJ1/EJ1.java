/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

/***
 * EJERCICIO 1
 * Implementa un programa que lea dos listas de números enteros no ordenados de dos archivos
 * que contienen un número por línea, los reúna en una lista única y los guarde en orden
 * creciente en un tercer archivo, de nuevo uno por línea.
 */
/**
 *
 * @author pedromiras
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String lista1 = "lista1.txt";
        String lista2 = "lista2.txt";
        String listaOrdenada = "listaOrdenada.txt";
        
        int[] numeros = new int[0]; // Array inicial vacío

        try (BufferedReader br1 = new BufferedReader(new FileReader(lista1));
             BufferedReader br2 = new BufferedReader(new FileReader(lista2));
             BufferedWriter bw = new BufferedWriter(new FileWriter(listaOrdenada))) {
            
            String linea;
            
            // Leer lista1.txt
            while ((linea = br1.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                // Redimensionamos el array y añadimos el nuevo número
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = numero;
            }
            
            // Leer lista2.txt
            while ((linea = br2.readLine()) != null) {
                int numero = Integer.parseInt(linea);
                numeros = Arrays.copyOf(numeros, numeros.length + 1);
                numeros[numeros.length - 1] = numero;
            }

            // Ordenar el array
            Arrays.sort(numeros);

            // Escribir el array ordenado en el archivo listaOrdenada.txt
            for (int num : numeros) {
                bw.write(Integer.toString(num));
                bw.newLine();
            }

            System.out.println("La lista ordenada se ha guardado correctamente en " + listaOrdenada);

        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
}
