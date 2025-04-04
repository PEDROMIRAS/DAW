/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ3;

/**
 *
 * @author pedromiras
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Usuario alice = new Usuario("Alice");
       Usuario bob = new Usuario("Bob");
       
       //Publiaciones tipo texto
       PublicacionTexto t1 = new PublicacionTexto(alice,"Ejercicio 3 Interfaces.");
       PublicacionTexto t2 = new PublicacionTexto(bob,"Ejercicio 2 Interfaces.");
       
       //Publiaciones tipo imgaen
       PublicacionImagen i1 = new PublicacionImagen(alice,"ejemplo.com/imagenes/playa.jpg");
       PublicacionImagen i2 = new PublicacionImagen(bob,"ejemplo.com/imagenes/moto-deportiva.jpg");
       
       //Publiaciones tipo texto
       PublicacionVideo v1 = new PublicacionVideo(alice,"ejemplo.com/videos/moto-Harley-Davidson.mp4");
       PublicacionVideo v2 = new PublicacionVideo(bob,"ejemplo.com/videos/atardecer-playa.mp4");
       
       //Alice agrega publicaciones
       alice.agregarPublicacion(t1);
       alice.agregarPublicacion(i1);
       alice.agregarPublicacion(v1);
       
       //Bob agrega publiaciones
       bob.agregarPublicacion(t2);
       bob.agregarPublicacion(i2);
       bob.agregarPublicacion(v2);
       
       System.out.println("----------------------------------------------------\n");
       
       //Publiaciones Alice y Bob
       alice.mostrarPublicaciones();
       bob.mostrarPublicaciones();
       
       System.out.println("----------------------------------------------------\n");
       
       //Contenido multimedia videos
       System.out.println("-Mostrar contenido multimedia videos:");
       v1.mostrarMultimedia();
       v2.mostrarMultimedia();
       
       System.out.println("\n----------------------------------------------------\n");
       
       //Agregar reaccion a video
       System.out.println("-Reaccionando videos: ");
       v1.reaccionar("Que pasada de moto!!");
        System.out.println();
       v2.reaccionar("Menudo paisaje!!");
        System.out.println();
       v1.reaccionar("Tremenda moto!!");
       
       System.out.println("\n----------------------------------------------------\n");
       
       //Editar publiaciones
       System.out.println("-Edicion de publicaciones: ");
       t1.editarPublicacion("Caperucita Roja.");
       t2.editarPublicacion("Pedro y el lobo.");
       i1.editarPublicacion("ejemplo.com/imagenes/montania.jpg");
       i2.editarPublicacion("ejemplo.com/imagenes/moto-scooter.jpg");
       v1.editarPublicacion("ejemplo.com/videos/lamborghini-huracan-evo.mp4");
       v2.editarPublicacion("ejemplo.com/videos/montania-nevada.mp4");
       
       System.out.println("\n----------------------------------------------------\n");
       
       //Total publiaciones creadas
       System.out.println("-Total publicaciones: " + PublicacionBase.getTotalPublicaciones() + "\n" );
       
    }
    
}
