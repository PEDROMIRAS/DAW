/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg6;

import java.util.Scanner;
import java.util.Arrays;

/***
 * Ejercicio 6:
 * Introduce por teclado un numero n , a continuacion, solicita al usuario que teclee n numeros.
 * Realiza la media de los numeros positivos , la media de los numeros negativos y cuenta el numero de 0 introducidos.
 */
/**
 *
 * @author pedromiras
 */
public class EJ56 {

    public static void cuentaNumeros(int numero){
        int sumaPositivos = 0;
        int cuentaPositivos = 0;
        int mediaPositivos = 0;
        
        int sumaNegativos = 0;
        int cuentaNegativos = 0;
        int mediaNegativos = 0;
        
        int cuentaCeros = 0;
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numero; i++) {
            System.out.printf("Introduce un numero: ");
            int num = sc.nextInt();

            if (num > 0) {
                sumaPositivos += num;
                cuentaPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }
        mediaPositivos = sumaPositivos / cuentaPositivos;
        mediaNegativos = sumaNegativos / cuentaNegativos;
        
        System.out.println("\nLa media de los numeros positivos introducidos es: "+mediaPositivos);
        System.out.println("La media de los numeros negativos introducidos es: "+mediaNegativos);
        System.out.println("El numero de ceros introducidos es: "+cuentaCeros);
        
    }
    public static void cuentaArrays(int numero){
        int numeros[] = new int[numero];
        
        int sumaPositivos = 0;
        int cuentaPositivos = 0;
        int mediaPositivos = 0;
        
        int sumaNegativos = 0;
        int cuentaNegativos = 0;
        int mediaNegativos = 0;
        
        int cuentaCeros = 0;
        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numero; i++) {
            System.out.printf("Introduce un numero: ");
            int num = sc.nextInt();
            numeros[i] = num;
            
            if (num > 0) {
                sumaPositivos += num;
                cuentaPositivos++;
            } else if (num < 0) {
                sumaNegativos += num;
                cuentaNegativos++;
            } else {
                cuentaCeros++;
            }
        }
        if (cuentaPositivos > 0) {
            mediaPositivos = sumaPositivos / cuentaPositivos;
        }else{
            System.out.println("0 numeros positivos");
        }
        
        if (cuentaNegativos > 0) {
            mediaNegativos = sumaNegativos / cuentaNegativos;
        }else{
            System.out.println("0 numeros negativos");
        }

        System.out.println("\nLa media de los numeros positivos introducidos es: "+mediaPositivos);
        System.out.println("La media de los numeros negativos introducidos es: "+mediaNegativos);
        System.out.println("El numero de ceros introducidos es: "+cuentaCeros);
        System.out.println("El array creado: "+Arrays.toString(numeros));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce el numero de numeros a introducir: ");
        int numero = sc.nextInt();
        
        //cuentaNumeros(numero);
        //System.out.println();
        cuentaArrays(numero);
    }
    
}
