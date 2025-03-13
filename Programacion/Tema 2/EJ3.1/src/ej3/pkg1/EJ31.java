/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg1;

import java.util.Scanner;

/***
 * Escribir una aplicacion que indique cuantas difras tiene un numero entero introducido 
 * por teclado, que estara comprendido entre el 0 y el 99.999.
 */
/**
 *
 * @author pedromiras
 */
public class EJ31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte un numero: ");
        int num1=sc.nextInt();
        
//        if (num1<100000&&num1>=10000) {
//            System.out.println("El numero tiene cinco cifras");
//        }else if (num1<10000&&num1>=1000) {
//            System.out.println("El numero tiene cuatro cifra");
//        }else if (num1<1000&&num1>=100) {
//            System.out.println("El numero tiene tres cifras");
//        }else if (num1<100&&num1>=10) {
//            System.out.println("El numero tiene dos cifras");
//        }else if (num1<10&&num1>=0) {
//            System.out.println("El numero tiene una cifra");
//        }   else{
//            System.out.println("El numero no es valido!!");  
//        }
        
        if (num1<10) {
            System.out.println("El numero tiene una cifra");
        }else if (num1<100) {
            System.out.println("El numero tiene dos cifras");
        }else if (num1<1000) {
            System.out.println("El numero tiene tres cifras");
        }else if (num1<10000) {
            System.out.println("El numero tiene cuatro cifras");
        }else if (num1<100000) {
            System.out.println("El numero tiene cinco cifras");
        }
        
    }
    
}
