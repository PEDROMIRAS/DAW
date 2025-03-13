/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
/***
 * Definir una clase que permita controlar un sintonizador digital de emisoras FM; concretamente, 
 * se desea dotar al controlador de una interfaz que permite subir (up) y bajar (down) la frecuencia 
 * (en saltos de 0.5 MHz) y mostrar la frecuencia sintonizada en un momento dado (display). Supondremos 
 * que el rango de frecuencias para manejar oscila entre los 80 MHz y los 108 MHz y que, al inicio, 
 * el controlador sintonice la frecuencia indicada en el constructor o 80 MHz por defecto. Si durante 
 * una operaci�n de subida o bajada se sobrepasa uno de los l�mites, la frecuencia sintonizada debe pasar 
 * a ser la del extremo contrario. Escribir un peque�o programa principal para probar su funcionamiento.
 */

/**
 *
 * @author pedromiras
 */
public class Controlador {
    private double frecuencia;
    private static final double MIN_FREQUENCY = 80.0;
    private static final double MAX_FREQUENCY = 108.0;
    private static final double STEP = 0.5;

    // Constructor con frecuencia espec�fica
    public Controlador(double frecuencia) {
        if (frecuencia >= MIN_FREQUENCY && frecuencia <= MAX_FREQUENCY) {
            this.frecuencia = frecuencia;
        } else {
            this.frecuencia = MIN_FREQUENCY; // Valor por defecto si la frecuencia est� fuera de rango
        }
    }

    // Constructor por defecto, inicia en 90 MHz
    public Controlador() {
        this.frecuencia = MIN_FREQUENCY;
    }

    // Aumentar frecuencia (con ciclo)
    public double upFrequency() {
        this.frecuencia += STEP;
        if (this.frecuencia > MAX_FREQUENCY) {
            this.frecuencia = MIN_FREQUENCY; // Regresa al m�nimo al sobrepasar el m�ximo
        }
        return this.frecuencia;
    }

    // Disminuir frecuencia (con ciclo)
    public double downFrequency() {
        this.frecuencia -= STEP;
        if (this.frecuencia < MIN_FREQUENCY) {
            this.frecuencia = MAX_FREQUENCY; // Regresa al m�ximo al bajar m�s del m�nimo
        }
        return this.frecuencia;
    }

    // Obtener la frecuencia actual
    public double getFrecuencia() {
        return this.frecuencia;
    }

    // Mostrar la frecuencia actual
    public void display() {
        System.out.println("FM: " + this.frecuencia + " MHz");
    }
}