/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg10;
//Pedir 10 numeros por teclado y mostrar la media

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ310 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sumaN=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Introduce un numero");
            num=sc.nextInt();
            sumaN+=num;
        }
        int media=sumaN/10;
        System.out.println(media);
    }
    
}
