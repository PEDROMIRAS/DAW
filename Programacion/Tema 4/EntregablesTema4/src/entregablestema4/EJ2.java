/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema4;

import java.util.Scanner;

/***
 * Ejercicio 2
    Diseña una función a la que se le pasan las horas y minutos de dos instantes de tiempo, con el
    siguiente prototipo:
    static int diferenciaMin(int hora1, int minuto1, int hora2, int minuto2)
    La función devolverá la cantidad de minutos que existen de diferencia entre los dos instantes
    utilizados (el valor devuelto por la función debe de ser siempre positivo).
 */
/**
 *
 * @author pedromiras
 */
public class EJ2 {
    public static int diferenciaMin( int hora1,int minuto1, int hora2, int minuto2){
        
        int minutosHoras1 = (hora1 * 60) + minuto1;
        int minutosHoras2 = (hora2 * 60) + minuto2;
        
        int diferencia;
        
        if (minutosHoras2 < minutosHoras1) {
            diferencia = minutosHoras1 - minutosHoras2;
        }else{
            diferencia = minutosHoras2 - minutosHoras1;
        }
       
        return diferencia;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.printf("Ingrese la hora del primer tiempo (0-23): ");
        int hora1 = sc.nextInt();
        System.out.printf("Ingrese los minutos del primer tiempo (0-59): ");
        int minuto1 = sc.nextInt();

        System.out.printf("Ingrese la hora del segundo tiempo (0-23): ");
        int hora2 = sc.nextInt();
        System.out.printf("Ingrese los minutos del segundo tiempo (0-59): ");
        int minuto2 = sc.nextInt();

        
        int diferencia = diferenciaMin(hora1, minuto1, hora2, minuto2);
        System.out.println("La diferencia de minutos es: " + diferencia + " minutos.");
    }
    
}
