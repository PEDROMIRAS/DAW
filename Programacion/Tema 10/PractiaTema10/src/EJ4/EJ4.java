/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package EJ4;

import java.io.BufferedReader;     // Para leer archivos línea por línea
import java.io.BufferedWriter;     // Para escribir en archivos
import java.io.FileReader;         // Lectura de archivos
import java.io.FileWriter;         // Escritura de archivos
import java.io.IOException;        // Excepciones de entrada/salida
import java.util.Scanner;          // Para leer entrada del usuario

/**
 * @author pedromiras
 */
public class EJ4 {

    // Ruta del archivo de texto donde se guardan las temperaturas
    static final String ARCHIVO = "historial_temperaturas.txt";

    // Scanner global para leer datos por consola
    static Scanner scanner = new Scanner(System.in);

    // Método para registrar una nueva temperatura en el archivo
    public static void registrarTemperatura() {
        // Abre el archivo en modo append (agregar al final sin borrar lo anterior)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            // Pide al usuario la fecha
            System.out.print("\nIntroduce la fecha (YYYY-MM-DD): ");
            String fecha = scanner.nextLine();

            // Pide temperatura máxima
            System.out.print("Introduce la temperatura maxima: ");
            int tempMax = Integer.parseInt(scanner.nextLine());

            // Pide temperatura mínima
            System.out.print("Introduce la temperatura minima: ");
            int tempMin = Integer.parseInt(scanner.nextLine());

            // Escribe los datos separados por espacios en el archivo
            bw.write(fecha + "   " + tempMax + "   " + tempMin);
            bw.newLine(); // Inserta salto de línea después del registro

            System.out.println("\nRegistro guardado correctamente.");
        } catch (IOException ex) {
            // Si ocurre un error al escribir, lo muestra
            System.out.println("Error al registrar temperatura: " + ex.getMessage());
        }
    }

    // Método para mostrar el historial de temperaturas
    public static void mostrarHistorial() {
        // Variables para guardar la temperatura máxima y mínima encontradas
        int minTempMin = Integer.MAX_VALUE;
        int maxTempMax = Integer.MIN_VALUE;
        boolean hayDatos = false; // Bandera para saber si hay datos

        System.out.println("\nHistorial de temperaturas:");

        // Imprime cabecera de la tabla
        System.out.printf("%-12s %-20s %-20s\n", "Fecha", "Temperatura maxima", "Temperatura minima");

        // Intenta leer el archivo línea por línea
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;

            // Lee cada línea del archivo
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) continue; // Ignora líneas vacías

                hayDatos = true; // Se encontró al menos un registro

                // Divide la línea por espacios
                String[] partes = linea.trim().split("\\s+");

                // Si hay exactamente 3 elementos (fecha, max, min)
                if (partes.length == 3) {
                    try {
                        String fecha = partes[0];                    // Fecha
                        int tempMax = Integer.parseInt(partes[1]);   // Temperatura máxima
                        int tempMin = Integer.parseInt(partes[2]);   // Temperatura mínima

                        // Imprime el registro en formato tabla
                        System.out.printf("%-12s%10d%21d\n", fecha, tempMax, tempMin);

                        // Actualiza máximos y mínimos globales
                        if (tempMax > maxTempMax) maxTempMax = tempMax;
                        if (tempMin < minTempMin) minTempMin = tempMin;
                    } catch (NumberFormatException e) {
                        // Si los datos no son válidos, se avisa
                        System.out.println("Línea con datos inválidos: " + linea);
                    }
                }
            }

            // Si no hubo ningún dato válido
            if (!hayDatos) {
                System.out.println("No hay registros aún.");
            } else {
                // Imprime resumen de extremos
                System.out.println("\nTemperatura maxima registrada: " + maxTempMax);
                System.out.println("Temperatura minima registrada: " + minTempMin);
            }

        } catch (IOException ex) {
            // Si ocurre un error leyendo el archivo, lo muestra
            System.out.println("Error al leer el historial: " + ex.getMessage());
        }
    }

    // Método principal que muestra el menú y gestiona todo
    public static void main(String[] args) {
        int opcion;

        // Bucle que se repite hasta que el usuario elige salir
        do {
            // Muestra el menú
            System.out.println("\n------------- Menu -------------");
            System.out.println("1. Registrar nueva temperatura");
            System.out.println("2. Mostrar historial de registros");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());

            // Selección de opción del menú
            switch (opcion) {
                case 1 -> registrarTemperatura(); // Opción 1: registrar temperatura
                case 2 -> mostrarHistorial();     // Opción 2: mostrar historial
                case 3 -> System.out.println("\nSaliendo del programa..."); // Salida
                default -> System.out.println("Opción no válida."); // Si no es válida
            }

        } while (opcion != 3); // Se repite mientras no elija salir
    }
}