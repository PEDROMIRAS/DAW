/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package silluevenosalgo;

import java.util.Scanner;

/**
 * Diseñar un algoritmo que nos indique si podemos salir a la calle.
 * Existen aspectos que influiran en esta decision: si esta lloviendo y si hemos terminado nuestras tareas
 * Solo podremos salir a la calle si no esta lloviendo y hemos finalizado nuestras tareas .
 * Existe una opcion en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que 
 * tengamos que ir a la biblioteca(para realizar algun trabajo, entregar un libro, etc,...).Solicitar al usuario 
 * (mediante un boolean) si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca. El algoritmo
 * debe mostar mediante un boolean(true o false) si es posible que se le otorge el permiso para salir a la calle.
 */
/**
 *
 * @author pedromiras
 */
public class SiLlueveNoSalgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Esta lloviendo?");
        boolean lluvia=sc.nextBoolean();
        
        System.out.println("Has hecho la tarea?");
        boolean tarea=sc.nextBoolean();
        
        System.out.println("Tienes que ir a la biblioteca?");
        boolean biblioteca=sc.nextBoolean();
        
        boolean seSale=biblioteca || (!lluvia && tarea);
        System.out.println("Tiene permiso para salir?  "+seSale);
        
        
    }
    
}
