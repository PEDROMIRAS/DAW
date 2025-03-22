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
public class ComparadorEdadNombre implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        
        ComparadorEdad c1 = new ComparadorEdad();
        ComparadorNombre c2 = new ComparadorNombre();
        
        Futbolista otroFutbolista1 = (Futbolista) o1;
        Futbolista otroFutbolista2 = (Futbolista) o2;
        
        if ( c1.compare(otroFutbolista1, otroFutbolista2) != 0) {
            return c1.compare(otroFutbolista1, otroFutbolista2);
        }
        
        return c2.compare(otroFutbolista1, otroFutbolista2);
    }
    
}
