/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author pedromiras
 */
public class CuentaCorriente {
    protected String dni;
    public String nombreTitular;
    private double saldo;
    private static String nombreBanco;
    private Gestor gestor;

    // Constructor completo
    public CuentaCorriente(String dni, String nombreTitular, double saldoInicial, String nombreBanco, Gestor gestor) {
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
        CuentaCorriente.nombreBanco = nombreBanco;
        this.gestor = gestor;
    }
//    
//        // Constructor sobrecargado con saldo a 0
//    public CuentaCorriente(String dni, String nombreTitular) {
//        this(dni, nombreTitular, 0.0, " ",gestor); // Llama al otro constructor con saldo = 0
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

    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    public Gestor getGestor() {
        return gestor;
    }

    public void sacarDinero(double retirada) {
        if (this.saldo < retirada) {
            System.out.println("El saldo es insuficiente");
        } else {
            this.saldo -= retirada;
            System.out.println("Retiro exitoso. Su saldo tras la retirada es: " + saldo);
        }
    }

    public void ingresarDinero(double ingreso) {
        if (ingreso > 0) {
            this.saldo += ingreso;
            System.out.println("Ingreso exitoso. Su saldo tras el ingreso es: " + saldo);
        } else {
            System.out.println("El ingreso debe ser un valor positivo.");
        }
    }

    public void mostrarInformacion() {
        System.out.println();
        System.out.println("El DNI del propietario es: " + dni);
        System.out.println("El nombre del propietario de la cuenta es: " + nombreTitular);
        System.out.println("El saldo actual de la cuenta es: " + saldo);
        System.out.println("La cuenta corriente pertenece al banco: " + nombreBanco);
        System.out.println("Informacion del Gestor:");
        System.out.println("  - Nombre: " + Gestor.getNombre());
        System.out.println("  - Telefono: " + gestor.getTlfno()); // Cumpliendo la norma de visibilidad
    }
}