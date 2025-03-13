/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalesEjemplo;

/**
 *
 * @author pedromiras
 */
    // Clase (subclase) que hereda de Animal
class Perro extends Animal {
    String raza;
  // Constructor de la subclase que llama al constructor de la superclase usando super
    public Perro(String tipo, String raza) {
        super(tipo); // Llamada al constructor de la superclase
        this.raza = raza;
    }
    // M�todo de la subclase que sobrescribe el m�todo de la superclase usando super
    @Override
    public void emitirSonido() {
        super.emitirSonido(); // Llamada al m�todo de la superclase
        System.out.println("El perro ladra."); // Nueva funcionalidad de la subclase
    }
    // M�todo espec�fico de la subclase
    public void mostrarRaza() {
        System.out.println("Raza del perro: " + raza);
    }
}
