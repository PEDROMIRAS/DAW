/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.InputMismatchException;
import java.util.Scanner;

/***
 * Ejercicio 1
 * 
 * Escribir el método
 * 
 * Integer leer Entero(),
 * 
 * Que pide un entero por consola, lo lee del teclado y lo devuelve. Si la cadena 
 * introducida por consola no tiene el formato correcto, mostrar un mensaje de error y volver a pedirlo.
 * Usar un bucle while(true) para pedirlo constantemente y break para salir del bucle solo si lo
 * introducido tiene el formato correcto.
 */
/**
 *
 * @author pedromiras
 */
public class EJ1 {
    public static Integer leerEntero(){
        Scanner sc = new Scanner(System.in);
        Integer numero;
        
//        while (true) {
//            System.out.print("Introduce un numero entero: ");
//            String entrada = sc.nextLine();
//            try {
//                //numero = Integer.parseInt(entrada);
//                numero = Integer.valueOf(entrada);
//                break; // Salir del bucle si la conversión es exitosa
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Debes ingresar un numero entero valido.");
//            }
//        }
        
        while (true) {
            try {
                System.out.print("Introduce un numero entero: ");
                numero = sc.nextInt(); // Intenta leer un entero
                break; // Si es válido, sale del bucle
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes ingresar un numero entero valido.");
                sc.nextLine(); // Limpia el buffer del scanner
            }
        }
        
        return numero;
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer resultado = leerEntero();
        System.out.println("Numero: " + resultado);
    }
    
}
