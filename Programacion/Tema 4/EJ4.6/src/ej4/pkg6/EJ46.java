/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg6;
/***
 * Diseñar una funcion con el siguiente proposito :
 *  boolean esPrimo(int n)
 * que devolvera true si n es primo y false em caso contrario
 */
/**
 *
 * @author pedromiras
 */
public class EJ46 {

    /**
     * @param n
     * @return 
     */
    
    public static boolean esPrimo(int n) {
        // Los números menores que 2 no son primos
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // Si es divisible, no es primo
            }
        }

        return true; // Si no encontramos divisores, es primo
    }
    public static void main(String[] args) {
        System.out.println("El numero es primo? "+esPrimo(98));
    }
    
    
}
