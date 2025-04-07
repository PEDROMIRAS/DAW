/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg6;

import java.io.*;
import java.util.Scanner;

/***
 * Ejercicio 6
 *  Crea con un editor el fichero de texto Enteros.txt en la carpeta del proyecto
 *  actual de NetBeans y escribir en el una serie de numeros enteros separados por 
 *  una secuencia de espacios y tabuladores, incluso en lineas distintas, tal como:
 *      2 3 45    73
 *      123     4 21
 *  Implementar un programa que acceda a Enteros.txt con un objeto Scanner a traves de 
 *  un flujo de entrada, lea los enteros y calcula su media aritmetica, mostrnado 
 *  los resultados por pantalla.
 */
/**
 *
 * @author pedromiras
 */
public class EJ106 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "Enteros.txt";
        int suma = 0;
        int cont = 0;
        
        try (BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            String linea;

            while ((linea = bf.readLine()) != null) {
                try (Scanner sc = new Scanner(linea)) {
                    while (sc.hasNextInt()) {
                        suma += sc.nextInt();
                        cont++;
                    }
                }
               
            }
         int media = suma/cont;
            bf.close();
            System.out.println("Suma total: " + suma);
            System.out.println("Media: "+ media);

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
    
}
