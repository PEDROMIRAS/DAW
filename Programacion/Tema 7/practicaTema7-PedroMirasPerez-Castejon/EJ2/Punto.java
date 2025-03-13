/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ2;

/**
 *
 * @author pedromiras
 */
public class Punto {
    private double componenteX;
    private double componenteY;

    public Punto(double componenteX, double componenteY) {
        this.componenteX = componenteX;
        this.componenteY = componenteY;
    }
    
    public void desplazaX(double dx){
        this.componenteX += dx;
    }
    
    public void desplazaY(double dy){
        this.componenteY += dy;
    }
    
    public void desplaza(double dx, double dy){
        this.componenteX += dx;
        this.componenteY += dy;
    }
    
    public double distanciaEuclidea(Punto otroPunto){
        return Math.sqrt(Math.pow(otroPunto.componenteX - this.componenteX, 2)
                + Math.pow(otroPunto.componenteY - this.componenteY, 2));
    }
    
    public void muestra(){
        System.out.println("( " + this.componenteX +
                ", " + this.componenteY + " )");
    }
}
