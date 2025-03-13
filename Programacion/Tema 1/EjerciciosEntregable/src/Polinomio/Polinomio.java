/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polinomio;
/***
 * Dado el siguiente polinomio de segundo grado:
 * y=ax^2+bx+c
 * Crea un programa que pida los coeficientes a, b, c, asi como el valor de x, 
 * y calcular el valor correspondiente de y.
 */
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class Polinomio {
    public static void main(String[] args){
        int a, b, c ,x;
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Inserte el valor de a:");
        a=sc.nextInt();
        
        System.out.print("Inserte el valor de b:");
        b=sc.nextInt();
        
        System.out.print("Inserte el valor de c:");
        c=sc.nextInt();
        
        System.out.print("Inserte el valor de x:");
        x=sc.nextInt();
        
        int polinomio=(int)(a*Math.pow(x, 2)+b*x+c);
        
        System.out.println("El resultado del polinomio es: "+polinomio);
        
        
    }
}
