/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/***
 * Ejercicio 8
 * Como ejemplo, vamos a guardar en un fichero el texto,
        "En un lugar de La Mancha,
        de cuyo nombre no quiero acordarme"
 *La primera línea, carácter a carácter, y la segunda, en una sola sentencia.
 */
/**
 *
 * @author pedromiras
 */
public class EJ108 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "texto.txt";
        String linea1 = "En un lugar de La Mancha,";
        String linea2 = "de cuyo nombre no quiero acordarme.";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            for (int i = 0; i < linea1.length(); i++) {
                bw.write(linea1.charAt(i));
            }
            bw.newLine();
            
            bw.write(linea2);
            bw.flush();
        }catch(IOException ex){
                System.out.println("Error: " + ex);
        }
        
    }
    
}
