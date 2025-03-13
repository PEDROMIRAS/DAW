/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4doritosmastarde;
import java.util.Scanner;
/**
 * Actividad 1.4 Escriba una aplicacion que pida el año actual y el año de nacimiento del usuario .
 * Debe calcular su edad suponiendo que en el año en curso el usuario ya ha cumplido años
 */
/**
 *
 * @author pedromiras
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc1=new Scanner(System.in);
        
       int anioActual=0, anioNacimiento=0, edad;
       
       System.out.println("Inserte el anio actual: ");
       anioActual=sc1.nextInt();
       
       System.out.println("Inserte el anio de nacimiento: ");
       anioNacimiento=sc1.nextInt();
       
       edad=anioActual-anioNacimiento;
       
       System.out.println("La edad del usuario es: "+edad);
       
    }
    
}
