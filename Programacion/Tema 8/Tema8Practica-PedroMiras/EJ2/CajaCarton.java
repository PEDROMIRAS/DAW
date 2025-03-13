/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;

/**
 *
 * @author pedromiras
 */
public class CajaCarton extends Caja{
    
    public CajaCarton(int ancho, int alto, int fondo, Unidad unidad) {
        super(ancho, alto, fondo, unidad.CM);
    }
    
    @Override
    public double getVolumen(){
        return super.getVolumen() * 0.8;
    }
    
    public double getSuperficie(){
        double ancho = super.ancho * 100; // Convertimos de metros a cm
        double alto = super.alto * 100;
        double fondo = super.fondo * 100;
        
        return 2 * ((ancho * alto) + (ancho * fondo) + (alto * fondo));
        
    }
    
    @Override
    public String toString() {
        return super.toString() + ", volumen ajustado=" + getVolumen() + " m^3, superficie=" + getSuperficie() + " cm^2";
    }
}
