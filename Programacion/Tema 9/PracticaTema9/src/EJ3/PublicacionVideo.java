/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pedromiras
 */
public class PublicacionVideo extends PublicacionBase implements PublicacionConMultimedia, PublicacionInteractiva{
    private String urlVideo;
    private int reacciones;

    public PublicacionVideo(Usuario autor, String urlVideo) {
        super(autor);
        this.urlVideo = urlVideo;
        this.reacciones = 0;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Autor: " + obtenerAutor());
        System.out.println("Tipo de publiacion: VIDEO");
        System.out.println("Reacciones: " + this.reacciones);
    }

    @Override
    public void mostrarMultimedia() {
        System.out.println("Reproduciendo video: " + this.urlVideo);
    }

    @Override
    public void reaccionar(String reaccion) {
        System.out.println(reaccion);
        this.reacciones++;
        //System.out.println("Numero de reacciones: " +this.reacciones);
    }
    
    @Override
    public void editarPublicacion(String nuevoContenido) {
        this.urlVideo = nuevoContenido;
        System.out.println("Nueva URL del video: " + this.urlVideo);
    }
}
