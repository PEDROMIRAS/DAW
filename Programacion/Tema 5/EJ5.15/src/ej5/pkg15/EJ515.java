/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg15;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Escribe en una funcion con el comportamiento de la insercion ordenada
 */
/**
 *
 * @author pedromiras
 */
public class EJ515 {
    public static void insercionPedro(int array[], int num){
        int arrayAux[] = new int[array.length+1];
        
        for (int i = 0; i < array.length; i++) {
            if (num>array[i]) {
                arrayAux[i]=array[i];
            }else if (num<array[i]) {
                arrayAux[i+1] = array[i];
            }
            
        }
        for (int i = 0; i < arrayAux.length; i++) {
            if (arrayAux[i]==0) {
                arrayAux[i]= num;
            }
        }
    
        //Arrays.copyOf(arrayAux, arrayAux.length);
        System.out.println(Arrays.toString(arrayAux));
    }
    public static void insercionOrdenada2(int array[],int num){
        int arrayAux[] = new int[array.length+1];
        
        int indiceBusqueda = Arrays.binarySearch(array, num);
        if (indiceBusqueda<0) {
            indiceBusqueda = -indiceBusqueda - 1;
        }
        
        System.arraycopy(array, 0, arrayAux, 0, indiceBusqueda);
        System.arraycopy(array, indiceBusqueda, arrayAux, indiceBusqueda+1,array.length-indiceBusqueda );
        
        arrayAux[indiceBusqueda]=num;
        //array=null;
        System.out.println(Arrays.toString(arrayAux));
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int array[] = {1,2,6,8};
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.printf("Inserte un numero a insertar en el array:");
        num = scan.nextInt();
        
        insercionOrdenada2(array,num);
        insercionPedro(array,num);
    }
    
}
