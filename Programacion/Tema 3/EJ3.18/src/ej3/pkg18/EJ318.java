/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg18;

import java.util.Scanner;

/***
 * Pedir por teclado un numero n y dibujar un triangulo rectangulo de n elementos de lado
 * utilizando para ello asteriscos(*) 
/**
 *
 * @author pedromiras
 */
public class EJ318 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Inserte un numero:");
        int num=sc.nextInt();
        
        for (int i=0; i<num ; i++) {
            for (int j=i; j<num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = num; i > 0; i--) {
            for (int j=0; j<=num-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
