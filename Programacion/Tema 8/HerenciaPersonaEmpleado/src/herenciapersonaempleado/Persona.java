/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herenciapersonaempleado;

/**
 *
 * @author pedromiras
 */
class Persona {
    String nombre;
    int edad;
    double estatura;
// Constructor
    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }
    
    public String obtenerInformacionPersona(){
        return "Nombre: " + nombre + ", Edad: " + edad + " anios, Estatura: " + estatura + " metros";
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }
    @Override
    public boolean equals(Object otro){
        Persona otraPersona = (Persona) otro;
        boolean iguales;
        if (this.nombre.equals(otraPersona.nombre) && (this.edad == otraPersona.edad)) {
            iguales = true;
        }else{
            iguales = false;
        }
        return iguales;
    }
    
}

