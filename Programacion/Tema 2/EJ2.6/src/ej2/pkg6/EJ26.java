/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg6;

import java.util.Scanner;

/***
 * Crear una aplicacion que solicite por teclado 2 numero enteros y 
 * diga si son iguales o no.
 */
/**
 *
 * @author pedromiras
 */
public class EJ26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte el primer numero: ");
        int num1=sc.nextInt();
        System.out.println("Insserte el segundo numero: ");
        int num2=sc.nextInt();
        
        if (num1==num2) {
            System.out.println("Ambos numeros son iguales");
        }else{
            System.out.println("Ambos numeros son diferentes");
        }
    }
    
}
