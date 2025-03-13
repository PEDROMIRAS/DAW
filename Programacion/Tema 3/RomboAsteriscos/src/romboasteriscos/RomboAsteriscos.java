/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package romboasteriscos;

/**
 *
 * @author pedromiras
 */
public class RomboAsteriscos {
    public static void main(String[] args) {
        int n = 5; // Altura del rombo (mitad superior)

        // Parte superior del rombo
        for (int i = 1; i <= n; i++) {
            // Imprimir espacios
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte inferior del rombo
        for (int i = n - 1; i >= 1; i--) {
            // Imprimir espacios
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Imprimir asteriscos
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
