/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg9;

import java.util.Arrays;
import java.util.Scanner;

/***
 * EJ9 Diseñar la funcion: int maximo(int t[]), que devuelve el maximo valor contenido en un array t
 */
/**
 *
 * @author pedromiras
 */
public class EJ59 {

    public static int maximo(int t[]){
        Scanner sc = new Scanner(System.in);
        int numMax = 0;
        
        for (int i = 0; i < t.length; i++) {
            System.out.printf("Introduce un numero: ");
            int num = sc.nextInt();
            t[i] = num;
            
            if (t[i] > numMax) {
                numMax = t[i];      
            }
        }
        
        System.out.println();
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));
        System.out.println("El numero mas grande del array es: "+numMax);
        return numMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Introduce el numero de numeros a introducir: ");
        int numero = sc.nextInt();
        
        int t[] = new int[numero];
        
        System.out.println();
        maximo(t);

    }
    
}
