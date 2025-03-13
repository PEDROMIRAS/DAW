/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej9.pkg8;
/***
 * Implementa la interfaz comparable de la clase socio para que, por defecto, se 
 * ordene segun los numeros de identificacion(id) crecientes
 */
/**
 *
 * @author pedromiras
 */
public class EJ98 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Socio s1 = new Socio(7,"Pedro", "22-09-2000");
        Socio s2 = new Socio(2,"Maria Lopez", "22-08-1985");
        
        if (s1.compareTo(s2) > 0 ) {
            System.out.println(s2);
            System.out.println(s1);
        }else if (s1.compareTo(s2) == 0) {
            System.out.println("Son el mismo socio");
        }else{
            System.out.println(s1);
            System.out.println(s2);
        }

    }
    
}
