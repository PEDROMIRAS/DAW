/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg5;
/***
* Ejercicio 5
* Crea un archivo de texto con un conjunto de números reales, uno por línea. Abrir 
* con un flujo de texto para lectura y leerlo línea a línea. Convertir las cadenas 
* leídas en números de tipo double por medio de Scanner, y mostrar al final 
* la suma de todos ellos.
 */
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ105 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "./texto.txt";
        double suma = 0;

        try (BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            String linea;

            while ((linea = bf.readLine()) != null) {
                try (Scanner sc = new Scanner(linea)) {
                    if (sc.hasNextDouble()) {
                        suma += sc.nextDouble();
                    }
                    sc.close();
                }
               
            }

            bf.close();
            System.out.println("Suma total: " + suma);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}
