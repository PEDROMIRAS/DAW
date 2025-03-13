/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notascuatri;

import java.util.Scanner;

/**
 * Escribir un programa que solicite al usuario las notas de los tres trimestres int
 * Mostrar las  notas en el boletin de calificaciones , y en el expediente(decimales)
 */
/**
 *
 * @author pedromiras
 */
public class NotasCuatri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Indique la nota de Programacion del primer trimestre: ");
        int notaPr1=sc.nextInt();
        
        System.out.println("Indique la nota de Programacion del segundo trimestre: ");
        int notaPr2=sc.nextInt();
        
        System.out.println("Indique la nota de Programacion del tercer trimestre: ");
        double notaPr3=sc.nextDouble();
       
        double notaExpediente=(notaPr1+notaPr2+notaPr3)/3.0;

        int notaBoletin=(int)notaExpediente;

        System.out.println("\nNota media del boletin de calificaciones: "+notaBoletin+"\n");

        System.out.println("Nota media del expediente: "+notaExpediente+"\n");
        
    }
    
}
