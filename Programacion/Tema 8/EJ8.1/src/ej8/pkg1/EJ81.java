/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8.pkg1;

/**
 *
 * @author pedromiras
 */
public class EJ81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora h = new Hora(23, 59);
        System.out.println(h); // HORA: 23:59

        h.inc();
        System.out.println(h); // HORA: 00:00

        h.setHora(7);
        h.setMinutos(59);
        System.out.println(h); // HORA: 15:30
        
        h.inc();
        System.out.println(h); // HORA: 16:00
    }
    
}
