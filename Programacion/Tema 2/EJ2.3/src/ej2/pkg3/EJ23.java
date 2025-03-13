/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg3;

import java.util.Scanner;

/***
 * Escribe un aplicacion que pida al usuario dos numeros enteros y muestre true. Si ambos numeros son 
 * distintos entre si o alguno de ellos es cero y false en caso contrario.
 */
/**
 *
 * @author pedromiras
 */
public class EJ23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Inserte un numero: ");
        int num1=sc.nextInt();
        System.out.println("Inserte un numero: ");
        int num2=sc.nextInt();
        
        boolean esVerdadero=num1!=num2||(num1==0||num2==0);
        
        System.out.println("Es verdadera la expresion-->=num1!=num2||(num1==0||num2==0): "+esVerdadero);
    }
    
}
