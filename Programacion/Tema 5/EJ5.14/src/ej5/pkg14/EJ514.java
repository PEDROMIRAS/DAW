/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg14;

import java.util.Arrays;

/***
 * Leer y almacenar n numeros enteros en un array, a partir del cual se construiran otros 
 * dos arrays ,con los elementos impares en el primero y los elementos pares en el segundo. 
 * Los arrays deben mostrarse ordenados.
 */
/**
 *
 * @author pedromiras
 */
public class EJ514 {
    public static void separarNumeros(int arrayBase[]){
       
        int contadorPar = 0;
        int contadorImpar = 0;
        
        //Contamos cuantos numeros pares e impares hay
        for (int i = 0; i < arrayBase.length; i++) {
            if (arrayBase[i]%2==0) {
                contadorPar++;
            }else{
                contadorImpar++;
            }
        }
        
        //Creamos los arrayPar y arrayImpar , para pasar los valores de arrayBase respectivamente
        int arrayImpar[] = new int[contadorImpar];
        int arrayPar[] = new int[contadorPar];
        
        //Reiniciamos los contadores a 0
        contadorPar = 0;
        contadorImpar = 0;
        
        for (int num : arrayBase) {
            if (num%2==0) {
                arrayPar[contadorPar++] = num;
            }else{
                arrayImpar[contadorImpar++] = num;
            }
        }
        
        //Ordenar los arrays
        Arrays.sort(arrayPar);
        Arrays.sort(arrayImpar);
        
        // Mostrar los resultados
        System.out.println("Array de numeros pares: " + Arrays.toString(arrayPar));
        System.out.println("Array de numeros impares: " + Arrays.toString(arrayImpar));
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arrayBase = {12, 23, 12, 45, 3, 3, 4, 5, 5};

        // Llamar a la función para separar y mostrar los números
        separarNumeros(arrayBase);


    }
    
}
