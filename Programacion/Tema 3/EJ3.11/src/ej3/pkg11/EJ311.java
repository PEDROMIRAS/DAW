/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg11;

import java.util.Scanner;

/***
 * Implementar una aplicacion que pida al usuario un numero comprendido entre el 1 y el 10
 * hay que mostrar la tabla de multiplicar de dicho numero , asegurandose que el numero introducido se encuentra en 
 * rango establecido
 */
/**
 *
 * @author pedromiras
 */
public class EJ311 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Inserte un numero:");
        int num=sc.nextInt();
        
//        if (num>=1&&num<=10) {
//            for (int i = 0; i <=10; i++) {
//                int tabla=i*num;
//                System.out.println(num+"*"+i+"="+tabla);
//            }
//        }
        while(num<1||num>10){
            System.out.printf("Inserte un numero:");
            num=sc.nextInt();
        }
        for (int i = 0; i <=10; i++) {
                int tabla=i*num;
                System.out.println(num+"*"+i+"="+tabla);
            }
    }
    
}
