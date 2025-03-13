/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herenciapersonaempleado;

/**
 *
 * @author pedromiras
 */
public class HerenciaPersonaEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Persona p;
        p = new Persona("Pedro", 29,1.65);
        System.out.println(p.obtenerInformacionPersona());
        p = new Empleado("Pedro", 29, 1.65, "MotherFucker", 3000.00);
        System.out.println(p.obtenerInformacionPersona());
        p = new Cliente("Pedro", 29, 1.65, 6969);
        System.out.println(p.obtenerInformacionPersona());
        
        System.out.println(p);
        
        Persona p1 = new Persona("Adrian", 31,1.85);
        Persona p2 = new Persona("Adrian", 31,1.65);
        Persona p3 = new Persona("Juan", 31,1.85);
        
        System.out.println("Son la misma persona? "+p1.equals(p3));
        System.out.println("Son la misma persona? "+p1.equals(p2));
        
        Class clase = p1.getClass();
        Class clase1 = p.getClass().getSuperclass();
        
        System.out.println("Clase: "+clase);
        System.out.println("SuperClase: "+clase1);
        
    }
    
}
