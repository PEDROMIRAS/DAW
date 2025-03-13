/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circulo;
import java.util.Scanner;
import java.util.Locale;
/**
 * Actividad 1.7
 * Diseñar una aplicacion que calcule la longitud y el area de una circunferencia.
 * Para ello, el ususario debe introducir el radio(que puede contener decimales).
 * Recordatorio longitud=2*pi*radio area=pi*radio^2
*/
/**
 *
 * @author pedromiras
 */
public class Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        System.out.println("Introduce el radio de la circunferencia: ");
        double radio=sc.nextDouble();
        
        double longitud=(2*Math.PI)*radio;
        double area=Math.PI*(Math.pow(radio, 2));
         
        //Math.pow(x,x) sirve para elevar el primer valor al sagundo valor
         
        System.out.println("La longitud de la circunferencia es: "+longitud);
        System.out.println("El area de la circunferencia es: "+area);     
    }
    
}
