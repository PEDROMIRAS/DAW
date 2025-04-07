/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/***
 * Ejercicio 9
 * Escribe un texto en un archivo de texto, linea a linea leidas por teclado,
 * hasta que introduzca la palabra "fin".
 */
/**
 *
 * @author pedromiras
 */
public class EJ109 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "texto.txt";
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))){
            String texto = null;
            try (Scanner sc = new Scanner(System.in)) {
                
                System.out.println("Escriba aqui: ");
                texto = sc.nextLine();
  
                while(!"fin".equals(texto)){
                    bw.write(texto);
                    bw.newLine();
                    
                    System.out.println("Escriba aqui: ");
                    texto = sc.nextLine();
                    
                }
            }
        }catch(IOException ex){
            System.out.println("Error: " + ex);
        }
        
    }
    
}
