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
    private final ComparadorEdad c1 = new ComparadorEdad();
    private final ComparadorNombre c2 = new ComparadorNombre();
    
    @Override
    public int compare(Object o1, Object o2) {
        
        Futbolista f1 = (Futbolista) o1;
        Futbolista f2 = (Futbolista) o2;
        
//        if ( c1.compare(f1, f2) != 0) {
//            return c1.compare(f1, f2);
//        }
//        
//        return c2.compare(f1, f2);

        int resultado = c1.compare(f1, f2);//ahorramos llamar dos veces c1.compare()
        return (resultado != 0) ? resultado : c2.compare(f1, f2);
    }
    
}
