/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pila;

import Lista2.Lista2;

/***
 *Ejercicio 13
 * Una pila es una estructura din�mica de datos donde los elementos se insertan (se apilan) y se retiran (se desapilan) 
 * siguiendo la norma de que el �ltimo que se apila ser� el primero en desapilarse, como ocurre en una pila de platos. 
 * Cuando vamos a retirar un plato de una pila a nadie se le ocurre tirar de uno de los de abajo; retiramos (desapilamos) 
 * el que est� encima de todos, que fue el �ltimo en ser apilado. Se llama cima de la pila al �ltimo elemento apilado 
 * (o al primer elemento a desapilar). Los m�todos fundamentales de una pila son apilar() y desapilar().
 * 
 * Implementar la clase Pila para n�meros Integer, donde se usa una lista (un objeto de la clase
 * Lista implementada en el ejercicio 11) para guardar los elementos apilados.
 */
/**
 *
 * @author pedromiras
 */
public class Pila {
    private Lista2 lista;
    
    public Pila() {
        this.lista = new Lista2();
    }
    
    public void apilar(Integer num) { // Para funcionamiento LIFO 
        this.lista.insertarFinal(num); 
    }
    
    public Integer desapilar() { // Para funcionamiento LIFO 
        if (this.lista.getNumElementos() > 0) {
            return this.lista.eliminarElemento(this.lista.getNumElementos() - 1);
        }
        return null; // Pila vac�a
    }
    
    public void mostrar() {
        this.lista.mostrarElementos();
    }
}