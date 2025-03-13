/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg8;

import java.util.Scanner;

/***
 * Escribir una aplicacion  para aprender a contar , que pida el numero n y muestre
 * todos los numeros del 1 al n
 */
/**
 *
 * @author pedromiras
 */
public class EJ38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un numero:");
        
        int num=sc.nextInt();
        
        for (int i = 1; i <=num; i++ ) {
            System.out.println(i);
        }
    }
    
}
