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
        
        Futbolista f1 = new Futbolista("12345678A", "Fran Perez", 22, 2);
        Futbolista f2 = new Futbolista("45678912B", "Juan Fernandez", 18, 4);
        Futbolista f3 = new Futbolista("34567891C", "Alvaro Gomez", 19, 6);
        Futbolista f4 = new Futbolista("11111111D", "Jose Martinez", 20, 3);
        Futbolista f5 = new Futbolista("56789123E", "Pedro Hernandez", 17, 12);
        
//        f1.aumentarGoles(4);
//        f2.aumentarGoles(2);
//        f3.aumentarGoles(1);
//        f4.aumentarGoles(6);
//        f5.aumentarGoles(12);
        
        Futbolista[] futbolistas = {f1,f2,f3,f4,f5};
        
        System.out.println("Ordenados por DNI:");
        Arrays.sort(futbolistas);
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
        
        System.out.println("--------------------------------------------------------------------------");
        
        System.out.println("\nOrdenados por Nombre:");
        Arrays.sort(futbolistas, new ComparadorNombre());
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
        
        System.out.println("--------------------------------------------------------------------------");
        
        System.out.println("\nOrdenados por Edad:");
        Arrays.sort(futbolistas, new ComparadorEdad());
        for (Futbolista f : futbolistas) {
            System.out.println(f);
        }
    }
    
}
