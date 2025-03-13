/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicatema5;
import java.util.Arrays;
import java.util.Scanner;

/***
 * Ejercicio 3
 *   El ayuntamiento de tu localidad te ha encargado una aplicación que ayude a realizar encuestas
 *   estadísticas para conocer el nivel adquisitivo de los habitantes del municipio. Para ello, tendrás
 *   que preguntar el sueldo a cada persona encuestada. A priori, no conoces el número de
 *   encuestados. Para finalizar la entrada de datos, introduce un sueldo con valor -1.
 *   Una vez terminada la entrada de datos, muestra la siguiente información:
 *       - Todos los sueldos introducidos ordenador de forma decreciente.
 *       - El sueldo máximo y mínimo.
 *       - La media de los sueldos.
 */
/**
 *
 * @author pedromiras
 */
public class Ejercicio3 {
    public static int[] encuestados(){
        Scanner sc = new Scanner(System.in);
        
        int[] sueldosEncuestados = new int[1];
        int indice = 0;
        int sueldo;
        
        System.out.println("Introduce los sueldos de los encuestados:");
        
        do {
            System.out.printf("Sueldo: ");
            sueldo = sc.nextInt();
            
            if (sueldo != -1) {//Copiar en el array si no es -1 y aumentar el tamaño del array en 1 para poder insertar 
                if (indice == sueldosEncuestados.length) {
                    int arrayAux[] = new int[sueldosEncuestados.length+1];
                    System.arraycopy(sueldosEncuestados, 0, arrayAux, 0, sueldosEncuestados.length);
                    sueldosEncuestados = arrayAux;
                }
                sueldosEncuestados[indice++] = sueldo;
            }
        } while (sueldo != -1);
        
        return sueldosEncuestados;
    }
    
    public static void clasificarSueldos(int[] arrayEncuestados){
        int sumaMedia = 0;
//        int sueldoMax = Integer.MIN_VALUE; // Inicializa con el menor valor posible
//        int sueldoMin = Integer.MAX_VALUE; // Inicializa con el mayor valor posible
        
        for (int i = 0; i < arrayEncuestados.length; i++) {
            sumaMedia+= arrayEncuestados[i];
            
//   Sirve para ver cual es el sueldo maximo y el sueldo minimo
//            if (arrayEncuestados[i] > sueldoMax) {
//                sueldoMax = arrayEncuestados[i];
//                
//            }else if (arrayEncuestados[i] < sueldoMin) {
//               sueldoMin = arrayEncuestados[i];
//            }
        }
        
        int media = sumaMedia / arrayEncuestados.length;
        
        Arrays.sort(arrayEncuestados);
// Una forma facil de coger el sueldo mas grande y el mas pequeño, una vez ordenado
// el array coger el primer valor y el ultimo de este
        int sueldoMin = arrayEncuestados[0];
        int sueldoMax = arrayEncuestados[arrayEncuestados.length-1];
        
        System.out.println();
        System.out.println("Datos de los sueldos: ");
        System.out.println("Los sueldos encuestados y ordenados son: "+ Arrays.toString(arrayEncuestados));
        System.out.println("El sueldo maximo es: "+ sueldoMax +" y el sueldo minimo es: "+ sueldoMin );
        System.out.println("La media de sueldos es: "+media);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        clasificarSueldos(encuestados());
        
    }
    
}
