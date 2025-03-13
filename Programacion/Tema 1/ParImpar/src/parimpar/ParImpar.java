/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;
import java.util.Scanner;
/**
 * Actividad 1.9 
 * Escribir un programa que pida un numero al usuario 
 * e indique mediante un literal booleano(true/falso) 
 * si el numero es par.
 */
/**
 *
 * @author pedromiras
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Inserte un numero entero: ");
        int a=sc.nextInt();
         
        boolean esPar=a%2==0;
    
        System.out.println("El numero es par: "+esPar);
        
        /*
        if(a%2==0){
        System.out.println("El numero es par");
        }
        else{
        System.out.println("El numero es impar");
        }
        */
    }
    
}
