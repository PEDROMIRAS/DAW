/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresarioiva;
import java.util.Scanner;
/**
 * Un economista te ha encargado un progama para realizar calculos con IVA. La aplicacion
 * debe solicitar la base del importe y el IVA que se debe aplicar. Muestra en pantalla el importe 
 * correspondiente al IVA y al total.
 */
/**
 *
 * @author pedromiras
 */
public class EmpresarioIVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Indique el importe base: ");
        double importeBase=sc.nextDouble();
        
        System.out.print("Indique el IVA a aplicar: ");
        double iva=sc.nextDouble();
        
        double ivaImporte=importeBase*(iva/100);
        
        double importeBaseIVA=importeBase+ivaImporte;
        
        System.out.println("El importe base "+importeBase+" mas el iva del "+iva+"% es igual a: "+importeBaseIVA);
    }
    
}
