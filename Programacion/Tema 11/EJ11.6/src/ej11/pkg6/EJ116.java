/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg6;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/***
 * EJERCICIO 6
 * Recupera la estrofa del archivo cancionPirata.dat del ejercicio 2 y muestrala por consola
 */
/**
 *
 * @author pedromiras
 */
public class EJ116 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "cancionPirata.dat";
        
        try(ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))){
            String cancion = (String) iS.readObject();
            System.out.println(cancion);
            
        }catch(IOException | ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
