/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg6;

import java.util.Random;
import java.util.Scanner;

/***
 * Desarrollar un juego que ayude a mejorar el calculo mental de la suma. El jugador
 * tendra que introducir la solucion de la suma de dos numeros aleatorios comprendidos entre 1 y 100.
 * Mientras que la solucion introducida sea correcta el juego continuara. En caso contrario el programa terminara y mostrara el 
 * numero de operaciones realizadas correctamente.
 */
/**
 *
 * @author pedromiras
 */
public class EJ36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int numero1,numero2,respuestaUsuario;

        //Contador
        int contador=0;
        
        do {
            // Generar dos números aleatorios entre 1 y 99
            numero1 = random.nextInt(99) + 1;
            numero2 = random.nextInt(99) + 1;
            
            // Mostrar los números al usuario
            System.out.println("Resuelve la suma:");
            System.out.println(numero1 + " + " + numero2 + " = ?");

            // Solicitar la respuesta del usuario
            System.out.print("Introduce tu respuesta: ");
            respuestaUsuario = sc.nextInt();
            
            contador++;
        } while (respuestaUsuario==numero1+numero2);
        
        System.out.println("El juego ha terminado...Has acertado: "+--contador+" sumas.");
    }
    
}
