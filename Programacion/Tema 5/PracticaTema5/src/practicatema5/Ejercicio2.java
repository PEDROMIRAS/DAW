/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicatema5;

import java.util.Arrays;
import java.util.Random;

/***
 * Ejercicio 2
    Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los elementos
    contenidos en el array t. Si el array estuviera ordenado, dejaría de estarlo.
/**
 *
 * @author pedromiras
 */
public class Ejercicio2 {
    public static void desordenar(int t[]){
        Random random = new Random();
        int arrayAux[] = new int[t.length];
        boolean arrayVerificador[] = new boolean[t.length];
        
        //Algoritmo multiArray para verificar
        for (int i = 0; i < t.length; i++) {
            int indiceAleatorio;
            do {
                indiceAleatorio = random.nextInt(t.length);
            } while (arrayVerificador[indiceAleatorio]);
            
            arrayVerificador[indiceAleatorio] = true;
            arrayAux[i]= t[indiceAleatorio];
        }
         // Copiar el array desordenado de vuelta al original
        //System.arraycopy(arrayAux, 0, t, 0, t.length);
        
        //Algoritmo de desordenacion aleatoria
        for (int i = t.length - 1; i > 0; i--) {
            int j = random.nextInt(i+1);
            int temp = t[i];
            t[i] = t[j];
            t[j] = temp;
        }
        System.out.println("El array desordenado es: "+Arrays.toString(t));
        System.out.println("El array desordenado es: "+Arrays.toString(arrayAux));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arrayBase[] = {1,2,3,4,5,6,7,8,9};
        
        System.out.println("El orden del array base es: "+Arrays.toString(arrayBase)+"\n");
        desordenar(arrayBase);
    }
    
}
