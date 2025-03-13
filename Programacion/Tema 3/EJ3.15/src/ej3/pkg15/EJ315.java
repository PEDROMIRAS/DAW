/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg15;

import java.util.Scanner;

/***
 * Pedir 5 calificaciones de alumnos y decir al final si hay algun suspenso
 */
/**
 *
 * @author pedromiras
 */
public class EJ315 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, examenSuspenso=0;
        
        for (int i = 0; i < 5; i++) {
            System.out.printf("Inserte un numero:");
            nota=sc.nextInt();
            
            if (nota<5) {
                examenSuspenso++;
            }
        }
        System.out.println("Hay "+examenSuspenso+" examenes suspensos.");
    }
    
}
