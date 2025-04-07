/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 * Ejercicio 10
 * Escribir un programa que duplique el contenudo de un fichero cuyo nombre se pide al usuario.
 * El fichero que copia tendra el mismo nombre con el prefijo de "copia_de_".
 */
/**
 *
 * @author pedromiras
 */
public class EJ1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta1 = "texto.txt";
        String ruta2 = "copia_de_texto.txt";
        
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta1));
                BufferedWriter bw = new BufferedWriter(new FileWriter(ruta2))){
            String texto = null;
            while((texto = bf.readLine()) != null){
                try(Scanner sc = new Scanner(texto)){
                    texto = sc.nextLine();
                }
                
                bw.write(texto);
                bw.newLine();
            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex);
        }
    }
    
}
