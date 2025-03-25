/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author pmira
 */
public class Estudiante implements Comparable{
    protected String dni;
    protected String nombre;
    protected int edad;
    protected int notaMedia;
    
    public Estudiante(String dni, String nombre, int edad, int notaMedia) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    @Override 
    public String toString(){
        return "Estudiante : " + this.nombre + " con DNI: " + this.dni 
                + ", tiene " + this.edad + " anios, " + this.notaMedia 
                + " es su nota media." ;
    }
    
    @Override
    public boolean equals(Object otro){
        Estudiante otroEstudiante = (Estudiante) otro;
        return this.dni.equals(otroEstudiante.dni);
    }

    @Override
    public int compareTo(Object o) {
        Estudiante otroEstudiante = (Estudiante) o;
        return this.dni.compareTo(otroEstudiante.dni);
    } 
}
