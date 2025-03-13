/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentasBanco;

/**
 *
 * @author pedromiras
 */
public class CuentaCorriente {
    protected String dni;
    public String nombreTitular;
    private double saldo;
    private static String nombreBanco;
    
    
//    // Constructor sobrecargado con saldo a 0
//    public CuentaCorriente(String dni, String nombreTitular) {
//        this(dni, nombreTitular, 0.0, " "); // Llama al otro constructor con saldo = 0
//    }

    // Constructor completo
    public CuentaCorriente(String dni, String nombreTitular, double saldoInicial, String nombreBanco) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
        CuentaCorriente.nombreBanco = "Caixa";
    }
    
//    // Constructor con dni y saldo inicial
//    public CuentaCorriente(String dni, double saldoInicial) {
//        this(dni, null, saldoInicial, " "); 
//    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Modificar banco
    public static String getNombreBanco() {
        return nombreBanco;
    }
    //Modificar banco
    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }
   
    
    public void sacarDinero(int retirada){
        if (this.saldo<retirada) {
            System.out.println("El saldo es insuficiente");
        }else{
            this.saldo-=retirada;
            System.out.println("Su saldo tras la retirada es: " +saldo);
        }
    }
    
    public void ingresarDinero(int ingreso){
        this.saldo+=ingreso;
        System.out.println("Su saldo tras el ingreso es: " +saldo);
    }
    
    public void mostrarInformacion(){
        System.out.println();
        System.out.println("El DNI del propietario es: "+dni);
        System.out.println("El nombre del propietario de la cuenta es: "+nombreTitular);
        System.out.println("El saldo actual de la cuenta es: "+saldo);
        
    }

    
}
