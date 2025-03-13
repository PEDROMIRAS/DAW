/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema4;

import java.util.Scanner;

/***
 * Ejercicio 1
 *  Crea la función muestraPares(int n) que muestre por consola los primeros n números pares.
 */
/**
 *
 * @author pedromiras
 */
public class EJ1 {
    public static void muestraPares(int n){
        int numPar=0;
        
        for (int i = 0; i < n; i++) {
            numPar+=2;
            System.out.println(numPar);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Inserte la cantidad de numeros pares que quieres imprimir: ");
        int num = sc.nextInt();
        muestraPares(num);
    }
    
}
