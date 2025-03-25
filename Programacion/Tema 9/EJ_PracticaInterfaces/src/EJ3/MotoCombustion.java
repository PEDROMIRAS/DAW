/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pmira
 */
public class MotoCombustion implements VehiculoCombustion{
    private String marca;
    private String modelo;
    private int capacidadDeposito;

    public MotoCombustion(String marca, String modelo, int capacidadDeposito) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadDeposito = capacidadDeposito;
    }
    
    
    @Override
    public void llenarTanque() {
        System.out.println("Llenando tanque...");
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Marca: " + this.obtenerMarca() + ", modelo: " 
                + this.modelo + ", capacidad de la bateria: " + this.capacidadDeposito);
    }

    @Override
    public String obtenerMarca() {
        return this.marca;
    }
    
}
