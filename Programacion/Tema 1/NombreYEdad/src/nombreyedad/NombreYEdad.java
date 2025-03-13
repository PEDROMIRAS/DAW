/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombreyedad;

import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class NombreYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String nombre;
        int edad, edadAnio;
        
        System.out.println("Indique su nombre: ");
        nombre=scan.nextLine();
        
        System.out.println("Indique la edad: ");
        edad=scan.nextInt();
        
        edadAnio=edad+1;
        
        System.out.println("El nombre es: "+nombre+" y la edad es: "+ edadAnio);
    }
    
}
