/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AnimalesEjemplo;

/**
 *
 * @author pedromiras
 */
public class PruebaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un objeto de la subclase Perro
        Perro miPerro = new Perro("Canino","Labrador");
        // Llamar al m�todo de la subclase que sobrescribe el m�todo de la superclase
        miPerro.emitirSonido();
        // Llamar al m�todo espec�fico de la subclase
        miPerro.mostrarRaza();
    }
    
}
