/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg1;

import java.util.Scanner;

/***
 * Diseña una aplicacion que muestre la edad maxima y minima de un grupo de alumnos.
 * El usuario introducira las entidades y terminara con un -1.
 */
/**
 *
 * @author pedromiras
 */
public class EJ31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una edad:");
        int edad=sc.nextInt();
        
        int edadMenor=edad;
        int edadMayor=edad;
        
        while(edad!=-1){
            System.out.println("Introduce una edad:");
            edad=sc.nextInt();
            
            if (edad<edadMenor&&edad!=-1) {
                edadMenor=edad;
            }
            if (edad>edadMayor) {
                edadMayor=edad;
            }
        }
        System.out.println("La edad mas pequenia es: "+edadMenor);
        System.out.println("La edad mas grande es: "+edadMayor);
    }
    
}
