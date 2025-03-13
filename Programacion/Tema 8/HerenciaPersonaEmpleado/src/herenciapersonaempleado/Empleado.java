/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersonaempleado;

/**
 *
 * @author pedromiras
 */
public class Empleado extends Persona {
    String cargo;
    double salario;
   
    public Empleado(String nombre, int edad, double estatura, String cargo, double salario) {
        super(nombre, edad, estatura);
        this.cargo = cargo;
        this.salario = salario;
    }
    public String obtenerInformacionEmpleado() {
        return obtenerInformacionPersona() + ", Cargo: " + cargo + ", Salario: $" + salario;
    }
    // Método para obtener información del empleado (sobrescribe el método de la superclase)
    @Override
    public String obtenerInformacionPersona() { // Llamada al método de la superclase
        String informacionBasica = super.obtenerInformacionPersona();
        return informacionBasica + ", Cargo: " + cargo + ", Salario: $" + salario;
    }
}
