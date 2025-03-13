/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9.pkg5;

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ95 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListaElementos lista = new ListaElementos();
        
        System.out.printf("Numero:");
        int numero = sc.nextInt();
        
        while(numero <= 0){
            lista.apilar(numero);
            System.out.printf("Numero:");
            numero = sc.nextInt();
        }
        
        Integer numeroDesencolado = lista.desapilar();
        System.out.println("Numero de la cola: ");
        while(numeroDesencolado != null){
            System.out.println(numeroDesencolado+" ");
            numeroDesencolado = lista.desapilar();
        }   
    }
    
}
