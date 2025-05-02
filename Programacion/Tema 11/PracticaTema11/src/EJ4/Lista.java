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
public class Lista implements Serializable{
    Object[] empleados;

    public Lista() {
        this.empleados = new Object[0];
    }
    public void agregar(Object obj){
        empleados = Arrays.copyOf(empleados, empleados.length+1);
        empleados[empleados.length-1] = obj;
    }
    public Object obtener(int index){
        return empleados[index];
    }
    
    public Object[] obtenerTodos() {
        return Arrays.copyOf(empleados, empleados.length);
    }
    public Empleado buscarPorDNI(String dni){
        for (int i = 0; i < empleados.length; i++) {
            Empleado emp = (Empleado) empleados[i];
            if (emp.dni.equals(dni)) {
                return emp;
            }
        }
        return null;
    }
    public boolean eliminarPorDNI(String dni){
        boolean encontrado = false;
        // Creamos un nuevo array con un tamaño provisional
        Object[] nuevoArray = new Object[empleados.length - 1];
        int j = 0;
        for (int i = 0; i < empleados.length; i++) {
            Empleado emp = (Empleado) empleados[i];
            if (emp.dni.equals(dni)) {
                encontrado = true; // Lo encontramos y lo saltamos (no se copia)
                continue;
            }
            if (j < nuevoArray.length) {
                nuevoArray[j++] = emp;
            }
        }
        
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
