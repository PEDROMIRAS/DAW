/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11.pkg8;

import java.io.Serializable;

/**
 *
 * @author pedromiras
 */
public class Socio implements Serializable{
    public String numSocio;
    public String nombre;
    public int edad;

    public Socio(String numSocio, String nombre, int edad) {
        this.numSocio = numSocio;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Socio{" + "numSocio=" + numSocio + ", nombre=" + nombre + ", edad=" + edad + '}' + "\n";
    }
    
}
