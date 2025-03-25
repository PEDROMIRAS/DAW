/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ1;

import java.util.Arrays;

/**
 *
 * @author pmira
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("23456789F", "Pedro", 17, 9);
        Estudiante e2 = new Estudiante("98765432D", "Juan", 17, 7);
        Estudiante e3 = new Estudiante("12345678C", "Alberto", 20, 8);
        Estudiante e4 = new Estudiante("87654321Q", "Rafa", 18, 7);
        Estudiante e5 = new Estudiante("56789123G", "Jose", 19, 6);
        
        
        Estudiante[] estudiantes = {e1,e2,e3,e4,e5}; 
        
        Arrays.sort(estudiantes);
        System.out.println(Arrays.toString(estudiantes));
        System.out.println();
        
        Arrays.sort(estudiantes, new CompararNombre());
        System.out.println(Arrays.toString(estudiantes));
        System.out.println();
        
        Arrays.sort(estudiantes, new CompararEdad());
        System.out.println(Arrays.toString(estudiantes));
        System.out.println();
        
        Arrays.sort(estudiantes, new CompararNotaMediaYNombre());
        System.out.println(Arrays.toString(estudiantes));
    }
    
}
