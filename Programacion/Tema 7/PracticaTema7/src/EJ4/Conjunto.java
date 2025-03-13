/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ4;

/**
 *
 * @author pedromiras
 */
public class Conjunto {
    Lista conjunto;
    
    public Conjunto(){
        this.conjunto = new Lista();
    }
    
    // Devuelve el número de elementos del conjunto
    public int numElementos(){
        return this.conjunto.numeroElementos();
    }
    
    //Inserta al final del conjunto un nuevo elemento si no esta en el 
    public boolean insertar(Integer nuevo){
        // Si ya está en el conjunto, no lo insertamos
        if (this.conjunto.buscar(nuevo) != -1) {
            return false;
        }
        // Si no está, lo insertamos al final
        this.conjunto.insertarFinal(nuevo);
        return true;
    }
    
    // Insertar un conjunto dentro de otro conjunto
    public boolean insertar(Conjunto otro){
        boolean agregado = false;
        for (int i = 0; i < otro.conjunto.numeroElementos(); i++) {
            Integer elemento = otro.conjunto.get(i);
            if (this.insertar(elemento)) { 
                agregado = true;
            }
        }
        return agregado;
    }
    
    // Elimina el elemento si pertenece al conjunto
    public boolean eliminarElemento(Integer elemento){
        int indice = this.conjunto.buscar(elemento);
        if (indice != -1) {
            this.conjunto.eliminar(indice);
            return true;
        }
        return false;
    }
    
    // Elimina un conjunto de elementos del conjunto
    public boolean eliminarConjunto(Conjunto otroConjunto){
        boolean eliminado = false;

        for (int i = this.conjunto.numeroElementos() - 1; i >= 0; i--) {
            Integer elemento = this.conjunto.get(i);
            if (otroConjunto.pertenece(elemento)) {
                this.conjunto.eliminar(i); // Se usa el índice correcto
                eliminado = true;
            }
        }
        return eliminado;
    }
    
    // Comprueba si un elemento pertenece a un conjunto
    public boolean pertenece(Integer elemento){
        return this.conjunto.buscar(elemento) != -1;
    }
    
    // Método para mostrar los elementos del conjunto
    public void mostrar() {
        conjunto.mostrar();
    }
    
    //MODIFICACION--------EJ4------------------------------
    
    // Comprueba si todos los elementos de c1 están en c2
    public static boolean incluido(Conjunto c1, Conjunto c2){
        for (int i = 0; i < c1.numElementos(); i++) {
            if (!c2.pertenece(c1.conjunto.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    // Crea un conjunto nuevo con los elementos de c1 y c2 (comunes y no comunes)
    public static Conjunto union(Conjunto c1, Conjunto c2){
        Conjunto c3 = new Conjunto();
        c3.insertar(c1);
        c3.insertar(c2);
        return c3;
    }
    
    // Crea un conjunto nuevo con los elementos comunes de c1 y c2
    public static Conjunto interseccion(Conjunto c1, Conjunto c2){
        Conjunto c3 = new Conjunto();
        for (int i = 0; i < c1.conjunto.numeroElementos(); i++) {
            Integer elemento = c1.conjunto.get(i);
            if (c2.pertenece(elemento)) { // Si está en c1 y en c2 lo agregamos
                c3.insertar(elemento);
            }
        }
        return c3;
    }
    
    // Crea un nuevo conjunto con los elementos de c1 que NO están en c2
    public static Conjunto diferencia(Conjunto c1, Conjunto c2){
        Conjunto c3 = new Conjunto();
        for (int i = 0; i < c1.conjunto.numeroElementos(); i++) {
            Integer elemento = c1.conjunto.get(i);
            if (!c2.pertenece(elemento)) { // Si no está en c2 lo agregamos
                c3.insertar(elemento);
            }
        }
        return c3;
    }
}