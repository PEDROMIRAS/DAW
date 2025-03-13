/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9.pkg2;

import java.util.Scanner;

/***
* Ejercicio 2
* 
* Utilizando la lista anterior, escribir un programa en el que se encolen números
* enteros introducidos por teclado, hasta que se introduzca uno negativo. A 
* continuación, desencolarlos todos a medida que se muestran por pantalla. 
/**
 *
 * @author pedromiras
 */
public class EJ92 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaElementos lista = new ListaElementos();
        
        System.out.printf("Numero:");
        int numero = sc.nextInt();
        
        while(numero <= 0){
            lista.enconlar(numero);
            System.out.printf("Numero:");
            numero = sc.nextInt();
        }
        
        Integer numeroDesencolado = lista.desencolar();
        System.out.println("Numero de la cola: ");
        while(numeroDesencolado != null){
            System.out.println(numeroDesencolado+" ");
            numeroDesencolado = lista.desencolar();
        }
        
    }
    
}
