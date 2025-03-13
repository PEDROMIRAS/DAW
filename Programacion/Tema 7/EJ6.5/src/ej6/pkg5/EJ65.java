/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg5;
/***
* Ejercicio 5
* Existen gestores que administras las cuentas bancarias y atienden a sus propietarios.
* Cada cuente, en caso de tenerlo, cuenta con un único gestor. Diseñar la clase Gestor de las que 
* interesa guardar su nombre, teléfono y el importe máximo autorizado con el que pueden operar. 
* Con respecto a los gestores, existen las siguientes restricciones:
* ? Un gestor tendrá siempre un nombre y un teléfono.
* ? Si no se asigna, el importe máximo autorizado por operación será de 10.000 euros.
* ? Un gestor, una vez asignado, no podrá camblar su número de teléfono. Y todo el mundo podrá consultarlo.
* El nombre será público y el importe máximo solo será visible por clases vecinas.
* Modificar la clase CuenteCorriente para que puede disponer de un objeto Gestor. Escribir los métodos necesarios.
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
