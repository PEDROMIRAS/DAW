/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * Definir una funcion que tome como parametros dos arrays, el primero(desordenado) con los 6 numeros de una apuesta en la primitiva
 * y el segundo(ordenado) con los 6 numeros de la combinacion ganadora. La funcion veolvera el numero de aciertos.
 * 
/**
 *
 * @author pedromiras
 */
public class EJ512 {
    public static int aciertosPrimitiva(int apuesta[], int ganadora[]){
        int aciertos = 0;
        Arrays.sort(ganadora);
        for (int i = 0; i < apuesta.length; i++) {  
            if (Arrays.binarySearch(ganadora, apuesta[i]) >= 0) {
                aciertos++;
            }
        }
        return aciertos;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(99+1);
        
        int ganadora[] = new int[6];
        for (int i = 0; i < ganadora.length; i++) {
            ganadora[i] = random.nextInt();
        }
        
        int apuesta[] = new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            System.out.printf("Indique el numero " + i + " de su apuesta en la primitiva: ");
            apuesta[i] = sc.nextInt();
        }
        int resultado = aciertosPrimitiva(apuesta,ganadora);
        System.out.println("\nEl numero de acieros es: "+resultado);
    }
    
}
