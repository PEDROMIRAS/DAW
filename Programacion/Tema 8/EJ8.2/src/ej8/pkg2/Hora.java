/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8.pkg2;
/***
 * Ejercicio 1
 *Diseñar la clase Hora, que representa un instante de tiempo compuesto por la hora (de 0 a 23)
 *y los minutos. Dispone de los métodos:
 *? Hora(hora, minuto), que construye un objeto con los datos pasados como parámetros.
 *? void inc(), que incrementa la hora en un minuto.
 *? boolean setMinutos(valor), que asigna un valor, si es válido, a los minutos. Devuelve
 * true o false según haya sido posible modificar los minutos o no.
 *? Boolean setHora(valor), que asigna un valor, si está comprendido entre 0 y 23, a la hora. 
 * Devuelve true o false según haya sido posible cambiar la hora o no.
 *? String toString(), que devuelve un String con la representación de la hora.
 */

/**
 *
 * @author pedromiras
 */
public class Hora {
    protected int hora;    // (0-23)
    protected int minutos; // (0-59)

    // Constructor con validación
    public Hora(int hora, int minutos) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            this.hora = 0; // Valor por defecto si es inválido
        }

        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            this.minutos = 0; // Valor por defecto si es inválido
        }
    }

    // Incrementa la hora en un minuto
    public void inc() {
        this.minutos++;
        if (this.minutos == 60) {
            this.minutos = 0;
            this.hora++;
            if (this.hora == 24) {
                this.hora = 0; // Reinicia a 00:00 si pasa de 23:59
            }
        }
    }

    // Asigna un valor válido a los minutos
    public boolean setMinutos(int valor) {
        if (valor >= 0 && valor <= 59) {
            this.minutos = valor;
            return true;
        }
        return false;
    }

    // Asigna un valor válido a la hora
    public boolean setHora(int valor) {
        if (valor >= 0 && valor <= 23) {
            this.hora = valor;
            return true;
        }
        return false;
    }

    // Devuelve la hora en formato HH:MM
    @Override
    public String toString() {
        return String.format("HORA: %02d:%02d", hora, minutos);
    }
}