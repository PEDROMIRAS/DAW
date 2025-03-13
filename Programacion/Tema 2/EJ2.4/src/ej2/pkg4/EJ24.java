/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg4;

import java.util.Scanner;

/***
 * Realia un programa que informe al usuario si un numero es multiplo de otro numero(mostrando true).
 * Ambos se piden por teclado.
 */
/**
 *
 * @author pedromiras
 */
public class EJ24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Inserte un numero: ");
        int num1=sc.nextInt();
        System.out.println("Inserte un numero: ");
        int num2=sc.nextInt();
        
        boolean esMultiplo=(num2!=0)&&(num1%num2==0);
        
        System.out.println("El numero1 es multiplo del numero2? "+esMultiplo);
    }
    
}
