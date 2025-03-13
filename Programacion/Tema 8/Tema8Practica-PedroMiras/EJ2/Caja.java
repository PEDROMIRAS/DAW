/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;

/**
 *
 * @author pedromiras
 */
public class Caja {
    protected final double ancho;
    protected final double alto;
    protected final double fondo;
    protected String etiqueta;
    
    public enum Unidad {
        CM, M
    }
    
    public Caja(int ancho, int alto, int fondo, Unidad unidad){
         if (unidad == Unidad.CM) {
            this.ancho = ancho / 100.0;
            this.alto = alto / 100.0;
            this.fondo = fondo / 100.0;
        } else {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
        }
        this.etiqueta = "";
    }
    
    public double getVolumen(){
         return ancho * alto * fondo;
    }
    
    public void setEtiqueta(String etiqueta){
        if (etiqueta.length()<=30) {
            this.etiqueta = etiqueta;
        }else{
            System.out.println("Texto demasiado largo");
        }
    }
    
    @Override
    public String toString() {
        return "Caja = ancho: "+ancho+", alto: "+alto+", fondo: "+fondo+", etiqueta: "+etiqueta;
    }
    
}
