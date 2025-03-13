/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2.pkg15;

import java.util.Scanner;

/***
 * Pedir un dia, mes y año de una fecha e indicar si la fecha es correcta.Hay que 
 * tener en cuenta que existen meses con 28,30,31 dias (no se considerara los bisiestos)
 */
/**
 *
 * @author pedromiras
 */
public class EJ215 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Vamos a insertar una fecha dd/mm/aa");
        System.out.println("Inserte un dia: ");
        int dia=sc.nextInt();
        System.out.println("Inserte un mes: ");
        int mes=sc.nextInt();
        System.out.println("Inserte un año: ");
        int anio=sc.nextInt();
        
        switch(mes){
            case 1,3,5,7,8,10,12 -> {
                if(dia<=31){
                    System.out.println(dia+"/"+mes+"/"+anio);
                }else{
                    System.out.println("Fecha erronea");
                }
            }
            case 2 -> {
                if(dia<=28){
                    System.out.println(dia+"/"+mes+"/"+anio);
                }else{
                    System.out.println("Fecha erronea");
                }
            }
            case 4,6,9,11 -> {
                if(dia<=30){
                    System.out.println(dia+"/"+mes+"/"+anio);
                }else{
                    System.out.println("Fecha erronea");
                }
            }
            default->{
                System.out.println("Fecha erronea");
            }
            
        }
    }
    
}
