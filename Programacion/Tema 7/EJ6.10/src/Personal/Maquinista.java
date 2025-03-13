/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author pedromiras
 */
public class Maquinista {
    public enum Rango {
        PRINCIPIANTE, INTERMEDIO, AVANZADO, EXPERTO
    }

    private final String nombre;
    private final String DNI;
    private double sueldo;
    private Rango rango;

    public Maquinista(String nombre, String DNI, double sueldo, Rango rango) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.sueldo = sueldo;
        this.rango = rango;
    }
    
}
