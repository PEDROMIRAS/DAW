/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

import java.util.Arrays;

/**
 *
 * @author pedromiras
 */
public class Conjunto extends Lista{
    
    public Conjunto() {
        super();
    }

    public Conjunto(int capacidadInicial) {
        super(capacidadInicial);
    }
    
    //Metodo insertar al principio, comprobando si el numero esta o no en el conjunto
    @Override
    public void insertarPrincipio(Integer nuevo){
        if (buscar(nuevo) == -1) { //Verifica si el numero no esta en el conjunto
            super.insertarPrincipio(nuevo);
        }
    }
    
    /***
     * Metodo insertar al final del conjunto, teniendo en cuenta que el numero
     * no debe estar en el conjunto previamente
     ***/ 
    @Override 
    public void insertarFinal(Integer nuevo){
        if (buscar(nuevo) == -1) { //Verifica si el numero no esta en el conjunto 
            super.insertarFinal(nuevo);
        }
    }
    
    @Override
    public boolean equals(Object otra){
        if (otra == null || this.getClass() != otra.getClass()) { // Verifica tipo exacto
            return false;
        }
        
        Conjunto conjunto = (Conjunto) otra;
        
        if (this.numeroElementos() != conjunto.numeroElementos()) {
            return false;
        }
        Integer[] copia1 = Arrays.copyOf(tabla, numeroElementos());
        Integer[] copia2 = Arrays.copyOf(conjunto.tabla, conjunto.numeroElementos());
        
        Arrays.sort(copia1);
        Arrays.sort(copia2);
        
        return Arrays.equals(copia1, copia2);
    }
    
}
