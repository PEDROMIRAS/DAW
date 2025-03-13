/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg6;

import ej6.pkg6.Hora.Hora;
import java.util.Scanner;

/***
* Ejercicio 6
* Escribir un programa que lea por teclado una hora cualquiera y un número n que representa una cantidad
* en segundos. El programa mostrará la hora introducida y las n siguientes, que se diferencian en un segundo. 
* Para ello hemos de diseñar previamente la clase Hora que dispone de los atributos hora, minuto y segundo. 
* Los valores de los atributos se controlarán mediante métodos get/set.
/**
 *
 * @author pedromiras
 */
public class EJ66 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//        Hora hora;
        
        System.out.printf("Inserte la hora: ");
        int h = sc.nextInt(); 
        System.out.printf("Inserte los minutos: ");
        int min = sc.nextInt();
        System.out.printf("Inserte los segundos: ");
        int seg = sc.nextInt();
        
        System.out.println();
        System.out.printf("Inserte N: ");
        int n = sc.nextInt();
        
//        hora = new Hora(h,min,seg);
//        
//        //hora.mostrarHora();
//        
//        hora.aumentarHora(n);
        
        //Con get y set , usando un constructor vacio como si fuera el por defecto
        Hora hora2 = new Hora();
        
        hora2.setHora(h);
        hora2.setMinutos(min);
        hora2.setSegundos(seg);
        
        hora2.aumentarHora(n);
        
        
        
    }
    
}
