/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejentregables;

import java.util.Scanner;

/***
 * El DNI consta de un entero de 8 dígitos seguido de una letra que se obtiene a partir del número
 * de la siguiente forma:
 *    Letra = número DNI módulo 23
 * y diseña una aplicación en la que, dado un número de DNI, calcule la letra que le corresponde.
 * Observa que un número de 8 dígitos está dentro del rango del tipo int.
 */
/**
 *
 * @author pedromiras
 */
public class DNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.print("Introduce el numero del DNI: ");
        int numDNI = scanner.nextInt();
        
        int letraDNI=numDNI%23;
        
        switch(letraDNI){
            case 0:
                System.out.println("La letra correspondiente a ese numero de DNI es la T");
                break;
            case 1:
                System.out.println("La letra correspondiente a ese numero de DNI es la R");
                break;
            case 2:
                System.out.println("La letra correspondiente a ese numero de DNI es la W");
                break;
            case 3:
                System.out.println("La letra correspondiente a ese numero de DNI es la A");
                break;
            case 4:
                System.out.println("La letra correspondiente a ese numero de DNI es la G");
                break;
            case 5:
                System.out.println("La letra correspondiente a ese numero de DNI es la M");
                break;
            case 6:
                System.out.println("La letra correspondiente a ese numero de DNI es la Y");
                break;
            case 7:
                System.out.println("La letra correspondiente a ese numero de DNI es la F");
                break;
            case 8:
                System.out.println("La letra correspondiente a ese numero de DNI es la P");
                break;
            case 9:
                System.out.println("La letra correspondiente a ese numero de DNI es la D");
                break;
            case 10:
                System.out.println("La letra correspondiente a ese numero de DNI es la X");
                break;
            case 11:
                System.out.println("La letra correspondiente a ese numero de DNI es la B");
                break;
            case 12:
                System.out.println("La letra correspondiente a ese numero de DNI es la N");
                break;
            case 13:
                System.out.println("La letra correspondiente a ese numero de DNI es la J");
                break;
            case 14:
                System.out.println("La letra correspondiente a ese numero de DNI es la Z");
                break;
            case 15:
                System.out.println("La letra correspondiente a ese numero de DNI es la S");
                break;
            case 16:
                System.out.println("La letra correspondiente a ese numero de DNI es la Q");
                break;
            case 17:
                System.out.println("La letra correspondiente a ese numero de DNI es la V");
                break;
            case 18:
                System.out.println("La letra correspondiente a ese numero de DNI es la H");
                break;
            case 19:
                System.out.println("La letra correspondiente a ese numero de DNI es la L");
                break;
            case 20:
                System.out.println("La letra correspondiente a ese numero de DNI es la C");
                break;
            case 21:
                System.out.println("La letra correspondiente a ese numero de DNI es la K");
                break;
            case 22:
                System.out.println("La letra correspondiente a ese numero de DNI es la E");
                break;
            default:
                System.out.println("Numero de DNI invalido para asignarle una letra.");
                
        }
    }
    
}
//public static void main(String[] args) {
//        
//}