/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg17;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Escribir una funcion : int[] eliminarMayores(int t[], int valor), que crea y devuelve una copia
 * del array t donde han eliminado todos los elementos que son mayores que valor.
 */
/**
 *
 * @author pedromiras
 */
public class EJ517 {
    public static int[] eliminarMayores(int arrayBase[], int valor){
        int contadorAux = 0;
        
        for (int i = 0; i < arrayBase.length; i++) {
            if (arrayBase[i] <=valor) {
                contadorAux++;
            }
        }
        int arrayAux[] = new int[contadorAux];
        int indice = 0;
        for (int i = 0; i < arrayBase.length; i++) {
            if (arrayBase[i] <=valor) {
                arrayAux[indice] = arrayBase[i];
                indice++;
            }
        }
        //Arrays.sort(arrayAux);
        return arrayAux;
    }
    public static int[] eliminarMayoresOrdenados(int arrayBase[], int valor){
        Arrays.sort(arrayBase);
        int indiceBusqueda = Arrays.binarySearch(arrayBase, valor);
        int arrayAux[]= new int[arrayBase.length];
   
        if (indiceBusqueda < 0) {
            indiceBusqueda = -indiceBusqueda -1;
        }
         // Copiar los elementos hasta la posición de inserción
        System.arraycopy(arrayBase, 0, arrayAux, 0, indiceBusqueda+1);
        return arrayAux;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrayBase[] = {1,2,3,64,6,76,23,34,865,10};
        
        System.out.printf("Inserte un numero para borrar los numeros mayores que dicho numero del arrayBase: ");
        int valor = sc.nextInt();
        
        arrayBase = eliminarMayores(arrayBase,valor);
        System.out.println("El array sin los numeros mayores que "+valor+" queda tal que: "+Arrays.toString(arrayBase));
        
        arrayBase = eliminarMayoresOrdenados(arrayBase,valor);
        System.out.println("El array sin los numeros mayores que "+valor+" queda tal que: "+Arrays.toString(arrayBase));
    }
    
}
