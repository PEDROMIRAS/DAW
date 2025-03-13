/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg13;

import java.util.Scanner;

/***
 * Implementa un programa que pida al usuario un numero positivo y lo muestre guarismo a guarismo .
 * Por ejemplo para el numero 123 , debe mostrar primero el 3 a continuacion el 2 y por ultimo el 1
 */
/**
 *
 * @author pedromiras
 */

public class EJ313{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        // Pedir al usuario un número positivo
        do {
            System.out.print("Introduce un numero positivo: ");
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("El numero debe ser positivo. Intenta de nuevo.");
            }
        } while (numero <= 0);

        System.out.println("Mostrando el numero guarismo por guarismo:");

        // Mostrar los dígitos en orden inverso
        while (numero > 0) {
            int digito = numero % 10; // Obtener el último dígito
            System.out.println(digito);
            numero = numero / 10; // Eliminar el último dígito
        }

        scanner.close();
    }
}