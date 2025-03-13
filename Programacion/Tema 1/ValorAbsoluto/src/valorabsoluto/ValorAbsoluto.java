/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valorabsoluto;

import java.util.Scanner;

/**
 * Escribe un programa que pida al usuario un numero entero y devuelva su valor absoluto
 * Para calcular su valor absoluto usar el ternario 
 */
/**
 *
 * @author pedromiras
 */
public class ValorAbsoluto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Inserte un numero: ");
        int num=sc.nextInt();
        
        int absoluto=num>=0?-1*num:num;
        //numero positivo es absoluto , si ingresa un numero negativo lo negamos para ponerlo positivo
        int valorAbsoluto=Math.abs(num);
        
        System.out.println("Es absoluto: "+absoluto);
        System.out.println("Esta es la otra opcion: "+valorAbsoluto);
        
    }
    
}
