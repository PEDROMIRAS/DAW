/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej11.pkg9;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author pedromiras
 */
public class Temperatura implements Serializable{
    public int temp;
    LocalDateTime horaActual;

    public Temperatura(int temp) {
        this.temp = temp;
        this.horaActual = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Temperatura= " + temp + ", horaActual= " + horaActual+ "\n";
    }
    
    
}
