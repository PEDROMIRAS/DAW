/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg11;
/***
 * Escribir una función que calcule de forma recursiva el máximo común divisor de dos números.
    Para ello sabemos:
        ? mcd(a, b):
        ? mcd(a ? b, b) si a >= b
        ? mcd(a, b - a) si b > a
        ? a si b = 0
        ? b si a = 0
 */
/**
 *
 * @author pedromiras
 */
public class EJ411 {
    
    public static int mCD(int a, int b){
        int mcd=0;
        
        if (b == 0) {
            mcd = a;
        }else if (a == 0) {
            mcd = b;
        }else if (a >= b) {
            mcd = mCD(a - b, b);
        }else if (b > a) {
            mcd = mCD(a, b - a);
        }

        return mcd;
    }
    
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        System.out.println(mCD(22,5));
    }
    
}
