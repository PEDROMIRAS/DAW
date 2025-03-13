/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersonaempleado;

/**
 *
 * @author pedromiras
 */
public class Cliente extends Persona{
    int idCliente;

    public Cliente(String nombre, int edad, double estatura, int idCliente) {
        super(nombre, edad, estatura);
        this.idCliente = idCliente;
    }

    @Override
    public String obtenerInformacionPersona() {
        return super.obtenerInformacionPersona()+ ", idCliente: " + this.idCliente; 
    }
    
    
}
