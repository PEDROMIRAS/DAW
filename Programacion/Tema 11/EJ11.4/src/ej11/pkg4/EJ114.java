/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/***
 * Ejercicio 4
 * Leer de un archivo datos. dat 10 números enteros, guardándolos en un array de tipo int.
 */
/**
 *
 * @author pedromiras
 */
public class EJ114 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "datos.dat";
        int[] enteros = new int[10];
        try(ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))){
            for (int i = 0; i < 10; i++) {
                enteros[i] = iS.readInt();
            }
            System.out.println(Arrays.toString(enteros));
            
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
