/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg4;
//Diseñar una funcion que recibe como parametros dos numeros enteros y devuelve el maximo de ambos
/**
 *
 * @author pedromiras
 */
public class EJ44 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(numMax(4,76));
    }
    public static int numMax(int num1, int num2){
        int numMax=Math.max(num1, num2);
        return numMax;
    }
    
}
