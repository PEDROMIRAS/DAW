/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg9;

import Bombilla.Bombilla;

/**
 *
 * @author pedromiras
 */
public class EJ69 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();

        b1.encenderBombilla();
        b1.estadoBombilla(1);

        b2.encenderBombilla();
        b2.estadoBombilla(2);

        Bombilla.apagarInterruptorGeneral();
        System.out.println("Se ha apagado el interruptor general.");

        b1.estadoBombilla(1);
        b2.estadoBombilla(2);

        Bombilla.encenderInterruptorGeneral();
        System.out.println("Se ha encendido el interruptor general.");
        
        b1.estadoBombilla(1);
        b2.estadoBombilla(2);
    }
    
}
