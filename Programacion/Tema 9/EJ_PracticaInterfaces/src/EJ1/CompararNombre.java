/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

import java.util.Comparator;

/**
 *
 * @author pmira
 */
public class CompararNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Estudiante e1 = (Estudiante) o1;
        Estudiante e2 = (Estudiante) o2;
        
        return e1.nombre.compareTo(e2.nombre);
    }
    
}
