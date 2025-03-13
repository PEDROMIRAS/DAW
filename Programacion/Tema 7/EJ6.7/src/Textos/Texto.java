/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Textos;

import java.time.LocalDateTime;

/***
 * Ejercicio 7
 * Diseñar la clase Texto que gestiona una cadena de caracteres con algunas características:
 *  - La cadena de caracteres tendrá una longitud máxima que se especifica en el constructor.
 *  - Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la longitud máxima.
 *  - Permite añadir una cadena al principio o al final, siempre que no supere el tamaño máximo.
 *  - Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
 *  - Cada objeto de tipo Texto registra la fecha de creación y la última modificación.
 *  - Debe existir un método que muestra la información de cada objeto.
 */

public class Texto {
    // Atributos de la clase
    private String contenido = ""; // Contenido del texto
    private final int longitudMaxima; // Longitud máxima permitida
    private final LocalDateTime fechaCreacion; // Fecha de creación del texto
    private LocalDateTime ultimaModificacion; // Fecha de la última modificación
    final String vocales = "AaEeIiOoUu"; // Cadena con las vocales en mayúsculas y minúsculas

    //Constructor de la clase Texto
    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.fechaCreacion = LocalDateTime.now(); // Registra la fecha de creación al momento de instanciar el objeto
        this.ultimaModificacion = fechaCreacion; // La última modificación inicia siendo la misma fecha de creación
    }

    //Método para añadir un carácter al inicio o al final del texto
    public boolean anadirCaracter(char c, boolean alInicio) {
        if (this.contenido.length() < this.longitudMaxima) { // Verifica si hay espacio disponible
            this.contenido = alInicio ? c + this.contenido : this.contenido + c; // Añade el carácter en la posición indicada
            modificarFecha(); // Actualiza la fecha de última modificación
            return true;
        }
        return false; // Retorna false si no hay espacio
    }
// Metodos hechos por alfonso    
//    public void addFinal(char c){
//        if (longitudMaxima > contenido.length()) {
//            contenido += this.contenido + c;
//            
//        }
//    }
//    
//    public void addInicio(char c){
//        if (longitudMaxima > contenido.length()) {
//            contenido += c + this.contenido;
//            
//        }
//    }
//    

   //Método para añadir una cadena de texto al inicio o al final del contenido
    public boolean anadirTexto(String texto, boolean alInicio) {
        if (this.contenido.length() + texto.length() <= this.longitudMaxima) { // Verifica si hay espacio disponible
            this.contenido = alInicio ? texto + this.contenido : this.contenido + texto; // Añade el texto en la posición indicada
            modificarFecha(); // Actualiza la fecha de última modificación
            return true;
        }
        return false; // Retorna false si la operación supera la longitud máxima permitida
    }
// Metodos añadir texto por alfonso
//
//  public void addFinal(String c){
//      if (longitudMaxima > contenido.length()+c.length()) {
//            contenido += this.contenido + c;
//            
//      }
//  }
//    
//  public void addInicio(String c){
//      if (longitudMaxima > contenido.length()+c.length()) {
//            contenido += c + this.contenido;
//            
//      }
//  }
//
    
    //Método que cuenta el número de vocales (mayúsculas y minúsculas) en el contenido del texto
    public int contarVocales() {
        int contador = 0;
       
        for (char c : this.contenido.toCharArray()) { // Recorre el contenido carácter por carácter
            if (vocales.indexOf(c) != -1) { // Verifica si el carácter es una vocal
                contador++; // Incrementa el contador si es una vocal
            }
        }
        return contador; // Retorna el total de vocales encontradas
    }
   
    //Método privado para actualizar la fecha de última modificación
    private void modificarFecha() {
        this.ultimaModificacion = LocalDateTime.now(); // Registra la nueva fecha de modificación
    }
    //Método para obtener el contenido del texto
    public String getContenido() {
        return this.contenido; //@return El contenido almacenado en el objeto
    }
    
    //Método que muestra la información del objeto Texto, incluyendo:
    public void mostrarInformacion() {
        System.out.println("Contenido: " + this.contenido); //- Contenido del texto
        System.out.println("Fecha de creacion: " + this.fechaCreacion); //- Fecha de creación
        System.out.println("Ultima modificacion: " + this.ultimaModificacion); //- Última fecha de modificación
        System.out.println("Numero de vocales: " + this.contarVocales()); //- Número de vocales en el texto
    }
}