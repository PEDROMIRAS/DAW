/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pedromiras
 */
public abstract class PublicacionBase implements Publicacion{
    protected Usuario autor;
    protected static int totalPublicaciones = 0;

    public PublicacionBase(Usuario autor) {
        this.autor = autor;
        PublicacionBase.totalPublicaciones++;
    }
    
    public String obtenerAutor(){
        return this.autor.getNombre();
    }
    
    public static int getTotalPublicaciones(){
        return PublicacionBase.totalPublicaciones;
    }
    
    public abstract void editarPublicacion(String nuevoContenido);
}
