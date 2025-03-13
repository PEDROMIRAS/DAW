/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicatema5;

import java.util.Scanner;

/***
 * Ejercicio 4
 * Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo. Los
 * alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (números enteros)
 * del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la nota media del
 * grupo en cada trimestre y la media del alumno que se encuentra en una posición dada (que el
 * usuario introduce por teclado). Es obligatorio hacer uso de arrays bidimensionales.
 */
/**
 *
 * @author pedromiras
 */
public class Ejercicio4 {
    public static int[][] leerNotas() {
        Scanner sc = new Scanner(System.in);
        int notasAlumnos[][] = new int[5][3];

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce las 3 notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.printf("Nota "+(j+1)+": ");
                notasAlumnos[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return notasAlumnos;
    }

    public static void calcularMedias(int[][] notasAlumnos) {
        int[] sumaTrimestres = new int[3];
        Scanner sc = new Scanner(System.in);

        // Calcular la media de cada trimestre
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                sumaTrimestres[j] += notasAlumnos[i][j];
            }
        }

        // Mostrar las medias trimestrales
        for (int j = 0; j < 3; j++) {
            System.out.println("La nota media del trimestre " + (j + 1) + " es: " + (sumaTrimestres[j] / 5.0));
        }

        // Pedir al usuario la posición del alumno para calcular su media
        System.out.print("\nIndique el numero del alumno para conocer su media individual (1-5): ");
        int opc = sc.nextInt() - 1; // Ajuste para índices del array

        if (opc >= 0 && opc < 5) {
            int sumaAlumno = 0;
            for (int nota : notasAlumnos[opc]) {
                sumaAlumno += nota;
            }
            System.out.println("La media del alumno " + (opc + 1) + " es: " + (sumaAlumno / 3.0));
        } else {
            System.out.println("Numero de alumno invalido.");
        }
    }
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calcularMedias(leerNotas());
    }
    
}
