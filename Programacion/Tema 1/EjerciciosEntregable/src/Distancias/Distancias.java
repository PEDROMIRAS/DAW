/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Distancias;

import java.util.Scanner;
/***
 * Solicita al usuario tres distancias:
 * -La primera en milimetros 
 * -La segunda en centimetros
 * -La ultima en metros
 * Diseña un porgrama que muestre la suma de las tres longitudes introducidas
 * (medida en centimetros).
 */
/**
 *
 * @author pedromiras
 */
public class Distancias {
    public static void main(String[] args){
        int mm, cm, m;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Inserte una distancia en mm:");
        mm=sc.nextInt();
        
        System.out.println("Inserte una distancia en cm:");
        cm=sc.nextInt();
        
        System.out.println("Inserte una distancia en m:");
        m=sc.nextInt();
        
        mm/=10;
        m*=100;
        
        int sumaMedidas=mm+cm+m;
        
        System.out.println("La suma de las tres medidas en cm es: "+sumaMedidas);
        
        
    }
}
