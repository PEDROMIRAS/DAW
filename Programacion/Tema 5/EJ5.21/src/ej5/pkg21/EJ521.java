/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg21;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/***
 * Desarrollar el juego "la cámara secreta", que consiste en abrir una cámara mediante su combinación secreta, 
 * que está formado por una combinación de dígito del 1 al 5. El jugador especificará cuál es la longitud de la 
 * combinación; a mayor longitud, mayor será la dificultad del juego. La aplicación genera, de forma aleatoria, 
 * una combinación secreta que el usuario tendrá que acertar. En cada intento se muestra como pista, para cada 
 * dígito de la combinación introducido por el jugador, si es mayor, menor o igual que el correspondiente en la
 * combinación secreta.
 */
/**
 *
 * @author pedromiras
 */
public class EJ521 {
    public static int[] rellenarCombinacionJugador(int longitud){
        Scanner sc = new Scanner(System.in);
        int combiJugador[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            System.out.printf("Inserta el numero "+ (i+1) +" de tu combinacion: ");
            combiJugador[i]= sc.nextInt();
        }
        return combiJugador;
    }
    public static int[] rellenarCombinacionSecreta(int longitud){
        Random random = new Random();
        int combiSecreta[] = new int[longitud];
        for (int i = 0; i < longitud; i++) {
            combiSecreta[i]= random.nextInt(5) + 1;
        }
        return combiSecreta;
    }
    public static void pistaCamaraSecreta(int combiJugador[], int combiSecreta[]){
        for (int i = 0; i < combiJugador.length; i++) {
                    if (combiJugador[i]==combiSecreta[i]) {
                        System.out.println("El numero "+ (i+1) +" es correcto");
                    }else if (combiJugador[i] < combiSecreta[i]) {
                        System.out.println("El numero "+ (i+1) +" debe ser mayor");
                    }else{
                        System.out.println("El numero "+ (i+1) +" debe ser menor");
                    }
 
        }
        System.out.println();
    }
    public static void camaraSecreta(int combiJugador[], int combiSecreta[],int longitud){
        do {
            System.out.println("\nLa contrasenia no es correcta, te daremos unas pistas.\n");
            pistaCamaraSecreta(combiJugador, combiSecreta);
            combiJugador = rellenarCombinacionJugador(longitud);
        } while (!Arrays.equals(combiJugador, combiSecreta));
            System.out.println("\nEnhorabuena, has conseguido arrbir la camara secreta!");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("Indique la longitud maxima de la combinacion: ");
        int longitud = sc.nextInt();
        
        int combiJugador[] = rellenarCombinacionJugador(longitud);
        int combiSecreta[] = rellenarCombinacionSecreta(longitud);
       
        camaraSecreta(combiJugador,combiSecreta,longitud);
    }
    
}
