/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ4 {
    static final String ARCHIVO = "historial_temperaturas.txt";
    static Scanner scanner = new Scanner(System.in);
    
    public static void registrarTemperatura(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO))){
            System.out.print("Introduce la fecha (YYYY-MM-DD): ");
            String fecha = scanner.nextLine();

            System.out.print("Introduce la temperatura máxima: ");
            int tempMax = Integer.parseInt(scanner.nextLine());

            System.out.print("Introduce la temperatura mínima: ");
            int tempMin = Integer.parseInt(scanner.nextLine());
            
            bw.write(fecha + " " + tempMax + " " + tempMin);
            bw.newLine();
            bw.close();
            
        }catch(IOException ex){
            System.out.println("Error al registrar temperatura: " + ex.getMessage());
        }
    }
    public static void mostrarHistorial(){}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Registrar nueva temperatura");
            System.out.println("2. Mostrar historial de registros");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    registrarTemperatura();
                    break;
                case 2:
                    mostrarHistorial();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 3);
    }
    
}
