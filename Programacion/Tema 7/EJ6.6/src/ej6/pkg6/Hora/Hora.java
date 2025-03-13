/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6.pkg6.Hora;

/**
 *
 * @author pedromiras
 */
public class Hora {
    private int hora;
    private  int minutos;
    private int segundos;
    
    public Hora(int hora, int minutos, int segundos){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public Hora(){
        
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    
    public void mostrarHora(){
        System.out.println(hora+":"+minutos+":"+segundos);
    }
    public void aumentarHora(int nSeg){
        
        for (int i = 0; i < nSeg; i++) {
            segundos++;
            if (segundos == 60) {
                segundos = 0;
                minutos++;
            }
            if (minutos == 60) {
                minutos = 0;
                hora++;
            }
            if (hora == 24) {
                hora = 0;
            }
            mostrarHora();
        }
    }
}
