/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package elfruteroymanzanas;

import java.util.Scanner;

/**
 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas 
 * y peras. Por ese motivo, es necesario diseñar una aplicación que solicite las ventas (en kilos) 
 * de cada semestre para cada fruta. La aplicación mostrará el importe total sabiendo que el precio del 
 * kilo de manzanas está fijado en 2.35? y el kilo de peras en 1.95?.
 */
/**
 *
 * @author pedromiras
 */
public class ElFruteroYManzanas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        /*
        System.out.println("Cuantos kg de manzanas has vendido el primer semestre? ");
        int manzanasPrimero=sc.nextInt();
        System.out.println("Cuantos kg de peras has vendido el primer semestre? ");
        int perasPrimero=sc.nextInt();
        System.out.println("Cuantos kg de manzanas has vendido el segundo semestre? ");
        int manzanasSegundo=sc.nextInt();
        System.out.println("Cuantos kg de peras has vendido el segundo semestre? ");
        int perasSegundo=sc.nextInt();
        
        manzanasPrimero*=2.35; //manzanasPrimero=manzanasPrimero*2.35; 1++ 1+1
        perasPrimero*=1.95;
        manzanasSegundo*=2.35;
        perasSegundo*=1.95;
        
        double beneficiosAnuales=manzanasPrimero+perasPrimero+manzanasSegundo+perasSegundo;
        
        System.out.println("Los beneficios anuales obtenidos son: "+beneficiosAnuales+" ?");
        */
        
        final double PRECIO_M=2.35;
        final double PRECIO_P=1.95;
        
        System.out.println("Cuantos kg de manzanas has vendido el primer semestre? ");
        int mPrimero=sc.nextInt();
        
        System.out.println("Cuantos kg de peras has vendido el primer semestre? ");
        int pPrimero=sc.nextInt();
        
        System.out.println("Cuantos kg de manzanas has vendido el segundo semestre? ");
        int mSegundo=sc.nextInt();
        
        System.out.println("Cuantos kg de peras has vendido el segundo semestre? ");
        int pSegundo=sc.nextInt();
        
        int kilosManzanas=mPrimero+mSegundo;
        int kilosPeras=pPrimero+pSegundo;
        
        kilosManzanas*=PRECIO_M;
        kilosPeras*=PRECIO_P;
        
        double beneficioAnual=kilosManzanas+kilosPeras;
        System.out.println("Los beneficios anuales son: "+beneficioAnual+" euros");
    }
    
}
