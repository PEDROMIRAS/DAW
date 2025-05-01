/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;

/*
* Ejercicio 2 
* Implementa una aplicación que gestione una lista de nombres ordenada por orden alfabético.
* Al arrancar, se leerá de un fichero los nombres insertados anteriormente y se pedirán nombres
* nuevos hasta que se introduzca la cadena "fin" . Cada nombre que se introduzca deberá
* añadirse a los que ya había, de forma que la lista permanezca ordenada. Al terminar, se
* guardará en el fichero la lista actualizada.
*/

/***
* Tengo que leer primero el archivo con ObjectInputSteam, cargando el fichero si se puede.
* Guardar los nombres en un array , insertar nuevos nombre en el array hasta 
*'fin', oredenar el array con un sort() e insertar el array en el fichero de nuevo.
*/
/**
 *
 * @author pedromiras
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "lista.dat";
        Scanner scanner = new Scanner(System.in);
        String[] nombres = new String[0];

        // Intentar leer el archivo directamente
        try (ObjectInputStream iS = new ObjectInputStream(new FileInputStream(ruta))) {
            nombres = (String[]) iS.readObject();
            System.out.println("Lista cargada: " + Arrays.toString(nombres));
        } catch (FileNotFoundException e) {
            // Si no existe el archivo, no pasa nada: seguimos con array vacio
            System.out.println("Archivo no encontrado. Creando un nuevo archivo.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        //Variables para nuevos nombres insertados en el bucle do_while
        String nuevoNombre;
        do {
            System.out.print("Inserte un nuevo nombre:");
            nuevoNombre = scanner.nextLine();//Recogemos el nuevo nombre o "fin"
            //Ampliamos el array si el String es diferente de "fin"
            if (!nuevoNombre.equals("fin")) {
                nombres = Arrays.copyOf(nombres,nombres.length+1);
                nombres[nombres.length-1] = nuevoNombre;
            }
        } while (!nuevoNombre.equals("fin"));//Acaba el bucle si se inserta "fin"
        
        //Ordenamos el array de nombres
        Arrays.sort(nombres);
        
        try(ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))){
            oS.writeObject(nombres);//Insertamos el array modificado en el fichero 
            
            System.out.println("\nLista guardada correctamente:");
            for (String nombre : nombres) {// Verificar que los nombres estan bien insertados
                System.out.println(nombre);
            }
        }catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
