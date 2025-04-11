/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/***
* EJERCICIO 2
* Escribe un programa que lea un fichero de texto llamado carta.txt. Tenemos que contar los
* caracteres, las líneas y las palabras. Para simplificar supondremos que cada palabra está
* separada de otra por un único espacio en blanco o por un cambio de línea
*/
/**
 *
 * @author pedromiras
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "carta.txt";
        int numChar = 0;
        int numLineas = 0;
        int numPalabras = 0;
        
        try(BufferedReader bf = new BufferedReader(new FileReader(ruta))){
            String linea;
            while ((linea = bf.readLine()) != null) {
                // Interamos sobre el contador de lineas por cada salto de linnea
                numLineas++;
                // Recorremos la linea y si es un caracter en la posicion de i iteramos sobre el contador
                for (int i = 0; i < linea.length(); i++) {
                    if (linea.charAt(i) != ' ') {
                    numChar++;
                    }
                }
                // Dividimos la linea en uno o mas espacios y contamos los elementos(palabras) en el array resultante
                numPalabras += linea.split("\\s+").length;
            }

            System.out.println("Numero de caracteres: " + numChar);
            System.out.println("Numero de lineas: " + numLineas);
            System.out.println("Numero de palabras: " + numPalabras);
            
        }catch(IOException ex){
            System.out.println("Error : " + ex);
        }
    }
    
}
