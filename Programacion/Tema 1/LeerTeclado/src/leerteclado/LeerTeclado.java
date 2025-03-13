/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerteclado;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class LeerTeclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
    
    Scanner scan=new Scanner(System.in);
    scan.useLocale(Locale.US);
        double resultado;
        
        System.out.println("Digite un valor para el primer numero:");
        double a=scan.nextDouble();
        
        System.out.println("Digite un valor para el segundo numero");
        double b=scan.nextDouble();
        
        resultado=a*b;
      
        System.out.println("El resultado de la operacion es:"+resultado);
        //System.out.println(resultado);
        
    }
    
}
