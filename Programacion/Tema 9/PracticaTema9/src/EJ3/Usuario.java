/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

import java.util.Arrays;

/**
 *
 * @author pedromiras
 */
public class Usuario {
    protected String nombre;
    protected Publicacion[] publicaciones;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.publicaciones = new Publicacion[0];
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void agregarPublicacion(Publicacion publicacion){
        publicaciones = Arrays.copyOf(publicaciones, publicaciones.length+1);
        publicaciones[publicaciones.length-1] = publicacion;
    }
    
    public void mostrarPublicaciones(){
        System.out.println("*Publicaciones de " + this.nombre + ":");

        if (publicaciones.length == 0) {
            System.out.println("  - No tiene publicaciones.");
        } else {
            for (Publicacion publicacion : publicaciones) {
                publicacion.mostrarDetalles(); // Llamada a un pseudo toString()
                System.out.println();
            }
        }
    }
}
