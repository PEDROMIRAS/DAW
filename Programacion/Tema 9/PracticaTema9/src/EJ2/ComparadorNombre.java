/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;
import java.util.Comparator;
/**
 *
 * @author pedromiras
 */
public class ComparadorNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Futbolista)o1).nombre.compareTo(((Futbolista)o2).nombre);
    }
    
}
