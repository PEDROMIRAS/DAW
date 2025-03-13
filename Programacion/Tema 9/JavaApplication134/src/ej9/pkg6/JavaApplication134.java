/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9.pkg6;

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class JavaApplication134 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cola cola = new Cola(){
            Lista l = new Lista();
            @Override
            public void enconlar(Integer num) {
                l.insertarFinal(num);
            }

            @Override
            public Integer desencolar() {
                return l.eliminarElemento(0);
            }
            
        };
        
        System.out.printf("Numero:");
        int numero = sc.nextInt();
        
        while(numero <= 0){
            cola.enconlar(numero);
            System.out.printf("Numero:");
            numero = sc.nextInt();
        }
        
        Integer numeroDesencolado = cola.desencolar();
        System.out.println("Numero de la cola: ");
        while(numeroDesencolado != null){
            System.out.println(numeroDesencolado+" ");
            numeroDesencolado = cola.desencolar();
        }
    }
    
}
