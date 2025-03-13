/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg1;
/***Crear la clase cuentaCorriende , que almacene los datos: DNI y nombre del titular, asi como el saldo. 
*   Las operaciones tipicas de una cuenta corriente son:
*   -Crear una cuenta correiente: DNI , Nombre titular, saldo a 0
*   -Scar dinero, indicara si hay suficiente dinero o no 
*   -Ingresar dinero
*   -Mostar informacion de la cuenta 
* 
***/
/**
 *
 * @author pedromiras
 */
public class EJ61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("23840735Q", "Pedro");
        CuentaCorriente c2 = new CuentaCorriente("23840735Q",1500.0);
        CuentaCorriente c3 = new CuentaCorriente("23840735Q", "Pedro",2560.0);

//        c1.ingresarDinero(700);
//        c1.sacarDinero(300);
        
        c1.mostrarInformacion();
        
        c2.mostrarInformacion();
        
        c3.mostrarInformacion();
    }
    
}
