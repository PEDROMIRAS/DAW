/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ1;

/**
 *
 * @author pedromiras
 */
public class Calendario {
    private int anio;
    private int mes;
    private int dia;
    
    private final int[] DIAS_POR_MES = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Calendario(int anio, int mes, int dia) {
        if (anio > 0 ) {
            this.anio = anio;
        }
        if (mes >=1 && mes <= 12 ) {
            this.mes = mes;
        }
        if (dia >=1 && dia <= 31) {
            this.dia = dia;
        } 
    }
    
    public void incrementarDia(){
        if (dia < DIAS_POR_MES[mes-1]) {
            dia++;
        }else{
            dia = 1;
            incrementarMes();
        }
    }
    public void incrementarMes(){
        if (mes < 12) {
            mes++;
        }else{
            mes = 1;
            anio++;
        }
    }
    public void incrementarAnio(int valor){
        if (valor > 0) {
            this.anio += valor;
        }
        if (anio == 0) {
            anio = 1;
        }
    }
    
    public void mostrar(){
        System.out.printf("%02d/%02d/%d%n",dia,mes,anio);
    }
    
    public boolean iguales(Calendario otraFecha) {
        return this.anio == otraFecha.anio && this.mes == otraFecha.mes && this.dia == otraFecha.dia;
    }
    
}
