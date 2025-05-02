/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

import java.io.Serializable;

/**
 *
 * @author pedromiras
 */
public class Empleado implements Serializable{
    public String dni;
    public String nombre;
    public double sueldo;

    public Empleado(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    @Override //Esto lo genera el IDE, no se que es, pero vamos a probarlo, no?
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("dni=").append(dni);
        sb.append(", nombre=").append(nombre);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
    
}
