/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema2ejentregables;
/***
 * Realiza el ?juego de la suma?, que consiste en que aparezcan dos números aleatorios
 * (comprendidos entre 1 y 99) que el usuario tiene que sumar. La aplicación debe indicar si el
 * resultado de la operación (introducido por el usuario) es correcto o no.
 */
/**
 *
 * @author pedromiras
 */
import java.util.Random;
import java.util.Scanner;

public class JuegoSuma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generar dos números aleatorios entre 1 y 99
        int numero1 = random.nextInt(99) + 1;
        int numero2 = random.nextInt(99) + 1;

        // Mostrar los números al usuario
        System.out.println("Resuelve la suma:");
        System.out.println(numero1 + " + " + numero2 + " = ?");

        // Solicitar la respuesta del usuario
        System.out.print("Introduce tu respuesta: ");
        int respuestaUsuario = sc.nextInt();

        // Verificar si la respuesta es correcta
        int sumaCorrecta = numero1 + numero2;
        if (respuestaUsuario == sumaCorrecta) {
            System.out.println("¡Correcto! La suma es " + sumaCorrecta + ".");
        } else {
            System.out.println("Incorrecto. La respuesta correcta era " + sumaCorrecta + ".");
        }

        sc.close();
    }
}
