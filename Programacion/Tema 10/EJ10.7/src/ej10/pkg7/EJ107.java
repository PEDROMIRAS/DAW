/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/***
 * Ejercicio 7
 * Crea con un editor el fichero de texto Jugadores.txt en la carpeta del proyecto de NetBeans 
 * actual y escribe en él los nombres, edades y estaturas de los jugadores de un equipo, cada uno
 * en una línea.
 *       Juan 22 1.70
 *       Luis 22 1.80
 *       Pedro 20 1.73
 * Implementa un programa que lea del fichero los datos, muestre los nombres y calcule la media 
 * de la edad y de las estaturas, mostrándolas por pantalla.
 */
/**
 *
 * @author pedromiras
 */
public class EJ107 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "Jugadores.txt";
        int sumaEdad = 0;
        int contEdad = 0;
        double sumaAltura = 0;
        int contAltura = 0;
        
        try (BufferedReader bf = new BufferedReader(new FileReader(ruta))) {
            String linea;
            
            while ((linea = bf.readLine()) != null) {
                // Leer nombre, edad y altura
                try (Scanner sc = new Scanner(linea)) {
                    // Leer nombre, edad y altura
                    String nombre = sc.next();
                    if (sc.hasNextInt()) {
                        sumaEdad += sc.nextInt();
                        contEdad++;
                       if (sc.hasNextDouble()) {
                        sumaAltura += sc.nextDouble();
                        contAltura++;
                       }
                        
                    }
                    // Mostrar el nombre
                    System.out.println("Nombre: "+ nombre);
                }
            }
            
            // Calcular y mostrar la media de la edad y altura
            double mediaEdad = (double) sumaEdad / contEdad;
            System.out.println("Media edad: " + mediaEdad);
            
            double mediaAltura = sumaAltura / contAltura;
            System.out.println("Media altura: " + mediaAltura);
            
        } catch (IOException e) {
            System.out.println("ERROR!! " + e);
        }
    }
}