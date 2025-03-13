/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg7;

import java.util.Scanner;

/***
 * Solicitar dos numero distintos y mostar cual es mayor. Si son iguales indicar
 * que tienen que ser distintos.
 */
/**
 *
 * @author pedromiras
 */
public class EJ27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte el primer numero: ");
        int num1=sc.nextInt();
        System.out.println("Insserte el segundo numero: ");
        int num2=sc.nextInt();
        
//        if (num1!=num2) {
//            
//            if (num1>num2) {
//                
//                System.out.println("El mayor es el primer numero");
//                
//            }else{
//                
//                System.out.println("El mayor es el segundo numero");
//            }
//            
//        }else{
//            
//            System.out.println("Ambos numeros deben diferentes");
//        }
//        
        if (num1==num2) {
            
            System.out.println("Ambos numero deben de ser distintos");
            
        }else if(num1>num2){
            
            System.out.println("El mayor es el primer numero");

        }else{
            
            System.out.println("El mayor es el segundo numero");

        }
    }
    
}
