/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10.pkg2;
import java.io.*;
/**
 *
 * @author pedromiras
 */
public class EJ102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = new FileReader("../EJ3.java");
            int caracter;
            while((caracter = reader.read())!=-1){
                System.out.print((char)caracter);
            }
            reader.close();
        }catch(IOException e){
            System.out.println("Error E/S: "+e.getMessage());
        }finally{
            if (reader!=null) {
                try{
                    reader.close();
                }catch(IOException e){
                    System.out.println("Error E/S: " + e.getMessage());
                }
            }
        }
    }
    
}
