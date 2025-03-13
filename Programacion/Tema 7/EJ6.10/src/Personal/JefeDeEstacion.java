/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

import java.util.Date;

/**
 *
 * @author pedromiras
 */
public class JefeDeEstacion {
    private final String nombre;
    private final String DNI;
    private Date fechaNombramiento;
    
    public JefeDeEstacion(String nombre, String DNI, Date fechaNombramiento){
        this.nombre = nombre;
        this.DNI = DNI;
        this.fechaNombramiento = fechaNombramiento;
    }

}
