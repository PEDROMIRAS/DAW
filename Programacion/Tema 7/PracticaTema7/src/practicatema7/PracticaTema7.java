/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicatema7;

import EJ1.Calendario;
import EJ2.Punto;
import EJ4.Conjunto;

/**
 *
 * @author pedromiras
 */
public class PracticaTema7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // EJERCICIO 1 PRUEBA
        Calendario fecha = new Calendario(2024, 2, 28);
        fecha.mostrar(); // 28/02/2024
        fecha.incrementarDia();
        fecha.mostrar(); // 01/03/2024

        fecha.incrementarMes();
        fecha.mostrar(); // 01/04/2024

        fecha.incrementarAnio(2);
        fecha.mostrar(); // 01/04/2026

        Calendario otraFecha = new Calendario(2026, 4, 1);
        System.out.println(fecha.iguales(otraFecha)); // true
        
        //------------------------------------------------------
        System.out.println();
        //------------------------------------------------------
        
        // EJERCICIO 2 PRUEBA
        Punto p1 = new Punto(3, 4);
        Punto p2 = new Punto(7, 1);

        p1.muestra();
        p2.muestra();

        System.out.println("Distancia Euclidea: " + p1.distanciaEuclidea(p2));

        // Prueba de desplazamientos
        p1.desplazaX(2);
        p1.desplazaY(-1);
        p1.muestra(); // Nuevo punto después del desplazamiento

        p2.desplaza(3, 3);
        p2.muestra(); // Nuevo punto después del desplazamiento
        
        //------------------------------------------------------
        System.out.println();
        //------------------------------------------------------
        
        // EJERCICIOS 3 Y 4 PRUEBA

        Conjunto c1 = new Conjunto();
        Conjunto c2 = new Conjunto();

        // Insertar elementos en c1
        c1.insertar(1);
        c1.insertar(2);
        c1.insertar(3);
        c1.insertar(4);
        
        // Insertar elementos en c2
        c2.insertar(3);
        c2.insertar(4);
        c2.insertar(5);
        c2.insertar(6);

        // Mostrar conjuntos iniciales
        System.out.print("Conjunto C1: ");
        c1.mostrar();
        System.out.print("Conjunto C2: ");
        c2.mostrar();

        // Prueba de unión
        Conjunto union = Conjunto.union(c1, c2);
        System.out.print("Union de C1 y C2: ");
        union.mostrar();

        // Prueba de intersección
        Conjunto interseccion = Conjunto.interseccion(c1, c2);
        System.out.print("Interseccion de C1 y C2: ");
        interseccion.mostrar();

        // Prueba de diferencia (C1 - C2)
        Conjunto diferencia = Conjunto.diferencia(c1, c2);
        System.out.print("Diferencia C1 - C2: ");
        diferencia.mostrar();

        // Prueba de pertenencia
        System.out.println("El numero 2 pertenece a C1? " + c1.pertenece(2));
        System.out.println("El numero 6 pertenece a C1? " + c1.pertenece(6));

        // Prueba de inclusión
        System.out.println("C1 esta incluido en C2? " + Conjunto.incluido(c1, c2));

        // Prueba de eliminación de un elemento
        c1.eliminarElemento(2);
        System.out.print("C1 despues de eliminar 2: ");
        c1.mostrar();

        // Prueba de eliminación de conjunto
        c1.eliminarConjunto(c2);
        System.out.print("C1 despues de eliminar elementos de C2: ");
        c1.mostrar();
    }
    
}
