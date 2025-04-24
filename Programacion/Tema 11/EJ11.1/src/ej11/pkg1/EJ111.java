/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/***
 * Ejercicio 1
 * Escribir un archivo de datos.dat los valores de un array de diez enteros.
 */
/**
 *
 * @author pedromiras
 */
public class EJ111 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "datos.dat";
        int[] enteros = {0,1,2,3,4,5,6,7,8,9};
        try(ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))){
            for (int i = 0; i < enteros.length; i++) {
                oS.writeInt(i);
            }
            //oS.writeObject(enteros);
            /***
             * Al heredar la clase String de la clase Object, un string se 
             * contempla como tal y se puede usar el writeObject
             */
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
