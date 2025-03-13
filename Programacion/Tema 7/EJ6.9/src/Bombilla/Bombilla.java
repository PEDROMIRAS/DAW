/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bombilla;
/***
* Ejercicio 9
* Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda encender o apagar individualmente. 
* Para ello, hacer una clase Bombilla con una variable privada que indique si está encendida o apagada, 
* así como un método que nos diga el estado de una bombilla concreta. Además, queremos poner un interruptor general, 
* de forma que, si este se apaga, todas las bombillas quedan apagadas. Cuando el interruptor general se activa, 
* las bombillas vuelven a estar encendidas o apagadas, según estuvieran antes. Cada bombilla se enciende y se apaga 
* individualmente, pero solo responde que está encendida si su interruptor
* particular está activado y además hay luz general.
 */
/**
 *
 * @author pedromiras
 */
public class Bombilla {
    private static boolean interruptorGeneral = true;
    private boolean interruptorParticular;
    
    
    public Bombilla(){
        this.interruptorParticular = false;
    }
    
    public void apagarBombilla(){
        this.interruptorParticular = false;
    }
    
    public void encenderBombilla(){
        if (!interruptorGeneral) {
            System.out.println("El general debe estar encendido");
        }else{
            this.interruptorParticular = true;
        }
        
    }
    
    public boolean getEstado(){
        return interruptorGeneral && interruptorParticular;
    }
    
    public static void apagarInterruptorGeneral(){
        Bombilla.interruptorGeneral = false;

    }
    
    public static void encenderInterruptorGeneral(){
        Bombilla.interruptorGeneral = true;
        
    }
    
    public void estadoBombilla(int id){
    System.out.println("Bombilla " + id + " - Interruptor general: " + interruptorGeneral + " | Estado bombilla: " + (getEstado() ? "Encendida" : "Apagada"));

    }
}
