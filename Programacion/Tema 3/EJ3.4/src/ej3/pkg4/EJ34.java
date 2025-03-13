/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg4;

import java.util.Random;
import java.util.Scanner;

/***
 * Codificar el juego "numero secreto", que consiste en acertar un numero entre 1 y 100(generado aleatoriamente)
 * Para ello se introduce por teclado una serie de numeros para los que se indica "mayor" o "menor" segun sea menor o
 * mayor con respecto al numero secreto. El proceso se termina cuando el usuario acierta o cuando se rinde(introduciendo-1)
 */
/**
 *
 * @author pedromiras
 */
public class EJ34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        
        // Generar un número aleatorio entre 0 y 100 (incluidos)
        int numeroSecreto = random.nextInt(100)*100+1;
        
        System.out.printf("Introduce un numero:");
        int num=sc.nextInt();
        
        while(numeroSecreto!=num && num!=-1){
            if (num>numeroSecreto) {
                System.out.println("El numero secreto es menor");
            }else{
                System.out.println("El numero secreto es mayor");
            }
            System.out.printf("Introduce un numero:");
            num=sc.nextInt();
            
        }
            if (num==numeroSecreto) {
                System.out.println("Enhorabuena, has ganado!");
            }else if(num==-1){
                System.out.println("Te rendiste. El numero secreto era:"+numeroSecreto);
               
            }
    }
    
}
