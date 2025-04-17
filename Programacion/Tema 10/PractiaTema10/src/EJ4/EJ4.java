/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package EJ4;
/***
* EJERCICIO 4
* Implementa una aplicación que mantenga un registro de las temperaturas máxima y mínima
* diarias medidas en una estación meteorológica. Los datos se guardarán en un archivo de texto
* con el siguiente formato:
* 
* Fecha         Temperatura máxima    Temperatura mínima
* 2020-01-15           12                    -1
* 2020-01-16           15                     2
* 
* Al arrancar la aplicación aparecerá un menú con las opciones:
* --------------MENU-------------
* 1. Registrar nueva temperatura
* 2. Mostrar historial de registros
* 3. Salir
* 
* El historial de registros mostrará todos los datos registrados junto con el máximo valor de las
* temperaturas máximas y el mínimo de las temperaturas mínimas.
*/
import java.io.BufferedReader;     // Para leer archivos linea por linea
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

    // Metodo para registrar una nueva temperatura en el archivo
    public static void registrarTemperatura() {
        // Abre el archivo en modo append (agregar al final sin borrar lo anterior)
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO, true))) {
            // Pide al usuario la fecha
            System.out.print("\nIntroduce la fecha (YYYY-MM-DD): ");
            String fecha = scanner.nextLine();

            // Pide temperatura maxima
            System.out.print("Introduce la temperatura maxima: ");
            int tempMax = Integer.parseInt(scanner.nextLine());

            // Pide temperatura minima
            System.out.print("Introduce la temperatura minima: ");
            int tempMin = Integer.parseInt(scanner.nextLine());

            // Escribe los datos separados por espacios en el archivo
            bw.write(fecha + "               " + tempMax + "                       " + tempMin); // a lo bruto con espacios contados
            bw.newLine(); // Inserta salto de linea despues del registro

            System.out.println("\nRegistro guardado correctamente.");
        } catch (IOException ex) {
            // Si ocurre un error al escribir, lo muestra
            System.out.println("Error al registrar temperatura: " + ex.getMessage());
        }
    }

    // Metodo para mostrar el historial de temperaturas
    public static void mostrarHistorial() {
        // Variables para guardar la temperatura maxima y minima encontradas
        int minTempMin = Integer.MAX_VALUE;
        int maxTempMax = Integer.MIN_VALUE;
        boolean hayDatos = false; // Boolean para saber si hay datos

        System.out.println("\nHistorial de temperaturas:");

        // Intenta leer el archivo linea por linea
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            boolean cabeceraMostrada = false;

            // Lee cada linea del archivo
            while ((linea = br.readLine()) != null) {
                // Si la lnea contiene "fecha" o "temperatura", se asume que es la cabecera
                if (linea.toLowerCase().contains("fecha") || linea.toLowerCase().contains("temperatura")) {
                    // Solo mostrar la cabecera una vez
                    if (!cabeceraMostrada) {
                        System.out.println(linea);
                        cabeceraMostrada = true;
                    }
                    continue; // Saltar esta linea para que no entre en el procesamiento de datos
                }

                // Imprime la linea como aparece en el archivo
                System.out.println(linea);
                hayDatos = true; // Se detecto al menos un registro valido

                // Divide la linea en partes separadas por espacios (se eliminan los espacios al inicio y al final)
                String[] partes = linea.trim().split("\\s+");// .trim() elimina los espacios al principio y al final

                // Si la linea tiene exactamente 3 partes: fecha, tempMax, tempMin
                if (partes.length == 3) {
                    try {
                        // Solo se usan las temperaturas para calcular maximos y minimos
                        int tempMax = Integer.parseInt(partes[1]); // Temperatura maxima
                        int tempMin = Integer.parseInt(partes[2]); // Temperatura minima

                        // Actualiza los valores extremos
                        if (tempMax > maxTempMax) maxTempMax = tempMax;
                        if (tempMin < minTempMin) minTempMin = tempMin;

                    } catch (NumberFormatException e) {
                        // Si los numeros no son validos, se avisa
                        System.out.println("Línea con datos inválidos: " + linea);
                    }
                }
            }

            // Si no hay datos de fechas y temperaturas
            if (!hayDatos) {
                System.out.println("No hay registros aun.");
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

    // Metodo principal que muestra el menu y gestiona todo
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
                default -> System.out.println("Opción no válida."); // Si no es valida
            }

        } while (opcion != 3); // Se repite mientras no elija salir
    }
}