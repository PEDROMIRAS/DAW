/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg4.pkg2;

/**
 *
 * @author pedromiras
 */
public class EJ49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("El numero mas grande es: "+numMax(4,74));
        System.out.println("El numero mas grande es: "+numMax(4,76,108));
    }
    public static int numMax(int num1, int num2){
        int numMax=Math.max(num1, num2);
        return numMax;
    }
    public static int numMax(int num1 , int num2, int num3){
        int numMax ;
        
        if (num1 > num2 && num1 > num3) {
            numMax = num1;
        }else if (num1 < num2 && num2 > num3) {
            numMax = num2;
        }else {
            numMax = num3;
        }
        return numMax;
    }
    
}