/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/***
 * EJERCICIO 8
 * Implementar un programa que guarde en el fichero socios.dat un array de objetos Socio.
 * Despues se abrira de nuevo el fichero en modo lectura para recuperar el array de socios,
 * mostrandolo por pantalla.
 */
/**
 *
 * @author pedromiras
 */
public class EJ118 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        String ruta = "socios.dat";
        Socio s1 = new Socio("S001", "Pedro", 24);
        Socio s2 = new Socio("S002", "Alfonso", 32);
        Socio s3 = new Socio("S003", "Juan", 27);
        Socio s4 = new Socio("S004", "Maria", 20);
        
        Socio[] socios1 = {s1,s2,s3,s4};
        
        try(ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))
                ;ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))){
            oS.writeObject(socios1);
            
            Socio[] socios2 = (Socio[]) iS.readObject();
            System.out.println(Arrays.toString(socios2));
            
        }catch(IOException | ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
