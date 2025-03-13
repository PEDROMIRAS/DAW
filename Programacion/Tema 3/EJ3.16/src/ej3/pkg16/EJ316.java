/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg16;

import java.util.Scanner;
//Pedir 6 calificaciones de alumnos y decir la cantidad de alumnos aprobados condicionados (nota igual a 4) y suspensos.
/**
 *
 * @author pedromiras
 */
public class EJ316 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota, alumnoSuspenso=0, alumnoCondicionado=0, alumnoAprobado=0;
        
        for (int i = 0; i < 6; i++) {
            System.out.printf("Inserte un numero:");
            nota=sc.nextInt();
            
            if (nota>=5) {
                alumnoAprobado++;
            }else if(nota==4){
                alumnoCondicionado++;
            }else{
                alumnoSuspenso++;
            }
        }
        System.out.println("Hay "+alumnoAprobado+" alumnos aprobados, "+alumnoCondicionado+" alumnos condicionados y "+alumnoSuspenso+" alumnos suspensos.");
    }
    
}
