/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg0;

import java.util.Scanner;

/***
 * Pedir tres numeros y mostarlos ordenados de mayor a menor.
 */
/**
 *
 * @author pedromiras
 */
public class EJ30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte el primer numero: ");
        int num1=sc.nextInt();
        System.out.println("Insserte el segundo numero: ");
        int num2=sc.nextInt();
        System.out.println("Insserte el segundo numero: ");
        int num3=sc.nextInt();
        
        if (num1>num2&&num1>num3) {
            if (num2>num3) {
                System.out.println("En orden decreciente: "+num1+" , "+num2+" , "+num3);
            }else{
                System.out.println("En orden decreciente: "+num1+" , "+num3+" , "+num2);
            }
        }else if (num2>num1&&num2>num2) {
            if (num1>num3) {
                System.out.println("En orden decreciente: "+num2+" , "+num1+" , "+num3);
            }else{
                System.out.println("En orden decreciente: "+num2+" , "+num3+" , "+num1);
            }
        }else if (num3>num1&&num3>num2) {
            if (num1>num2) {
                System.out.println("En orden decreciente: "+num3+" , "+num1+" , "+num2);
            }else{
                System.out.println("En orden decreciente: "+num3+" , "+num2+" , "+num1);
            }  
        }
        
    }
    
}
