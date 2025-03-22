/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pedromiras
 */
public class PublicacionImagen extends PublicacionBase implements PublicacionConMultimedia{
    
    private String urlImagen;

    public PublicacionImagen(Usuario autor, String urlImagen) {
        super(autor);
        this.urlImagen = urlImagen;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Autor: " + obtenerAutor());
        System.out.println("Tipo de publicacion: IMAGEN");
    }

    @Override
    public void mostrarMultimedia() {
        System.out.println("Imagen: " + this.urlImagen);
    }
    
    @Override
    public void editarPublicacion(String nuevoContenido) {
        this.urlImagen = nuevoContenido;
        System.out.println("Nueva URL de la imagen: " +this.urlImagen);
    }
}
