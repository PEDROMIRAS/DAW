/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg3;

import ej6.pkg3.Cuentas.CuentaCorriente;

/***
 * Ejercicio 3
 *Modificar la visibilidad de la clase CuentaCorriente para que sea visible desde clases externas y
 *la visibilidad de sus atributos para que:
 *? saldo no se visible por otras clases.
 *?
 *?nombre sea público para cualquier clase.
 *dni solo sea visible por clases vecinas.
Realizar un programa para comprobar la visibilidad de sus atributos.
 */
/**
 *
 * @author pedromiras
 */
public class EJ63 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("23840735Q", "Pedro");
        CuentaCorriente c2 = new CuentaCorriente("23840735Q",1500.0);
        CuentaCorriente c3 = new CuentaCorriente("23840735Q", "Pedro",2560.0);

//      c1.ingresarDinero(700);
        c1.sacarDinero(300);
        
      //  c1.saldo = 100; //saldo es privado para esta clase por lo que no se puede acceder
        c3.nombreTitular= "Pedro";
        c2.mostrarInformacion();
        
        c3.mostrarInformacion();
    }
    
}
