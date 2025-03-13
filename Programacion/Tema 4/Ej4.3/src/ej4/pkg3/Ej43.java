/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg3;

import java.util.Scanner;

/**
 * 
 * realizar una funcion que calcule y muestre el area o el volumen de un cilindro, segun se especifique.
 * Para distinguir un caso de otro se le pasara como opcion un numero1(para el area)o el numero 2 (para el volumen)
 * ademas hay que pasarle a la funcion el radio de la base y la altura.
 * area=2*pi*radio*(altura+radio)
 * volumen=pi*radio2*altura
 */
/**
 *
 * @author pedromiras
 */
public class Ej43 {
    
    static void cilindro(int n,double radio, double altura){
        
        switch (n) {
            case 1 -> {
                double area=(2*Math.PI*radio*(altura*radio));
                System.out.println("El area es:"+area);
            }
            case 2 -> {
                double volumen=(Math.PI*Math.pow(radio,2)*altura);
                System.out.println("El volumen es:"+volumen);
            }
            default -> System.out.println("Numero invalido");
        }
      
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Area(1) o Volumen(2):");
        cilindro(sc.nextInt(),4,5);
        
        System.out.print("Area(1) o Volumen(2):");
        cilindro(sc.nextInt(),4,5);
    }
    
}
