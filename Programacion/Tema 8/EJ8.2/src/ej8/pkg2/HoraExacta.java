/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8.pkg2;

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
}
