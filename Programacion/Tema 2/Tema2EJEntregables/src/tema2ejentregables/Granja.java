/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2ejentregables;

import java.util.Scanner;

/***
 * En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los
 * animales. El número de animales que alimentar (todos de la misma especie) es numAnimales,
 * y sabemos que cada animal come una media de kilosPorAnimal.
 * 
 * Diseña un programa que solicite al usuario los valores anteriores y determine si disponemos de
 * alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la ración que
 * corresponde a cada uno de los animales.
 * 
 * Nota: Evitar que la aplicación realice divisiones por cero.
 */
/**
 *
 * @author pedromiras
 */


public class Granja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Solicitar la cantidad de comida diaria
        System.out.print("Introduce la cantidad de comida diaria (en kg): ");
        double comidaDiaria = sc.nextDouble();

        // Solicitar el número de animales
        System.out.print("Introduce el numero de animales: ");
        int numAnimales = sc.nextInt();

        // Solicitar la cantidad de comida que cada animal necesita
        System.out.print("Introduce la cantidad promedio de comida que consume cada animal (en kg): ");
        double kilosPorAnimal = sc.nextDouble();

        // Evitar divisiones por cero usando una estructura condicional
        if (numAnimales <= 0) {
            System.out.println("El numero de animales debe ser mayor que 0.");
        } else {
            // Calcular la cantidad total de comida necesaria
            double comidaNecesaria = numAnimales * kilosPorAnimal;

            switch ((comidaDiaria >= comidaNecesaria) ? 1 : 0) {
                case 1:
                    System.out.println("Hay suficiente comida para todos los animales.");
                    break;
                case 0:
                    double racionPorAnimal = comidaDiaria / numAnimales;
                    System.out.println("No hay suficiente comida para todos los animales.");
                    System.out.printf("La racion que corresponde a cada animal es: "+racionPorAnimal+" KG");
                    break;
            }
        }

        sc.close();
    }
}
