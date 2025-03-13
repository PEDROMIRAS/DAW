/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg3;

import java.util.Scanner;

/***
 * Implemetar una aplicacion para calcular datos estadisticos de las edades de los alumnos de 
 * un centro educativo.  Se introducen datos hasta que uno de ellos sea negativo,  y se mostrara:
 * la suma de todas las edades introducidas, la media , el numero de alumnos y 
 * cuantos son mayores de edad.
 */
/**
 *
 * @author pedromiras
 */
public class EJ33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Introduce la edad :");
        int edad=sc.nextInt();
        
        int numAlumnos=0;
        int sumaEdad=0;
        int mayoresEdad=0;
        
        while(edad>0){
            sumaEdad+=edad;
             
            if (edad>=18) {
                mayoresEdad++;
            }
            numAlumnos++;
            
            System.out.printf("Introduce la edad :");
            edad=sc.nextInt();
        }
        int media=sumaEdad/numAlumnos;
        System.out.printf("La suma total de las edades es:"+sumaEdad+"\n");
        System.out.printf("La media de edad es: "+media+"\n");
        System.out.printf("Numero de alumnos: "+numAlumnos+"\n");
        System.out.println("Hay "+mayoresEdad+" alumnos mayores de edad.");
    }
    
}
