/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;



/***
 * EJERCICIO 9
 * Implementar un programa que registra la evolución temporal de la temperatura 
 * en una ciudad. La aplicación mostrará un menú que permite añadir nuevos 
 * registros de temperatura y mostrar el listado de todos los registros históricos. 
 * Cada registro constará de la temperatura en grados centígrados, introducida 
 * por teclado, y la fecha y hora, que se leerá del sistema en el momento de la 
 * creación del registro.
 */
/**
 *
 * @author pedromiras
 */
public class EJ119 {
    static Scanner scanner = new Scanner(System.in);
    static String ruta = "temperaturas.dat";
    static Temperatura[] registros;
    static Temperatura[] historial;
    
    static void registrarTemperatura() {
        // Cargar registros anteriores del archivo
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ruta))) {
            registros = (Temperatura[]) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            registros = new Temperatura[0]; // Si no hay archivo o está vacío
        }
        
        try(ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))){
            System.out.printf("Ingrese una temperatura:");
            int temp = scanner.nextInt();
            scanner.nextLine();
            Temperatura t = new Temperatura(temp);
            registros = Arrays.copyOf(registros,registros.length+1);
            registros[registros.length-1]= t;
            oS.writeObject(registros);
              
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    static void mostrarHistorial(){
        try(ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))){
            System.out.println("\nHistorial de temperaturas:\n");
            historial = new Temperatura[registros.length];
            historial = (Temperatura[]) iS.readObject();
            System.out.println(Arrays.toString(historial));
        }catch(IOException | ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        } 
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;

        // Bucle que se repite hasta que el usuario elige salir
        do {
            // Muestra el menu
            System.out.println("\n------------- Menu -------------");
            System.out.println("1. Registrar nueva temperatura");
            System.out.println("2. Mostrar historial de registros");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());

            // Seleccion de opcion del menu
            switch (opcion) {
                case 1 -> registrarTemperatura(); // Opcion 1: registrar temperatura
                case 2 -> mostrarHistorial();     // Opcion 2: mostrar historial
                case 3 -> System.out.println("\nSaliendo del programa..."); // Salida
                default -> System.out.println("Opcion no valida."); // Si no es valida
            }

        } while (opcion != 3); // Se repite mientras no elija salir
    }
    
}
