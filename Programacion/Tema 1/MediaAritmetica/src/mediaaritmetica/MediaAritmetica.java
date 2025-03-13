/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaaritmetica;

import java.util.Scanner;

/**
 * Actividad 1.6
 * Crea una aplicacion que calcule la media aritmetica de dos notas enteras 
 * hay que tener en cuenta que la media puede tener decimales.
 */
/**
 *
 * @author pedromiras
 */
public class MediaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Indique la nota del primer examen: ");
        int nota1=sc.nextInt();
        System.out.println("Indique la nota del segundo examen: ");
        int nota2=sc.nextInt();
        
        double media=(nota1+nota2)/2.0;
        
        System.out.println("La media de los dos examenes es: "+media);
    }
    
}
