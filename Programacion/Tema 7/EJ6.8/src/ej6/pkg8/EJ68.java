/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg8;

import Controlador.Controlador;
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Controlador controlador1 = new Controlador(107.7);
        
        int opc;
        
        do {
            System.out.println("""
                           RADIO FM:
                           1. Subir frecuencia
                           2. Bajar frecuencia
                           3. Salir""");

//            // Validación de entrada
//            while (!sc.hasNextInt()) {
//                System.out.println("Por favor, ingrese un numero valido.");
//                sc.next(); // Descartar entrada inválida
//            }
            opc = sc.nextInt();
            
            switch (opc) {
                case 1 -> {
                    controlador1.upFrequency(); // Método corregido
                    controlador1.display();
                }
                case 2 -> {
                    controlador1.downFrequency(); // Método corregido
                    controlador1.display();
                }
                case 3 -> System.out.println("Saliendo de la radio...");
                default -> System.out.println("Opcion no valida, intente nuevamente.");
            }

        } while (opc != 3);  // Condición de salida

        sc.close(); // Se cierra el scanner al finalizar
    }
}