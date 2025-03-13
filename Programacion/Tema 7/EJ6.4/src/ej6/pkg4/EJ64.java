/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg4;
/***
 * Ejercicio 4
 * Todas las cuentas corrientes con las que se va a trabajar pertenecen al mismo banco. 
 * Añadir un atributo que almacene el nombre del banco (que es único) en la clase CuentaCorriente.
 * Diseñar un método que permite recuperar y modificar el nombre del banco (al que pertenecen
 * todas las cuentas corrientes).
 */
import CuentasBanco.CuentaCorriente;
/**
 *
 * @author pedromiras
 */
public class EJ64 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("","",0.0,"");
        
        c1.setDni("238400735Q");
        c1.setNombreTitular("Pedro Miras");
        c1.setSaldo(1000);
        
        System.out.println("Saldo: "+c1.getSaldo());
        
    }
    
}
