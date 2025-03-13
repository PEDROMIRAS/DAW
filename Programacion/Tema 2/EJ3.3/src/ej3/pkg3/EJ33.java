/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg3;

import java.util.Scanner;

/***
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma, insuficiente(0-4), 
 * suficiente(5), notable(7-8) y sobresaliente (9-10)
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
        
        System.out.println("Inserte la nota del examen: ");
        int nota=sc.nextInt();
        
        switch(nota){
            case 0,1,2,3,4 -> System.out.println("La calificacion es insuficiente "+nota);
            case 5 -> System.out.println("La calificacion es suficiente "+nota);
            case 6 -> System.out.println("La calificacion es bien "+nota);
            case 7,8 -> System.out.println("La calificacion es notable "+nota);
            case 9,10 -> System.out.println("La calificacion es sobresaliente "+nota);
            default-> System.out.println("Nota no valida");
        }
//        switch(nota){
//            case 0,1,2,3,4:
//                System.out.println("La calificacion es insuficiente "+nota);
//                break;
//            case 5:
//                System.out.println("La calificacion es suficiente "+nota);
//                break;
//            case 6:
//                System.out.println("La calificacion es bien "+nota);
//                break;
//            case 7,8:
//                System.out.println("La calificacion es notable "+nota);
//                break;
//            case 9,10:
//                System.out.println("La calificacion es sobresaliente "+nota);
//                break;
//        }

        if (nota==0||nota==1||nota==2||nota==3||nota==4) {
            System.out.println("Tu nota es insuficiente "+nota);
        }else if (nota==5) {
            System.out.println("Tu nota es suficiente "+nota);
        }else if (nota==6) {
            System.out.println("Tu nota esta es un bien "+nota);
        }else if (nota==7||nota==8) {
            System.out.println("Tu nota es un notable "+nota);
        }else if (nota==9||nota==10) {
            System.out.println("Tu nota es un sobresaliente "+nota);
        }
 
       
    }   
}
