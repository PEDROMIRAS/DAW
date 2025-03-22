/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9.pkg8;
import java.util.Comparator;
/**
 *
 * @author pedromiras
 */
public class CompararNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        return ((Socio) o1).nombre.compareTo(((Socio) o2).nombre);
        
    }
    
}
