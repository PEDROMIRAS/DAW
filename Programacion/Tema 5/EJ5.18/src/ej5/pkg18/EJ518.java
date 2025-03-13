/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg18;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Crea una funcion que realice el borrado de un elemento de un array ordenado
 */
/**
 *
 * @author pedromiras
 */
public class EJ518 {
    public static int[] eliminarNumero( int arrayBase[], int valor){
        Arrays.sort(arrayBase);
        
        int indiceBusqueda = Arrays.binarySearch(arrayBase, valor);
        int arrayAux[]= new int[arrayBase.length-1];
   
        if (indiceBusqueda < 0) {
            System.out.println("El valor no se encuentra en el array.");
            return arrayBase;
        }
        System.arraycopy(arrayBase, 0, arrayAux, 0, indiceBusqueda);
        System.arraycopy(arrayBase, indiceBusqueda+1, arrayAux, indiceBusqueda, arrayBase.length-indiceBusqueda-1);
        
        return arrayAux;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayBase[] = {1,2,3,64,6,10};
        
        System.out.printf("Inserte un numero para borrar del arrayBase: ");
        int valor = sc.nextInt();
        
        arrayBase = eliminarNumero(arrayBase,valor);
        System.out.println("El array sin "+valor+" queda tal que: "+Arrays.toString(arrayBase));
    }
    
}
