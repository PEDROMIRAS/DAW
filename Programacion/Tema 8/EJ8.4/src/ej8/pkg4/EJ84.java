/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8.pkg4;

/**
 *
 * @author pedromiras
 */
public class EJ84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] melodia = {"DO", "RE", "MI", "FA", "SOL", "LA", "SI", "DO"};
       Piano piano = new Piano(melodia);
       piano.interpretar();
        
    }
    
}
