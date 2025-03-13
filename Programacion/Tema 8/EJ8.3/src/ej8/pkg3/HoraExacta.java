/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8.pkg3;
/**
 * Ejercicio 2
 *   A partir de la clase Hora implementar la clase HoraExacta, que incluye en la hora los segundos.
 *   Además de los métodos heredados de Hora, dispondrá de:
 * ? HoraExacta(hora, minuto, segundo), que construye un objeto con los datos pasados
 *   como parámetros.
 * ? setSegundo(valor), que asigna, si está comprendido entre 0 y 59, el valor indicado en
 *   los segundos,
 * ? Inc(), que incrementa la hora en un segundo.
 * 
 * Ejercicio 3
 *  Añadir a la clase HoraExacta un método que compare si dos horas (la invocante y otra pasada
 *  como parámetro de entrada al método) son iguales o distintas.
/**
 *
 * @author pedromiras
 */
public class HoraExacta extends Hora{
    private int seg;
    public HoraExacta(int hora, int minutos, int seg) {
        super(hora, minutos);
        if (seg >= 0 && seg <=59) {
            this.seg = seg;
        }
        
    }
    
    public void setSegundo(int valor){
        if (valor >= 0 && valor <= 59) {
            this.seg = valor;
        }
    }
    
    @Override
    public void inc(){
        this.seg++;
        if (this.seg == 60) {
            this.seg = 0;
            super.inc();
        }
    }
    
    @Override
    public boolean equals(Object hora){
        HoraExacta h = (HoraExacta) hora;
        boolean sonIguales;
        if(this.hora == h.hora && this.minutos == h.minutos && this.seg == h.seg) {
            sonIguales = true;
        }else{
            sonIguales = false;
        }
        return sonIguales;
    }
}
