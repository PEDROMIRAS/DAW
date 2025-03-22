/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pedromiras
 */
public class PublicacionTexto extends PublicacionBase{
    
    private String contenido;

    public PublicacionTexto(Usuario autor, String contenido) {
        super(autor);
        this.contenido = contenido;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Autor: " + obtenerAutor()); 
        System.out.println("Tipo publicacion: TEXTO");
        System.out.println("Conetenido : " + this.contenido);
    }
    
    @Override
    public void editarPublicacion(String nuevoContenido) {
        this.contenido = nuevoContenido;
        System.out.println("Nuevo contenido: " +this.contenido);
    }

    
    
}
