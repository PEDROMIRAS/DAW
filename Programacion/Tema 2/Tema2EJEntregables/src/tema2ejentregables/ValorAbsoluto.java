/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2ejentregables;
/***
 * Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al
 * usuario por teclado.
/**
 *
 * @author pedromiras
 */
import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario un número
        System.out.printf("Introduce un numero: ");
        double numero = sc.nextDouble();

        // Calcular el valor absoluto usando el operador ternario
        double valorAbsoluto = (numero < 0) ? -numero : numero;

        // Mostrar el resultado
        System.out.println("El valor absoluto es: " + valorAbsoluto);

        sc.close();
    }
}
