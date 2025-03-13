/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EJ3;

/**
 *
 * @author pedromiras
 */
public class Rectangulo extends Poligono{

    public Rectangulo(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double area() {
        return base * altura;
    }
    
}
