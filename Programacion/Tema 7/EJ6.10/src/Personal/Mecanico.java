/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personal;

/**
 *
 * @author pedromiras
 */
public class Mecanico {
    // Definimos el enum dentro de la clase
    public enum Especialidad {
        FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR
    }
    private final String nombre;
    private int nTlfno;
    private Especialidad especialidad;
    
    public Mecanico(String nombre, int nTlfno, Especialidad especialidad){
        this.nombre = nombre;
        this.nTlfno = nTlfno;
        this.especialidad = especialidad;
        
    }

}
