/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg2;

import java.util.Scanner;

/***
 * Pedir los coeficientes de una ecuacion de segundo grado y mostrar sus soluciones 
 * reales. Si no existen, habra que indicarlo. Hay que tener en cuenta que las soluciones
 * de una ecuacion de segundo grado a*x^2+b*x+c=0, son:
 * a*x^2+b*x+c=0
 * x=-b+-sqrt(b^2-4ac)/2a
 */
/**
 *
 * @author pedromiras
 */
public class EJ32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte el primer numero: ");
        int a=sc.nextInt();
        System.out.println("Insserte el segundo numero: ");
        int b=sc.nextInt();
        System.out.println("Insserte el segundo numero: ");
        int c=sc.nextInt();
        
         // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;

        // Evaluar las posibles soluciones
        if (discriminante < 0) {
            System.out.println("La ecuacion no tiene soluciones reales.");
        } else if (discriminante == 0) {
            double solucion = -b / (2 * a);
            System.out.println("La ecuaci0n tiene una solución real: x = " + solucion);
        } else {
            double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuacion tiene dos soluciones reales:");
            System.out.println("x1 = " + solucion1);
            System.out.println("x2 = " + solucion2);
        }
    }
    
}
