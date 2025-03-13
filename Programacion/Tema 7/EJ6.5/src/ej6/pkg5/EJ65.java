/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg5;
/***
* Ejercicio 5
* Existen gestores que administras las cuentas bancarias y atienden a sus propietarios.
* Cada cuente, en caso de tenerlo, cuenta con un �nico gestor. Dise�ar la clase Gestor de las que 
* interesa guardar su nombre, tel�fono y el importe m�ximo autorizado con el que pueden operar. 
* Con respecto a los gestores, existen las siguientes restricciones:
* ? Un gestor tendr� siempre un nombre y un tel�fono.
* ? Si no se asigna, el importe m�ximo autorizado por operaci�n ser� de 10.000 euros.
* ? Un gestor, una vez asignado, no podr� camblar su n�mero de tel�fono. Y todo el mundo podr� consultarlo.
* El nombre ser� p�blico y el importe m�ximo solo ser� visible por clases vecinas.
* Modificar la clase CuenteCorriente para que puede disponer de un objeto Gestor. Escribir los m�todos necesarios.
 */
import Banco.*;
/**
 *
 * @author pedromiras
 */
public class EJ65 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gestor g1 = new Gestor(636595608, "Pedro Miras", 75000);
        CuentaCorriente c1 = new CuentaCorriente("23840735Q","Pedro",15000,"Caixa",g1);
        
        c1.mostrarInformacion();
    }
    
}
