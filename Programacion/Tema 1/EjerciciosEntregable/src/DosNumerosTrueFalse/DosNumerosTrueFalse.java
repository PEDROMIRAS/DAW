/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DosNumerosTrueFalse;

import java.util.Scanner;
/***
 * Pide dos numeros al usuario:  a y b. Debera mostrar true si a es mayor o igual que b
 * y false si a es menor que b.
 */
/**
 *
 * @author pedromiras
 */
public class DosNumerosTrueFalse {
    public static void main(String[] args){
        int num1, num2;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Inserte el valor del primer numero:");
        num1=sc.nextInt();
        
        System.out.print("Inserte el valor del segundo numero:");
        num2=sc.nextInt();
        
        boolean resultado=num1>=num2;
        
        System.out.println("Es A mayor o igual que B? \n"+resultado);
       
    }
}
