/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ1;

import java.util.Arrays;

/**
 *
 * @author pedromiras
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Futbolista[] futbolistas = {new Futbolista("123456789A", "Fran Perez", 22),
//            new Futbolista("456789123B", "Juan Fernandez", 18),
//            new Futbolista("345678912C", "Alvaro Gomez", 19),
//            new Futbolista("111111111D", "Jose Martinez", 20),
//            new Futbolista("567891234E", "Pedro Hernandez", 23)};
        
        Futbolista f1 = new Futbolista("123456789A", "Fran Perez", 22);
        Futbolista f2 = new Futbolista("456789123B", "Juan Fernandez", 18);
        Futbolista f3 = new Futbolista("345678912C", "Alvaro Gomez", 19);
        Futbolista f4 = new Futbolista("111111111D", "Jose Martinez", 20);
        Futbolista f5 = new Futbolista("567891234E", "Pedro Hernandez", 23);
        
        f1.aumentarGoles(4);
        f2.aumentarGoles(2);
        f3.aumentarGoles(1);
        f4.aumentarGoles(6);
        f5.aumentarGoles(12);
        
        Futbolista[] futbolistas = {f1,f2,f3,f4,f5};
        
        Arrays.sort(futbolistas);
        
        System.out.println("Ordenados por DNI: " + Arrays.toString(futbolistas));
        
        //-----------------------------------------------------------------------
        
        Arrays.sort(futbolistas, new ComparadorNombre());
        System.out.println();
        System.out.println("Ordenados por nombre: " + Arrays.toString(futbolistas));
        
        //-----------------------------------------------------------------------
        
        Arrays.sort(futbolistas, new ComparadorEdad());
        System.out.println();
        System.out.println("Ordenados por edad: " + Arrays.toString(futbolistas));
    }
    
}
