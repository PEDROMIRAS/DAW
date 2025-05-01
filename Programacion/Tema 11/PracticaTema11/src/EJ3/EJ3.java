/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
*Ejercicio 3
* Un libro de firmas es útil para recoger los nombres de todas las personas que 
* han pasado por un determinado lugar. Crea una aplicación que permita mostrar 
* el libro de firmas o insertar un nuevo nombre (comprobando que no se encuentre
* repetido) usando el fichero binario firmas.dat.
*/
/***
 * Crear dos funciones para manejar mejor un menu en la aplicacion
 * Para leer las firmas crear un array para guardar los nombres cargados en el 
 * readObject de ObjectInputStream 
 */
/**
 *
 * @author pedromiras
 */
public class EJ3 {
    static String ruta = "firmas.dat";// Ruta del archivo
    static Scanner scanner = new Scanner(System.in);
    static String[] nombres = new String[0];// Array de nombres

    static void leerLibroFirmas() {// Funcion para leer las firma de la lista
        try (ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))) {
            nombres = (String[]) iS.readObject();//Cargamos la lista en un array si existe
            System.out.println("\nLista de firmas:");
            for (String nombre : nombres) {// Imprimimos el array de nombres 
                System.out.println("- " + nombre);
            }
        } catch (FileNotFoundException e) {
            //Control por si no existe el archivo 
            System.out.println("Archivo no encontrado. Aun no hay firmas.");
        } catch (IOException | ClassNotFoundException e) {
            //Control de error entrada/salida y mal casteo
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    static void registrarFirma() {//Funcion para registrar nuevos nombres 
        // Cargar nombres actuales del archivo (si existen)
        try (ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))) {
            nombres = (String[]) iS.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // Si el archivo no existe o esta vacio, se empieza con un array vacio
            nombres = new String[0];
        }

        System.out.print("Registrar nuevo nombre: ");
        String nombreNuevo = scanner.nextLine();// Registramos un nuevo nombre
        
        // Variable para comprobar si el nombre esta en la lista
        boolean existe = false;
        for (String nombre : nombres) {       //Podriamos controlar minusculas
            if (nombre.equals(nombreNuevo)) { //y mayusculas con equalsIgnoreCase 
                                              //ej: Pedro y pedro                          
                existe = true;//Si el nombre esta entre los ya registrados no se escribira
                break;
            }
        }

        if (existe) {
            System.out.println("El nombre ya esta en la lista de firmas.");
        } else {
            //Si el nombre no esta se redimensiona el array y se inserta el nombre
            nombres = Arrays.copyOf(nombres, nombres.length + 1);
            nombres[nombres.length - 1] = nombreNuevo;

            try (ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))) {
                oS.writeObject(nombres);//Se actualiza el archivo firmas.dat
                System.out.println("Nombre registrado correctamente.");
            } catch (IOException ex) {
                System.out.println("Error al escribir en el archivo: " + ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        int opcion;
        //Menu de la aplicacion lista de firmas
        do {
            System.out.println("\n------------- Menu -------------");
            System.out.println("1. Leer lista de firmas");
            System.out.println("2. Registrar nueva firma");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> leerLibroFirmas();// Llamada al metodo para mostrar firmas
                case 2 -> registrarFirma();// Llamada al metodo para registrar firmas
                case 3 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 3);// Sii se elige tres termina el programa
    }
}
