/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg14;

import java.util.Scanner;

/***
 * Pedir un numero y calcular su factorial.
 */
/**
 *
 * @author pedromiras
 */
public class EJ314 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Inserte un numero:");
        int num=sc.nextInt();
        int factorial=1;
        
        for (int i=num; i>1; i--){
            factorial*=i;
            
        }
        System.out.println("Factorial: "+factorial);
    }
    
}
