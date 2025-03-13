/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionclase1;

import java.util.Scanner;

public class FuncionClase1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                               CALCULADORA
                               1. Suma
                               2. Resta
                               3. Multiplicacion
                               4. Division
                               5. Salir
                               """);

            System.out.print("Elige una opcion: ");
            while (!sc.hasNextInt()) {
                System.out.println("Por favor, introduce un numero valido.");
                sc.next();
                System.out.print("Elige una opci0n: ");
            }
            opcion = sc.nextInt();

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer numero: ");
                int num1 = validarEntero(sc);
                System.out.print("Introduce el segundo numero: ");
                int num2 = validarEntero(sc);

                switch (opcion) {
                    case 1 -> suma(num1, num2);
                    case 2 -> resta(num1, num2);
                    case 3 -> multiplicacion(num1, num2);
                    case 4 -> division(num1, num2);
                }
            } else if (opcion != 5) {
                System.out.println("Opcion no valida. Intentalo de nuevo.\n");
            }
        } while (opcion != 5);

        System.out.println("Gracias por usar la calculadora!!!");
    }

    public static void suma(int num1, int num2) {
        System.out.println("El resultado de la suma es: " + (num1 + num2) + "\n");
    }

    public static void resta(int num1, int num2) {
        System.out.println("El resultado de la resta es: " + (num1 - num2) + "\n");
    }

    public static void multiplicacion(int num1, int num2) {
        System.out.println("El resultado de la multiplicacion es: " + (num1 * num2) + "\n");
    }

    public static void division(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("El resultado de la division es: " + ((double) num1 / num2) + "\n");
        } else {
            System.out.println("Error: No se puede dividir entre cero.\n");
        }
    }

    public static int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor, introduce un numero valido.");
            sc.next();
            System.out.print("Introduce un numero: ");
        }
        return sc.nextInt();
    }
}