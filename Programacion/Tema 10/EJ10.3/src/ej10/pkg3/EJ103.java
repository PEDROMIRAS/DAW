/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg3;

import java.io.*;

/**
 *
 * @author pedromiras
 */
public class EJ103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String rutaArchivo = "../EJ3.java";   
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo));
            String texto;
            String textoEntero= " ";
            
            while((texto = reader.readLine())!= null){
                textoEntero += "\n"+texto;
                
            }
            System.out.print(textoEntero);
            reader.close();
            
        }catch(IOException e){
            System.out.println("Error: " + e);
        }
    }
    
}
