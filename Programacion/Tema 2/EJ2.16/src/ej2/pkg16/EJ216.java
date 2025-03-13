/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg16;

import java.util.Scanner;

/***
 * Esccribir un programa que pida una hora de la siguiente forma: hora, minutos 
 * y segundos. El programa debe mostrar que hora sera un segundo mas tarde.
/**
 *
 * @author pedromiras
 */
public class EJ216 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        System.out.println("Inserte horas (0-23) ");
        int h=sc.nextInt();
        System.out.println("Inserte minutos (0-59)");
        int m=sc.nextInt();
        System.out.println("Inserte segundos (0-59)");
        int s=sc.nextInt();
        
        s++;
        
        if (s==60) {
            s=0;
            m++;
        }
        if (m==60) {
            m=0;
            h++;
        }
        if (h==24) {
           h=0;
        }
        System.out.println("["+h+":"+m+":"+s+"]");
    }
    
}
