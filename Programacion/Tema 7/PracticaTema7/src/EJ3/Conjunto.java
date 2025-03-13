/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pedromiras
 */
public class Conjunto {
    Lista conjunto;
    
    public Conjunto(){
        this.conjunto = new Lista();
    }
    
    //Devuelve el numero de elementos del conjunto
    public int numElementos(){
         return this.conjunto.numeroElementos();
    }
    
    public boolean insertar(Integer nuevo){
        // Si ya está en el conjunto, no lo insertamos
        if (this.conjunto.buscar(nuevo) != -1) {
            return false;
        }
        // Si no está, lo insertamos al final
        this.conjunto.insertarFinal(nuevo);
        return true;
    }
    
    //Insertar un conjunto dentro de un conjunto
    public boolean insertar(Conjunto otro){
        boolean agregado = false;
        for (int i = 0; i < otro.conjunto.numeroElementos(); i++) {
            if (this.insertar(otro.conjunto.get(i))) {
                agregado = true;
            }
        }
        return agregado;
    }
    
    //Elimina el elemento si pertenece al conjunto
    public boolean eliminarElemento(Integer elemento){
        boolean eliminado = false;
        //Buscamos si el elemento esta en el conjunto
        if (this.conjunto.buscar(elemento) != -1) {
            this.conjunto.eliminar(elemento);
            eliminado = true;
        }
        return eliminado;
    }
    
    // Elimina un conjunto de elementos del conjunto
    public boolean eliminarConjunto(EJ4.Conjunto otroConjunto){
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
    
    //Comprueba si un elemento pertenece a un conjunto
    public boolean pertenece(Integer elemento){
        boolean pertenece = false;
        if (this.conjunto.buscar(elemento) != -1) {
            pertenece = true;
        }
        return pertenece;
    }
    
    // Método para mostrar los elementos del conjunto
    public void mostrar() {
        System.out.print("Conjunto: ");
        conjunto.mostrar();
    }
}
