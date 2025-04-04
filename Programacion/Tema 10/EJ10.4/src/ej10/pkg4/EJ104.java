/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg4;
/***
 * Ejercicio 4
 * 
 * Crear con un editor el fichero de texto NumerosReales.txt en la carpeta del 
 * proyecto de NetBeans actual y escribir en él una serie de números reales 
 * separados por espacios simples. Implementar un programa que acceda a 
 * NumeroReales.txt, lea los números y calcule la suma y la media aritmética, 
 * mostrando los resultados por pantalla.
 */
import java.io.*;

/**
 *
 * @author pedromiras
 */
public class EJ104 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "./texto.txt";
   
        try{
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            String linea = bf.readLine();
            
            if (linea != null) {
                String[] numeros = linea.split(" ");
                
                double suma= 0;
                int cont = 0;
                
                for(String num : numeros){
                    suma += Double.parseDouble(num);
                    cont++;
                }
                
                double media = suma / cont;
                System.out.println("Suma: " + suma);
                System.out.println("Media: " + media);
            }
            
            bf.close();
            
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    
}
