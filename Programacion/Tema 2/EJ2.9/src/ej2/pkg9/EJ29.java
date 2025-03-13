/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg9;

import java.util.Scanner;

/***
 * Pedir dos numeros y mostrarlos ordenados de manera decreciente.
 * EJemplo: 3, 5 (Uso de ternarios para las comparaciones.
 */
/**
 *
 * @author pedromiras
 */
public class EJ29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte el primer numero: ");
        int num1=sc.nextInt();
        System.out.println("Insserte el segundo numero: ");
        int num2=sc.nextInt();
        
        String resultado = (num1 > num2) ? (num1 + ", " + num2) : (num2 + ", " + num1);
        System.out.println("Numeros en orden decreciente: " + resultado);
        
//        int mayor =num1>num2?num1:num2;
//        int menor=num1<num2?num1:num2;
//        
//        System.out.println(mayor+" , "+menor);
        
//        if (num1>num2) {
//            
//            System.out.println(num1+" , "+num2);
//            
//        }else{
//            
//            System.out.println(num2+" , "+num1);
//            
//        }
    }
    
}
