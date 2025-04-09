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
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el nombre del archivo a copiar: ");
        String nombreArchivo = sc.nextLine();
        String copiaArchivo = "copia_de_" + nombreArchivo;

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
             BufferedWriter bw = new BufferedWriter(new FileWriter(copiaArchivo))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea);
                bw.newLine();
            }

            System.out.println("El archivo ha sido copiado correctamente como: " + copiaArchivo);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e.getMessage());
        }
    } 
    
}
