/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg17;

import java.util.Scanner;

/***
 * Crea una aplicacion que solicite al usuario una fecha(dia,mes y anio)
 * y muestre la fecha del dia siguiente.
 */
/**
 *
 * @author pedromiras
 */
public class EJ217 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
       // Solicitar la fecha al usuario
        System.out.println("Ingrese el dia:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el anio:");
        int anio = scanner.nextInt();

        // Días en cada mes, suponiendo que febrero siempre tiene 28 días
        int diasEnMes;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 -> diasEnMes = 31;
            case 4, 6, 9, 11 -> diasEnMes = 30;
            case 2 ->  diasEnMes = 28;
            default -> {
                System.out.println("Mes invalido.");
            return;
            }
        }

        // Verificar si el día ingresado es válido
        if (dia < 1 || dia > diasEnMes) {
            System.out.println("Dia invalido para el mes ingresado.");
            return;
        }

        // Calcular el día siguiente
        dia++;
        if (dia > diasEnMes) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anio++;
            }
        }
        
        // Mostrar la fecha del día siguiente
        System.out.println("La fecha del dia siguiente es: " + dia + "/" + mes + "/" + anio);
    }
    
}
