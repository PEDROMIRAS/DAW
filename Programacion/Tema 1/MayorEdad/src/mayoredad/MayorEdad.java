/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mayoredad;

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class MayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        int edad;
        int mayorEdad=18;
        
        System.out.println("Indique la edad: ");
        edad=scan.nextInt();
        
        boolean menorEdad= edad<=mayorEdad;
        System.out.println("El usuario es menor de edad: "+menorEdad);
    }
    
}
