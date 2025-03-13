/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg7;

import java.util.Scanner;

/***
 * Implementa una aplicacion Eco, que pida al usuario un numero y muestra eco tantas veces como diga el usuario
 */
/**
 *
 * @author pedromiras
 */
public class EJ37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Interta un numero:");
        int numero=sc.nextInt();
        
        for (int i = 0; i < numero; i++) {
            System.out.println("ECO");
        }
    }
    
}
