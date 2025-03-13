/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg8;
//Calculator

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ48 {

    public static double calculator(int opc, int num1, int num2){
        double resultado = 0.0;
        switch (opc) {
            case 1 -> {
                resultado = num1 + num2;
            }
            case 2 -> {
                resultado = num1 - num2;
            }
            case 3 -> {
                resultado = num1 * num2;
            }
            case 4 -> {
                resultado = num1 / num2;            
            }
            default -> {  
                System.out.println("Operacion no valida");
                return 0;
            }
            
        }
        return resultado;
    }
       
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("""
                               CALCULADORA
                               1. Suma
                               2. Resta
                               3. Multiplicacion
                               4. Division
                               5. Salir
                               """);
        
        System.out.printf("Introduce la opcion que deseas: ");
        
        int opc = sc.nextInt();
        if (opc == 5) {
            System.out.println("Saliendo de la calculadora...");
            return;
        }
        
       // Pedir los operandos
        System.out.printf("Introduce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.printf("Introduce el segundo numero: ");
        int num2 = sc.nextInt();
        
        double resultado = calculator(opc, num1, num2);
        System.out.println("El resultado es: " + resultado);
    }
    
}
