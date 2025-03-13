/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg8;

import java.util.Scanner;

/***
 * Implementar un prograna que pida por teclado un numero decimal e indique si es un numero casi-cero, que son aquellos
 * positivos o  negativos , que se acercan a 0 por menos de 1 unidad, aunque curiosamente el 0 no se considera casi-cero
 * .Ejemplos de numeros casi-cero el 0,3 , el -0,99 o el 0,123; algunos numeros que no se consideran casi-ceros son el:
 * 12,3 el 0 o el -1.
 */
/**
 *
 * @author pedromiras
 */
public class EJ28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte un numero decimal:");
        double num=sc.nextDouble();
        
        if (num>-1&&num<1&&num!=0) {
            
            System.out.println("El numero SI es un numero CASI-CERO");
        }else{
            
            System.out.println("El numero NO es un numero CASI-CERO");
        }
    }
    
}
