/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/***
 * Ejercicio 3
 * Pedir un número entero n por consola y, a continuación, pedir n números de 
 * tipo double, que iremos insertando en un array. Guardar el array 
 * en un archivo binario.
*/
/**
 *
 * @author pedromiras
 */
public class EJ113 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Inserte un numero N: ");
        int n = sc.nextInt();
        
        double[] numeros = new double[n];
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Inserte un numero decimal en el array: ");
            double nArray =  sc.nextDouble();
            numeros[i] = nArray;
        }
        
        String ruta = "double.dat";
       
        try(ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))){
            oS.writeObject(numeros);
            /***
             * Al heredar la clase String de la clase Object, un string se 
             * contempla como tal y se puede usar el writeObject
             */
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
