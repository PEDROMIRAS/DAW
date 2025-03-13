/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author pedromiras
 */
public class Gestor {
    private final int tlfno;
    public static String nombre;
    protected int saldoOperar;

   public Gestor (int tlfno, String nombre, int saldoOperar){
       this.tlfno = tlfno;
       Gestor.nombre = nombre;
       this.saldoOperar = saldoOperar;
   }
   
   public Gestor(int tlfno, String nombre){
       this(tlfno, Gestor.nombre, 10000);
       
   }

    public final int getTlfno() {
        return tlfno;
    }
    
    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Gestor.nombre = nombre;
    }

    public int getSaldoOperar() {
        return saldoOperar;
    }

    public void setSaldoOperar(int saldoOperar) {
        this.saldoOperar = saldoOperar;
    }
   
   
}
