/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg12;
/***
 * Dise�ar una funci�n recursiva que calcule el en�simo t�rmino de la serie de Fibonnacci. En esta
    serie el en�simo valor se calcula sumando los dos valores anteriores de la serie. Es decir:
        ? fibonacci(n) = fibonacci(n - 1) + fibonacci(n - 2)
        ? fibonacci(0) = 1
        ? fibonacci(1) = 1
 */
/**
 *
 * @author pedromiras
 */
public class EJ412 {
    public static long fibonacci(int n){
        long enesimo=1;
        
        if (n == 0) {
            enesimo = 0;
        }else if (n == 1 || n == 2) {
            enesimo = 1;
        } else if (n > 1) {
            enesimo = fibonacci(n -1) + fibonacci(n -2);
        }
        return enesimo;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El enesimo es: "+fibonacci(56));
    }
    
}
