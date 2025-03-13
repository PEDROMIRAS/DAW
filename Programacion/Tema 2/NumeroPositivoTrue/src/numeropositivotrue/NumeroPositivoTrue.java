/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeropositivotrue;

import java.util.Scanner;

/***
 * 2.2 Solicita por teclado un numero int al usuario y escribe un programa
 * que muestre true o false, dependiendo de si el numero es positivo
 */
/**
 *
 * @author pedromiras
 */
public class NumeroPositivoTrue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte un numero positivo o negativo: ");
        int num1=sc.nextInt();
        
        boolean esPositivo= num1>=0;
        
        System.out.println("El numero es positivo? "+esPositivo);
        
        
    }
    
}
