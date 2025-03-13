
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9.pkg5;

import java.util.Arrays;

/***
 * EJ 11 
 * Las listas son estructuras dinamicas de datos donde se pueden insertar o eliminar elementos de un determinado 
 * tipo sin limitacion de espacio.
 * 
 * Implementar una clase lista correspondiente a una lista de numeros de la clase Integer. Los numeros se guardaran en una
 * array que se redimensionara con las inserciones y eliminaciones, aumenando o disminuyendo la capacidad de la lista segun el caso.
 * 
 * Entre los metodos de la clase, se incluiran las siguientes tareas:
 * -Un constructor que inicialice el array cin un tamaño[]
 * -Obtener el numero de elementos insertados en el array 
 * -Insertar un numero al final de la lista
 * -Insertar un numero al principio de la lista
 * -insertar un numero en un lugar de la lista cuyo indice, que es el del array, se pasa como parametro
 * -Añadir al final de la lista los elementos de otra lista que se pasa como parametro
 * -Eliminar un elemento cuyo indice se pasa como parametro
 * -Obtener el elemento cuyo indice se para como parametro
 * -Buscar un numero en la lista, devolviendo su indice del primer lugar donde se encuentre. Si no esta, devolvera -1
 * -Mostrar los elementos de la lista por consola.
 */
/**
 *
 * @author pedromiras
 */
public class ListaElementos implements Cola, Pila{
    Integer [] lista;
    
    public ListaElementos() {
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
    
    public void insertarFinal(ListaElementos listaAConcatenar) {
        int tamanioInicial = this.lista.length;
        this.lista = Arrays.copyOf(
                this.lista,
                tamanioInicial + listaAConcatenar.getNumElementos()
        );
        System.arraycopy(
                listaAConcatenar.lista,
                0,
                this.lista,
                tamanioInicial,
                listaAConcatenar.lista.length
        );
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

    @Override
    public void enconlar(Integer num) {
        this.insertarFinal(num);
    }

    @Override
    public Integer desencolar() {
        return this.eliminarElemento(0);
    }

    @Override
    public void apilar(Integer num) {
        this.insertarFinal(num);
    }

    @Override
    public Integer desapilar() {
        return this.eliminarElemento(this.getNumElementos()-1);
    }
}
