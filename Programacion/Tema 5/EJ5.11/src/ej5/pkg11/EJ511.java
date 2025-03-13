/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg11;

import java.util.Arrays;
import java.util.Scanner;

/***
 * Escribe una funcion int buscar(int t[], int clave), que busca de forma secuencial en el array t 
 * el valor clave. En caso de encontrarlo, devuelve en que posicion lo encuentray en caso contrario, 
 * devolvera -1.
 */
/**
 *
 * @author pedromiras
 */
public class EJ511 {
    public static int buscar(int t[], int clave){
        int indiceBusqueda = 0;
        while(indiceBusqueda < t.length && t[indiceBusqueda] != clave){
            indiceBusqueda++;
        }
        if (indiceBusqueda < t.length) {
            return indiceBusqueda+1;
        }
        return -1;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t[] = {0,1,2,3,4,5,6,7,8,9};
        
        // Solicitar la longitud del array al usuario
        System.out.print("Introduce la clave a buscar: ");
        int clave = sc.nextInt();

        // Generar el array y mostrarlo
        int resultado = buscar(t,clave);
        System.out.println("La clave esta en la posicion: "+resultado);
        
    }
    
}
