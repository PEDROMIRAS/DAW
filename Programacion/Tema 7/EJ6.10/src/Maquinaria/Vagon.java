/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquinaria;

/**
 *
     * @author pedromiras
 */
public class Vagon {
    private final int id;
    private final int cargaMaxima;
    private int cargaActual;
    private String tipoMercancia;
    
    public Vagon(int id, int cargaMaxima, int cargaActual, String tipoMercancia){
        this.id = id;
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipoMercancia = tipoMercancia;
    }
    
}
