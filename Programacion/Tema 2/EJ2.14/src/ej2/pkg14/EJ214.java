/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg14;

import java.util.Scanner;

/***
 * Idear un programa que solicite al usuario un numero comprendido entre 1 y 7,
 * correspondiente a un dia de la semana, Se debe mostrar el nombre del dia de la semana
 * al que corresponde.
 */
/**
 *
 * @author pedromiras
 */
public class EJ214 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte un numero: ");
        int num=sc.nextInt();
        
        switch(num){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default-> System.out.println("Dia no valido");
        }
    }
    
}
