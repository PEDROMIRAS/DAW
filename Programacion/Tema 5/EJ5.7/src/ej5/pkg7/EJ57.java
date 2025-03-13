/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg7;

import java.util.Arrays;
import java.util.Scanner;

/***
 * EJ7 Diseñar un programa que solicite al usuario que introduzca por teclado 5 numeros decimales. A
 * continuacion, mostrar los numeros en el mismo orden que se gan introducido
 */
/**
 *
 * @author pedromiras
 */
public class EJ57 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        double numeros[] = new double[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Inserte un numero: ");
            double num = sc.nextDouble();
            
            numeros[i]=num;
        }
        System.out.println("El array es: "+Arrays.toString(numeros));
        
    }
    
}
