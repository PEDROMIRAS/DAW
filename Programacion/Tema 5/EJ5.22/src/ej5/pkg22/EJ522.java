/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg22;

//import java.util.Arrays;

/***
 * Crear un array bidimensional de longitud 5x5 y rellenarlo de la siguiente forma: el elemento de posicion[n][m]
 * debe contener el valor de 10* n+m. Despues se debe monstar el array
 */
/**
 *
 * @author pedromiras
 */
public class EJ522 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayBidimensional[][] = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayBidimensional[i][j] = 10 * (i+j);
            }
        }
        // Mostrar el array en formato más legible (como una tabla)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arrayBidimensional[i][j] + "\t");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        //System.out.println(Arrays.deepToString(arrayBidimensional));
    }
    
}
