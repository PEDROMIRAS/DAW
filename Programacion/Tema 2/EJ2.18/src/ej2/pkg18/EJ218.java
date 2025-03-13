/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg18;

import java.util.Scanner;

/***
 * Escribir un programa que calcule el dinero recaudado en un concierto. La aplicacion solicitara el aforo
 * maximo del local, el precio por entrada(suponemos que todas las entradas tienen el mismo precio)y el numero de 
 * entradas vendidas. Hay que tener en cuenta que si el numero de entradas no supera el 20% del aforo del local,
 * se cancela el concierto.
 * Si el numero de entradas vendidas no supera el 50% del aforo del local, se realiza una rebaja del 25% del precio de la entrada.
 */
/**
 *
 * @author pedromiras
 */
public class EJ218 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.print("Introduce el aforo maximo del local: ");
        int aforoMaximo = scanner.nextInt();

        System.out.print("Introduce el precio de la entrada: ");
        double precioEntrada = scanner.nextDouble();

        System.out.print("Introduce el numero de entradas vendidas: ");
        int entradasVendidas = scanner.nextInt();

        // Calcular el porcentaje de entradas vendidas
        double porcentajeVendidas = (double) entradasVendidas / aforoMaximo * 100;

        // Condición para cancelar el concierto
        if (porcentajeVendidas < 20) {
            System.out.println("El concierto se cancela debido a la baja venta de entradas.");
        } else {
            // Aplicar descuento si es necesario
            if (porcentajeVendidas < 50) {
                precioEntrada *= 0.75; // Rebaja del 25%
                System.out.println("Se aplica un descuento del 25% al precio de la entrada.");
            }

            // Calcular la recaudación total
            double totalRecaudado = entradasVendidas * precioEntrada;
            System.out.println("El dinero recaudado en el concierto es: "+totalRecaudado+" euros.");
        }
        
        
    }
    
}
