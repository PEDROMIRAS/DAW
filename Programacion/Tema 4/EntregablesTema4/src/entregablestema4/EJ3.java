
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema4;

import java.util.Scanner;

/***
 * Ejercicio 3
    Escribe una función que decida si dos números enteros positivos son amigos. Dos números a y
    b son amigos si la suma de los divisores propios (distintos de él mismo) de a es igual a b. Y
    viceversa.
    Para probar se pueden usar los números 220 y 284, que son amigos.
 */
/**
 *
 * @author pedromiras
 */
public class EJ3 {
    public static void numAmigos(int a, int b){
        int divisoresA = 0;
        int divisoresB = 0;
         
        for (int i = 1; i < a; i++) {
            if (a % i==0) {
                divisoresA += i;
            }
        }
        for (int i = 1; i < b; i++) {
            if (b % i==0) {
                divisoresB += i;
            }
        }
        if (divisoresA == b && divisoresB == a) {
            System.out.println("Los numeros A y B SI son numeros amigos.");
        }else{
            System.out.println("Los numeros A y B NO son numeros amigos.");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.printf("Inserte el numero a: "); a = sc.nextInt();
        System.out.printf("Inserte el numero b: "); b = sc.nextInt();
        
        numAmigos(a,b);
    }
    
}
