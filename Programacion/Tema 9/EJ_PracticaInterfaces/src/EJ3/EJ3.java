/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ3;

/**
 *
 * @author pmira
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CocheElectrico cE1 = new CocheElectrico("Toyota", "Yaris", 550);
        CocheElectrico cE2 = new CocheElectrico("Tesla", "Cyber Truck", 600);
        
        MotoCombustion m1 = new MotoCombustion("Harley-Davidson", "Sporster", 9);
        MotoCombustion m2 = new MotoCombustion("Honda", "CB1000R", 17);
        
        cE1.mostrarDetalles();
        cE1.cargarBateria();
        
        cE2.mostrarDetalles();
        cE2.cargarBateria();
        
        m1.mostrarDetalles();
        m1.llenarTanque();
        
        m2.mostrarDetalles();
        m2.llenarTanque();
    }
    
}
