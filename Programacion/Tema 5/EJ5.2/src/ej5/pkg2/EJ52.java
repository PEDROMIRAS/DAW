/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg2;

/**
 *
 * @author pedromiras
 */
public class EJ52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numeros[] = {0,1,2,3,4,5,6,7,8,9};
        int a[] = numeros;
        int b[] = numeros;
       
        System.out.println("Referencia a memoria de numeros es: "+numeros);
        System.out.println("La referencia en memoria de a es:" +a);
        System.out.println("La referencia en memoria de b es: "+b);
        
        System.out.println("El valor 4 del array numeros desde b es: "+b[4]);
        
        
    }
    
}
