/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ4;
/***
* Ejercicio 4 
* Implementa una aplicación que gestione los empleados de un banco. Para ello se 
* definirá la clase Empleado con los atributos dni, nombre y sueldo. Los empleados
* se guardarán en un objeto de la clase Lista para objetos de la clase Object. 
* La aplicación cargará en la memoria, al arrancar, la lista de empleados desde 
* el archivo binario empleados.dat y mostrará un menú con las siguientes opciones:
* 
* ---------- Menu ----------
* 1. Alta empleado
* 2. Baja empleado
* 3. Mostrar datos empleado
* 4. Listar empleados
* 5. Salir
* 
* Al pulsar 5, se grabará en el disco la lista actualizada y terminará elprograma.
*/
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/***
 * Para manejar mejor el ejercicio vamos a crear funciones en la clase main que llame
 * a metodos de la clase a crear Lista, que a su vez hara uso de la clase Empleado.
 * La idea es manejar un menu con funciones que sea mas comodo y funcional.
 */
/**
 *
 * @author pedromiras
 */
public class EJ4 {
    static Scanner scanner = new Scanner(System.in);
    static String ruta = "empleados.dat";
    static Lista lista = new Lista();// Creamos una lista para guardar objs
    
    // Funcion para cargar el archivo nada mas empezar el programa
    static void cargarArchivo(){
        /*-----Cargar la lista de empleados al inicar el programa-----*/
        try(ObjectInputStream oS = new ObjectInputStream(new FileInputStream(ruta))){
            lista = (Lista) oS.readObject();
            System.out.println("Archivo cargado correcatamente.");
        }catch(IOException | ClassNotFoundException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    // Funcion para dar de alta a un empleado
    static void altaEmpleado(){
        // Solicitamos los datos que requiere un empleado DNI,Nombre,Sueldo
        System.out.println("Alta de empleado");
        System.out.print("Ingresar DNI:");
        String dni = scanner.nextLine();
        
        System.out.printf("Ingresar nombre:");
        String nombre = scanner.nextLine();
        
        System.out.printf("Ingresar sueldo:");
        double sueldo = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer
        // Creamos un nuevo empleado con los datos recogidos
        Empleado nuevo = new Empleado(dni,nombre,sueldo);
        /* Llamamos al metodo agregar de la clase Lista que
        añade el empeladoa a un array */
        lista.agregar(nuevo);
    }
    
    // Funcion que llama al metodo eliminarPorDNI de la clase lista
    static void bajaEmpleado(){
        // Introducimos el DNI que se le pasa al metodo
        System.out.print("Introduce el DNI del empleado a eliminar: ");
        String dni = scanner.nextLine();
        /* El metodo devuelve un boolean por lo que podemos crear una
          condicion para informar al usuario */
        boolean eliminado = lista.eliminarPorDNI(dni);
        if (eliminado) {
            System.out.println("Empleado eliminado correctamente.");
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
    
    // Funcion para mostrar empleado por DNI
    static void mostrarDatosEmpleado(){
        // Ingresamos el DNI del empleado a buscar
        System.out.print("Introduce el DNI del empleado: ");
        String dni = scanner.nextLine();
        // Llamamos al metodo buscarPorDNI que devuelve el empleado para mostrarlo
        Empleado emp = lista.buscarPorDNI(dni);
        if (emp != null) {//Si no esta vacio mostramos el empleado
            System.out.println("Empleado encontrado: " + emp);
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
    
    // Funcion para listar todos los empleados de la lista
    static void listarEmpleados(){
        // Comprobamos si hay o no empleados registrados
        if (lista.tamano() == 0) {
            System.out.println("La lista de empleados esta vacia.");
        }else{
        // Mostramos los empleados 1 a 1 usando los metodos de la clase Lista
            System.out.println("Lista de empleados:");
            for (int i = 0; i < lista.tamano(); i++) {
                Empleado emp = (Empleado) lista.obtener(i);
                System.out.println("-" + emp);
            }   
        }
    }
    
    // Funcion para salir del programa y guardar el array modificado en el archivo
    static void salir(){
        try (ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))) {
            // Escribimos la lista modificada en empleados.dat
            oS.writeObject(lista);
            System.out.println("Empleados guardados correctamente. Saliendo...");
        } catch (IOException e) {
            System.out.println("Error al guardar empleados: " + e.getMessage());
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        
        //Llamada a la funcion para leer el archivo al iniciar el programa
        cargarArchivo();
        
        // Menu de la aplicacion del banco
        do {
            System.out.println("\n--------- Menu ---------");
            System.out.println("1. Alta empleado");
            System.out.println("2. Baja empleado");
            System.out.println("3. Mostrar datos empleado");
            System.out.println("4. Listar empleados");
            System.out.println("5. Salir");
            System.out.print("Elige una opcion: ");
            opcion = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch (opcion) {
                case 1 -> altaEmpleado();// Llamada a la funcion para agregarEmpleados
                case 2 -> bajaEmpleado();// Llamada a la funcion para eliminarEmpleados
                case 3 -> mostrarDatosEmpleado();// Llamada a la funcion para mostrar empleados por DNI
                case 4 -> listarEmpleados();// Llamada a la funcion para mostrar todos los empleados
                case 5 -> salir();// Llamada a la funcion para guardar el archivo actualizado y salir del programa
                default -> System.out.println("Opcion no valida.");
            }
        } while (opcion != 5);// Si se elige cinco termina el programa y guarda el archivo
    }
}
