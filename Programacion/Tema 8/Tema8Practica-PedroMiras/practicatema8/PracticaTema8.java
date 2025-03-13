/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicatema8;

import EJ2.Caja;
import EJ2.CajaCarton;
import EJ3.Rectangulo;
import EJ3.Triangulo;
import EJ4.Conjunto;
import EJ4.Lista;

/**
 *
 * @author pedromiras
 */
public class PracticaTema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //------------------EJERCICIO-1------------------
        // Crear una caja normal en metros 
        Caja caja1 = new Caja(2, 3, 4, Caja.Unidad.M);
        caja1.setEtiqueta("Caja de herramientas");
        System.out.println(caja1);
        System.out.println("Volumen: " + caja1.getVolumen() + " m^3");
        
        //------------------EJERCICIO-2------------------
        System.out.println();
        // Crear una caja de cartón en centímetros 
        CajaCarton caja2 = new CajaCarton(200, 300, 400, Caja.Unidad.CM);
        caja2.setEtiqueta("Caja de reciclaje");
        System.out.println(caja2);
        System.out.println("Volumen ajustado: " + caja2.getVolumen() + " m^3");
        System.out.println("Superficie: " + caja2.getSuperficie() + " cm^2");
        
        //------------------EJERCICIO 3------------------
        System.out.println();
        // Crear un rectángulo
        Rectangulo rectangulo = new Rectangulo(10, 5);
        System.out.println("Area del rectangulo: " + rectangulo.area());
        
        // Crear un triángulo
        Triangulo triangulo = new Triangulo(8, 4);
        System.out.println("Area del triangulo: " + triangulo.area());
        
        //------------------EJERCICIO-4------------------
        System.out.println();
        // Prueba de Conjunto
        Conjunto conjunto = new Conjunto();
        conjunto.insertarFinal(30);
        conjunto.insertarFinal(40);
        conjunto.insertarFinal(30); // No se debe insertar (repetido)
        conjunto.insertarPrincipio(20);
        System.out.println("Conjunto: " + conjunto);
        
        // Comparación de conjuntos
        Conjunto otroConjunto = new Conjunto();
        otroConjunto.insertarFinal(40);
        otroConjunto.insertarFinal(30);
        otroConjunto.insertarPrincipio(20);
        System.out.println("OtroConjunto: " + otroConjunto );
        System.out.println("Los conjuntos son iguales: " + conjunto.equals(otroConjunto));
    }
    
}
