/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maquinaria;

import Personal.Mecanico;

/**
 *
 * @author pedromiras
 */
public class Locomotora {
    private final String matricula;
    private final int potenciaMotor;
    private final int antiguedad;
    private Mecanico mecanico;
    
    public Locomotora(String matricula, int potenciaMotor, int antiguedad, Mecanico mecanico){
        this.matricula = matricula;
        this.potenciaMotor = potenciaMotor;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
    }
    
}
