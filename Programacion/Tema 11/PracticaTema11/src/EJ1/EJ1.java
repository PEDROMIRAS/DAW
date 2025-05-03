/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ1;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/***
 * Ejercicio 1
 * Implementa un programa que lea números enteros desde el fichero números.dat y 
 * los vaya guardando en los ficheros pares.dat e impares.dat, según su paridad.
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
        String rutaNum = "numeros.dat";//Rutas de archivos .dat
        String rutaPares = "pares.dat";
        String rutaImpares = "impares.dat";
        
        //Necesitaba crear un numeros.dat que contuviera numeros pares e impares
//        try (ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(rutaNum))) {
//            int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
//            for (int n : numeros) {
//                oS.writeObject(n);
//            }
//            System.out.println("Archivo numeros.dat creado correctamente.");
//        } catch (IOException e) {
//            System.out.println("Error al crear numeros.dat: " + e.getMessage());
//        }
        try(ObjectInputStream iS = new ObjectInputStream(new FileInputStream(rutaNum)); //Entrada y salida de Stream
            ObjectOutputStream oPares = new ObjectOutputStream(new FileOutputStream(rutaPares));
            ObjectOutputStream oImpares = new ObjectOutputStream(new FileOutputStream(rutaImpares))){
            while(true){//Bucle infinito 
                try {
                    int numero = (int) iS.readObject();// Lectura de numeros del archivo numeros.dat
                    if (numero % 2 == 0) {
                        System.out.println("Par:"+numero);
                        oPares.writeObject(numero);// Escritura en pares.dat si el numero es par
                    } else {
                        System.out.println("Impar:"+numero);
                        oImpares.writeObject(numero);// Escritura en impares.dat
                    }
                } catch (EOFException eof) { // Control de excepcion de fin de fichero
                    System.out.println("\nNumeros insertados correctamente.");
                    break; // Fin del archivo, sale del bucle
                }
            }
        }catch(IOException | ClassNotFoundException ex){// Control de excecion de entrada/salida y de clase no encontrada
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
