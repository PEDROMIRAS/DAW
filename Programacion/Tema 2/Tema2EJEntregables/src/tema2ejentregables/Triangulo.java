/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2ejentregables;
/***
 * Escribe una aplicación que solicite por consola dos números reales que corresponden a la base
 * y la altura de un triángulo. Deberá mostrarse su área, comprobando que los números
 * introducidos por el usuario no son negativos, algo que no tendría sentido.
 */
/**
 *
 * @author pedromiras
 */
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar la base
        System.out.print("Introduce la base del triangulo (en unidades): ");
        double base = sc.nextDouble();

        // Solicitar la altura
        System.out.print("Introduce la altura del triangulo (en unidades): ");
        double altura = sc.nextDouble();

        // Comprobar que los valores no sean negativos
        if (base < 0 || altura < 0) {
            System.out.println("La base y la altura deben ser numeros no negativos.");
        } else {
            // Calcular y mostrar el área del triángulo
            double area = (base * altura) / 2;
            System.out.printf("El area del triangulo es: "+ area+" unidades.");
        }

        sc.close();
    }
}
