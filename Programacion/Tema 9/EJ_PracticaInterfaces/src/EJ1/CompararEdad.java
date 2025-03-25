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
public class CompararEdad implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Estudiante)o1).edad - ((Estudiante)o2).edad;
    }
    
}
