/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialrecursividad;

/**
 *
 * @author pedromiras
 */
public class FactorialRecursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("El factorial es: "+ factorial(5));
    }
    public static long factorial(int numero){
        long resultado;
        
        if (numero == 1) {
            resultado = numero;
        }else{
            resultado = numero * factorial(numero-1);
        }
        return resultado;
    }
    
}
