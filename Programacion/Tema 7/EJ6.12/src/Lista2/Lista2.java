/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista2;

/***
 *Ejercicio 12
 * Añadir a la clase Lista el método estático:
 * Lista concatena (Lista l1, Lista l2)
 * que construye y devuelve una lista que contiene, en el mismo orden, una copia de todos los
 * elementos de l1 y l2.
 */
import java.util.Arrays;

/**
 *
 * @author pedromiras
 */
public class Lista2 {
    Integer [] lista;
    
    public Lista2() {
        this.lista = new Integer[0];
    }
    
    public int getNumElementos() {
        return this.lista.length;
    }
    
    public void insertarFinal(Integer numero) {
        this.lista = Arrays.copyOf(this.lista, this.lista.length + 1);
        this.lista[this.lista.length - 1] = numero;
    }
    
    public void insertarPrincipio(Integer numero) {
        this.lista = Arrays.copyOf(this.lista, this.lista.length + 1);
        System.arraycopy(this.lista, 0, this.lista, 1, this.lista.length - 1);
        this.lista[0] = numero;
    }
    
    public void insertarNumero(int indice, Integer numero) {
        if (indice >= 0 && indice < this.lista.length + 1) {
            this.lista = Arrays.copyOf(this.lista, this.lista.length + 1);
            System.arraycopy(this.lista, indice, this.lista, indice + 1, this.lista.length - indice - 1);
            this.lista[indice] = numero;
        } else {
            System.out.println("El índice en el que quieres insertar no es válido");
        }
    }
    
    public void insertarFinal(Lista2 listaAConcatenar) {
        int tamanioInicial = this.lista.length;
        
        this.lista = Arrays.copyOf( this.lista, tamanioInicial + listaAConcatenar.getNumElementos());
        System.arraycopy(listaAConcatenar.lista, 0, this.lista, tamanioInicial, listaAConcatenar.lista.length);
    }
    
    public Integer eliminarElemento(int indice) {
        Integer elementoABorrar = null;
        
        if (indice >= 0 && indice < this.lista.length) {
            elementoABorrar = this.lista[indice];
        
            for (int i = indice + 1; i < this.lista.length; i++) {
                this.lista[i - 1] = this.lista[i];
            }

            this.lista = Arrays.copyOf(this.lista, this.lista.length - 1);
        }
        
        return elementoABorrar;
    }
    
    public Integer getElemento(int indice) {
        Integer resultado = null;
        if (indice >= 0 && indice < this.lista.length) {
            resultado = this.lista[indice];
        }
        return resultado;
    }
    
    public Integer buscarElemento(Integer numeroABuscar) {
        int indice = -1;
        
        for (int i = 0; i < this.lista.length && indice == -1; i++) {
            if (this.lista[i].equals(numeroABuscar)) {
                indice = i;
            }
        }
        
        return indice;
    }
    
    public void mostrarElementos() {
        System.out.println(Arrays.toString(this.lista));
    }
    
    //---------------------------------------------------------------------------//
    
    public static Lista2 concatena(Lista2 l1, Lista2 l2){
        Lista2 newLista = new Lista2();
        
        newLista.lista = Arrays.copyOf(l1.lista, l1.getNumElementos() + l2.getNumElementos());
        System.arraycopy(l2.lista, 0, newLista.lista, l1.getNumElementos(), l2.getNumElementos());
        
        return newLista;
    }
}
