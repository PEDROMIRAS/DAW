/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distintasvariables;

import java.util.Scanner;
import javax.swing.*;

/***
 * 2.1 Realiza un programa que almacene la evaluacion de distintas expresiones relacionales 
 * en variables booleanas, y muestre el valor de dichas variables.
 */
/**
 *
 * @author pedromiras
 */
public class DistintasVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte un valor para a: ");
        int a=sc.nextInt();
        System.out.println("Inserte un valor para b: ");
        int b=sc.nextInt();
        
        boolean expresion1=a!=b;
        boolean expresion2=a+b<=12;
        boolean expresion3=a+3>=8;
        
        System.out.println("El valor de la expresion 1 --> a!=b es: "+expresion1);
        System.out.println("El valor de la expresion 2 --> a+b<=18 es : "+expresion2);
        System.out.println("El valor de la expresion 3 --> a+3>=8 es :"+expresion3);   
    }
    
}
