/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg7;
/***
 * Escribe una funcion qeu se le pase un numero entero y devuelva el numero de divisores primos que tiene.
 */
/**
 *
 * @author pedromiras
 */
public class EJ47 {
    
    public static boolean esPrimo(int n) {
        
        if (n < 2) {
            return false;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; 
            }
        }

        return true; 
    }
    
    public static int contarDivisoresPrimos(int numero) {
        int contador = 0;

        
        for (int i = 2; i <= numero; i++) {
            
            if (numero % i == 0 && esPrimo(i)) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 28; 
        int divisoresPrimos = contarDivisoresPrimos(numero);
        System.out.println("El numero " + numero + " tiene " + divisoresPrimos + " divisores primos."); 
        
    }
    
}
