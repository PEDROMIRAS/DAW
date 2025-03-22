/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author pedromiras
 */
public class Futbolista implements Comparable{
    private final String dni;
    protected String nombre;
    protected int edad;
    private int numGoles;

    public Futbolista(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numGoles = 0;
    }
    
    public  int getNumGoles(){
        return this.numGoles;
    }
    
    public void aumentarGoles(int goles){
        this.numGoles += goles;
    }
    
    @Override
    public String toString(){
        
        return "\nInformacion Futbolista : \n DNI: "+ this.dni +", Nombre: " + this.nombre + 
                ", Edad: " + this.edad + ", Numero de goles: " + getNumGoles();
        
//        return "\nInformacion:\nDNI: " + this.dni + 
//               "\nNombre: " + this.nombre + 
//               "\nEdad: " + this.edad + 
//               "\nNumero de goles: " + getNumGoles() + "\n";
    }
    
    @Override
    public boolean equals(Object otro){
        if (otro == null || this.getClass() != otro.getClass()) {
            return false;
        }
        
        boolean mismoFutbolista = false;
        Futbolista otroFutbolista = (Futbolista) otro;
        
        if (this.dni.equals(otroFutbolista.dni)) {
            mismoFutbolista = true;
        }
        
        return mismoFutbolista;
        
    }
    
    @Override
    public int compareTo(Object o){
        return this.dni.compareTo(((Futbolista)o).dni);
    }
}
