/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg20;

import java.util.Arrays;

/***
 * Comprueba que produce la comparacion con el operador == de dos arrays del mismo tipo, 
 * la misma longitud y los mismos valores.
/**
 *
 * @author pedromiras
 */
public class EJ520 {
    public static void compararArrays(int arrayA[], int arrayB[]){
        if (Arrays.equals(arrayA, arrayB)) {
            System.out.println("Los arrays son iguales");
        }else{
            System.out.println("Los arrays no son iguales");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayA[] = {2,3,4,5};
        int arrayB[] = {2,3,4,5};
        
        compararArrays(arrayA,arrayB);
    }
    
}
