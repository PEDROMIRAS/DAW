/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquinaria;

import Personal.Maquinista;

/**
 *
 * @author pedromiras
 */

public class Tren {
    private final Locomotora locomotora;
    private final Vagon[] vagones;
    private final Maquinista maquinista;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = new Vagon[5]; // Máximo 5 vagones
        this.numVagones = 0;
    }

    public void agregarVagon(Vagon vagon) {
        if (numVagones < 5) {
            vagones[numVagones] = vagon;
            numVagones++;
        } else {
            System.out.println("No se pueden agregar mas vagones. Capacidad maxima alcanzada.");
        }
    }
}