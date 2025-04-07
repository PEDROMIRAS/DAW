/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg6.pkg2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ1062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "Enteros.txt";
        int suma = 0;
        int cont = 0;
        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream(ruta);
        } catch (FileNotFoundException ex) {
            System.out.println("ERROR!! "+ ex);
        }
        
        Scanner sc = new Scanner(fis);
            while (sc.hasNextInt()) {
               suma += sc.nextInt();
               cont++;
            }
                
        int media = suma/cont;
       
        System.out.println("Suma total: " + suma);
        System.out.println("Media: "+ media);

        }    
    }
