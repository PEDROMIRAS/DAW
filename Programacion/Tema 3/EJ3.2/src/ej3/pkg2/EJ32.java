/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.pkg2;
import java.util.Scanner;
/***
 * Diseñar una applicacion que muestre por pantalla cada numero introducido por teclado , si es par
 * o si es positivo y su cuadrado . El proceso se repetira hasta que el numero sea 0.
 */
/**
 *
 * @author pedromiras
 */
public class EJ32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Introduce un numero :");
        int num=sc.nextInt();
        
        while(num!=0){
            if(num%2==0) {
                System.out.println("El numero es par");
            }else{
                System.out.println("El numero es impar");
            }
            if (num>0) {
                System.out.println("El numero es positivo");
            }else{
                System.out.println("El numero es negativo");
            }
            int cuadrado=num*num;
            System.out.println("El cuadrado del numero es: "+cuadrado+"\n");
            
            System.out.printf("Introduce un numero :");
            num=sc.nextInt();
        }
    }
    
}
