/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enterodecimal;

import java.util.Scanner;

/***
 * 1.14 Realiza un programa que reciba como entrada un decimal y lo muestre cortado
 * al entero mas proximo.
 */
/**
 *
 * @author pedromiras
 */
public class EnteroDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número decimal
        System.out.print("Ingresa un numero decimal: ");
        double numeroDecimal = scanner.nextDouble();

        // Separar la parte entera y decimal
        int parteEntera = (int) numeroDecimal;
        double parteDecimal = numeroDecimal - parteEntera;

        // Redondear manualmente según la parte decimal
        int enteroProximo = (parteDecimal >= 0.5) ? (parteEntera + 1) : parteEntera;

        // Mostrar el resultado
        System.out.println("\nEl numero redondeado al entero mas cercano es: " + enteroProximo);
        
        
        //Redondeo con Math.round();
        System.out.println("\nRedondeo con Math.round()");
        
        int numeroProximo=(int)Math.round(numeroDecimal);
        
        System.out.println("El numero redondeado es: "+numeroProximo);

        scanner.close();
    }
}
    

