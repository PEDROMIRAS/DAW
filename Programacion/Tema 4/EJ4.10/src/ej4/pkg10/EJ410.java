/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4.pkg10;
/***
 * Crea una funcion que calcule a^n donde a es real y n es entero no negativo, realizar una funcion iterativa y otra recursiva
 */
/**
 *
 * @author pedromiras
 */
public class EJ410 {
    
    public static double elevado(double a, int n){
        double numeroElevadoN;
        
        if (n<0) {
            System.out.println("Potencia no valida");
            return 0;
            
        }else if(n == 0) {
            return 1.0;
            
        } else{
            
          numeroElevadoN= Math.pow(a, n);
        }
        
        return numeroElevadoN;
    }
    
    public static double elevadoIterativo(double a , int n){
        double numeroElevadoN=1.0;
        
        if (n<0) {
            System.out.println("Potencia no valida.");
            return 0;
            
        }else if (n == 0) {
            return 1.0;
            
        }else{
            for (int i = 0; i < n; i++) {
                numeroElevadoN *= a;
            }
        }
        return numeroElevadoN;
    }
    
    public static double elevadoRecursivo(double a, int n) {
        if (n < 0) {
            System.out.println("El exponente no puede ser negativo.");
            return 0.0;
        }
        if (n == 0) {
            return 1.0; 
        }
        return a * elevadoRecursivo(a, n - 1);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(elevado(2,5));
        System.out.println(elevadoIterativo(2,4));
        System.out.println(elevadoRecursivo(2,3));
        
    }
    
}
