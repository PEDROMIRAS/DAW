/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg2;
/**
 * Escribir una funcion a la que se el pasen dos enteros y muestre todos los numeros comprendidos entre ellos
 */
/**
 *
 * @author pedromiras
 */
public class EJ42 {

    public static void main(String[] args) {
        rango(34,10);
    }
    static void rango(int n1, int n2){
        int menor=Math.min(n1, n2);
        int mayor=Math.max(n1, n2);
        
        for (int i = menor; i <=mayor; i++) {
            System.out.println(i);
        }
    }
    
}
