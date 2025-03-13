/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnimalesEjemplo;

/**
 *
 * @author pedromiras
 */
    // Clase (superclase)
    class Animal {
        String tipo;
        // Constructor de la superclase
        public Animal(String tipo) { 
            this.tipo = tipo; 
        }
        // Método de la superclase
        public void emitirSonido() {
           System.out.println("El animal emite un sonido.");
         }
}
