/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package entregablestema3;

import java.util.Scanner;

/***
 * Escribe un programa que solicite al usuario las distintas cantidades de dinero de las que
 * dispone. Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en un cajón y
 * en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone el usuario.
 * La manera de especificar que no se desea introducir más cantidades es mediante el cero
 */
/**
 *
 * @author pedromiras
 */
public class CantidadesDinero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dinero, sumaDinero=0;
        
        do {
            System.out.printf("Ingrese una cantidad de dinero:");
            dinero=scanner.nextInt();
            sumaDinero+=dinero;
            
        } while (dinero!=0);
        
        System.out.println("El dinero total es: "+sumaDinero);
        
    }
    
}
