/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema3;
//El programa primero debe pedir al usuario cuántas personas desea clasificar según su edad.
//Luego, se le solicitarán las edades de esas personas. Al final, el programa debe contar y mostrar
//cuántas personas son:
//- Menores de edad (menos de 18 años).
//- Adultos jóvenes (entre 18 y 35 años inclusive).
//- Mayores de 35 años.
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EdadPersonas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario un numero de personas
        System.out.printf("Introduce numero de personas: ");
        int n = scanner.nextInt();
        int edad, menorEdad=0, adultoJoven=0, adulto=0;
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Ingrese la edad: ");
            edad=scanner.nextInt();
            
            if (edad<18) {
                menorEdad++;
            }else if (edad>=18&&edad<=35) {
                adultoJoven++;
            }else if(edad>35){
                adulto++;
            }
        }
        System.out.println();
        System.out.println("Hay "+menorEdad+" persona/s menor/es de edad (menores de 18 anios).");
        System.out.println("Hay "+adultoJoven+" persona/s adulto/s jovene/s (entre 18 y 35 anios).");
        System.out.println("Hay "+adulto+" persona/s adulta/s (mayores de 35 anios).");
    }
    
}
