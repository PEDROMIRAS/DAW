/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg5;
/***
 * Crear una funcion que mediante un boolean , indique si el caracter que se pasa como 
 * parametro de entrada corresponde con una vocal
 */
/**
 *
 * @author pedromiras
 */
public class EJ45 {

    public static void main(String[] args) {
        boolean resultado = esVocal('E');
        System.out.println("Es una vocal? " + resultado);
    }

    public static boolean esVocal(char letra) {
        
        letra = Character.toLowerCase(letra);

        // Verificar si es una vocal
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            return true; // Es una vocal
        } else {
            return false; // No es una vocal
        }
    }
}
