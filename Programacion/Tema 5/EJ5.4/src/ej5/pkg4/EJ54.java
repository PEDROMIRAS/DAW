/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5.pkg4;
/***
 * Crea un array de 10 elementos de enteros, dandole valor, a cada uno de ellos, llamamos a una funcion que incremente
 * todos los elementos en 5, llamamos a una funcion que imprima porpantalla el contenido del array(en ambas funciones, pasamos
 * el array por parametro
 */
/**
 *
 * @author pedromiras
 */
public class EJ54 {

    /**
     * @param numeros
     */
    public static void aumento(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i]+5;
        }
    }
    public static void imprimir(int numeros[]){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
    public static void imprimir2(int numeros[]){
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
    public static void main(String[] args) {
        int numeros[] = {0,1,2,3,4,5,6,7,8,9};
        
        aumento(numeros);
        System.out.println("Aqui el for normal");
        imprimir(numeros);
        
        System.out.println("\nAqui el for each");
        imprimir2(numeros);
    }
    
}
