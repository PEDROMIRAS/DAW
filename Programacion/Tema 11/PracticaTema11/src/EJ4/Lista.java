/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author pedromiras
 */
//Emplamos Serializable para poder pasar a datos binarios
public class Lista implements Serializable{
    //Array de la clase Object segun dice enunciado para guardar objs Emplado 
    Object[] empleados;

    public Lista() {//Creamos un nuevo array vacio
        this.empleados = new Object[0];
    }
    
    //Metodo para agregar objs Empleado al array 
    public void agregar(Object obj){
        empleados = Arrays.copyOf(empleados, empleados.length+1);
        empleados[empleados.length-1] = obj;
    }
    
    //Metodo para devolver un obj Empleado en funcion del indice
    public Object obtener(int index){
        return empleados[index];
    }
    
    //Metodo para devolver todos los objs Empleado, manteniendo el array actualizado
    public Object[] obtenerTodos() {
        return Arrays.copyOf(empleados, empleados.length);
    }
    
    //Devuelve el tamaño del array actual
    public int tamano() {
        return empleados.length;
    } 
    
    //Metodo para encontar obj Empleado por atributo DNI
    public Empleado buscarPorDNI(String dni){
        //Recorremos el array comparando el DNI de la posicion con el DNI introducido
        for (int i = 0; i < empleados.length; i++) {
            Empleado emp = (Empleado) empleados[i];
            if (emp.dni.equals(dni)) {
                return emp;//Si coincide devolvemos el obj Empleado
            }
        }
        return null;
    }
    
    //Metodo para eliminar obj Empleado por atributo DNi y actualizar el array
    public boolean eliminarPorDNI(String dni){
        //Bandera para comprobar que el dni no se copie en el array auxiliar
        boolean encontrado = false;
        // Creamos un nuevo array con un tamanio provisional
        Object[] nuevoArray = new Object[empleados.length - 1];
        int j = 0;//Contador para copiar en array auxiliar
        for (int i = 0; i < empleados.length; i++) {
            Empleado emp = (Empleado) empleados[i];
            if (emp.dni.equals(dni)) {
                encontrado = true; // Lo encontramos y lo saltamos (no se copia)
                continue;
            }
            //Copiamos en el array auxiliar mientras se cumpla la condicion
            if (j < nuevoArray.length) {
                nuevoArray[j++] = emp;
            }
        }
        //Modificamos el array de empleados con el array auxiliar
        if (encontrado) {
            empleados = nuevoArray;
        }
        return encontrado;
    }
    
    @Override
    public String toString() {
        return Arrays.toString(empleados);
    }
}
