/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg5;

import java.util.Scanner;

/***
 * Escribe una aplicacion que indique si un numero es par o no 
 * con if...else
 */
/**
 *
 * @author pedromiras
 */
public class EJ25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Inserte un numero: ");
        int num=sc.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
