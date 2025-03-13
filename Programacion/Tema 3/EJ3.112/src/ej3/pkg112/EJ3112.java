/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg112;
/**
 * Diseñar un programa que muestre la suma de los 10 primeros impares
 */
/**
 *
 * @author pedromiras
 */
public class EJ3112 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int suma=0;
        
        for (int i =1; i <=20; i++) {
            if (i%2!=0) {
                System.out.println(i);
                suma+=i;
            }
            
        }
        System.out.println(suma);
    }
    
}
