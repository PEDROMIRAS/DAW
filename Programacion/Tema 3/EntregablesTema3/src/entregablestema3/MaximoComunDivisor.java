/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema3;


import java.util.Scanner;
//Para dos números dados, a y b, es posible buscar el máximo común divisor (el número más
//grande que divide a ambos) mediante un algoritmo ineficiente pero sencillo: desde el menor
//de a y b, ir buscando, de forma decreciente, el primer número que divide a ambos
//simultáneamente (es decir, que al dividir a y b por este número, para ambos el resto es cero).
//Realiza una programa que calcule el máximo común divisor de dos números.
/**
 *
 * @author pedromiras
 */
public class MaximoComunDivisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Interse el valor de a:");
        int a=sc.nextInt();
        System.out.print("Interse el valor de b:");
        int b=sc.nextInt();
        
        // Obtener el menor de los dos números
        int menor=Math.min(a, b);
        int mcd=1;//Inicializamos MCD
        
        for (int i = menor; i >=1; i--) {
            if (a%i==0&&b%i==0) {
                mcd=i;
                break;
            } 
        }
        // Imprimir el resultado
        System.out.println("El MCD es:"+mcd);
        
        // Variable booleana para controlar el estado
        boolean encontrado = false;
        
        while (!encontrado && menor > 0) {
            if (a % menor == 0 && b % menor == 0) {
                mcd = menor; // Encontramos el MCD
                encontrado = true; // Cambiamos el estado para salir del bucle
            }
            menor--; // Decrementamos el valor de menor
        }

        // Imprimir el resultado
        System.out.println("El maximo comun divisor de " + a + " y " + b + " es: " + mcd);
    }
    
}
