/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg8;

import java.util.Arrays;
import java.util.Scanner;

/***
 * EJ8 Escribir una aplicacion que solicite cuantos numeros desea introducir .A continuacion
 * introducir por teclado esa cantidad de numeros entertos y por ultimo, mostrar el orden inverso al introducido
 */
/**
 *
 * @author pedromiras
 */
public class EJ58 {

    public static void rellenarArray(int numeros[]){
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Introduce un numero: ");
            int num = sc.nextInt();
            numeros[i] = num;
        }
    }
    public static void invertirArray(int numeros[], int num[]){
        for (int i = numeros.length - 1, j = 0; i >= 0; i--, j++) {
            num[j] = numeros[i];
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Introduce el numero de numeros a introducir: ");
        int numero = sc.nextInt();
        
        int numeros[] = new int[numero];
        int num[] = new int[numero];
        
        System.out.println();
        rellenarArray(numeros);
        System.out.println("El array es: "+Arrays.toString(numeros));
        invertirArray(numeros,num);
        System.out.println("El array invertido es: "+Arrays.toString(num));
    }
    
}
