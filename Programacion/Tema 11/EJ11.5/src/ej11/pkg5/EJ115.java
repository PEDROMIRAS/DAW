/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/***
 * EJERCICIO 5
 * Leer un array de enteros de un archivo datos.dat
 */
/**
 *
 * @author pedromiras
 */
public class EJ115 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "datos.dat";
        
        try(ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))){
            int[] enteros = (int[])iS.readObject();
            System.out.println(Arrays.toString(enteros));
            
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }catch(ClassNotFoundException ex){
            System.out.println("Error: " +ex.getMessage());
        }
    }
    
}
