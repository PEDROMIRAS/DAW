/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema3;

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la altura de la pirámide
        System.out.print("Introduce la altura de la piramide (N): ");
        int n = scanner.nextInt();

       // Generar la pirámide
      for (int i = 1; i <= n; i++) { // Iterar por cada fila
           // Imprimir espacios en blanco
           for (int j = 1; j <= n - i; j++) {
              System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Salto de línea al final de cada fila
            System.out.println();
        }
        
        //Ejemplo clase
        for (int i = 1; i <=n; i++) {//Iterar por cada fila
            // Imprimir espacios en blanco
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int K = 1; K <=i; K++) {
                System.out.print("* ");
            }
            // Salto de línea al final de cada fila
            System.out.println("");
        }
        
        //Piramide invertida
        for (int i = n-1; i >=1; i--) {//Iterar por cada fila
            // Imprimir espacios en blanco
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int K = 1; K <=i; K++) {
                System.out.print("* ");
            }
            // Salto de línea al final de cada fila
            System.out.println("");
        }
        
    }
    
}
