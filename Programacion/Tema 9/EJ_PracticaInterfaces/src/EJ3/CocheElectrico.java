/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pmira
 */
public class CocheElectrico implements VehiculoElectrico{
    private String marca;
    private String modelo;
    private int capacidadBateria;

    public CocheElectrico(String marca, String modelo, int capacidadBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadBateria = capacidadBateria;
    }
    
    
    @Override
    public void cargarBateria() {
        System.out.println("Cargando bateria.");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + this.obtenerMarca() + ", modelo: " 
                + this.modelo + ", capacidad de la bateria: " + this.capacidadBateria );
    }

    @Override
    public String obtenerMarca() {
        return this.marca;
    }
    
}
