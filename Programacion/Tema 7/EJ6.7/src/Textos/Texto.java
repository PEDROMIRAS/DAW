/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Textos;

import java.time.LocalDateTime;

/***
 * Ejercicio 7
 * Dise�ar la clase Texto que gestiona una cadena de caracteres con algunas caracter�sticas:
 *  - La cadena de caracteres tendr� una longitud m�xima que se especifica en el constructor.
 *  - Permite a�adir un car�cter al principio o al final, siempre y cuando no se exceda la longitud m�xima.
 *  - Permite a�adir una cadena al principio o al final, siempre que no supere el tama�o m�ximo.
 *  - Es necesario saber cu�ntas vocales (may�sculas y min�sculas) hay en el texto.
 *  - Cada objeto de tipo Texto registra la fecha de creaci�n y la �ltima modificaci�n.
 *  - Debe existir un m�todo que muestra la informaci�n de cada objeto.
 */

public class Texto {
    // Atributos de la clase
    private String contenido = ""; // Contenido del texto
    private final int longitudMaxima; // Longitud m�xima permitida
    private final LocalDateTime fechaCreacion; // Fecha de creaci�n del texto
    private LocalDateTime ultimaModificacion; // Fecha de la �ltima modificaci�n
    final String vocales = "AaEeIiOoUu"; // Cadena con las vocales en may�sculas y min�sculas

    //Constructor de la clase Texto
    public Texto(int longitudMaxima) {
        this.longitudMaxima = longitudMaxima;
        this.fechaCreacion = LocalDateTime.now(); // Registra la fecha de creaci�n al momento de instanciar el objeto
        this.ultimaModificacion = fechaCreacion; // La �ltima modificaci�n inicia siendo la misma fecha de creaci�n
    }

    //M�todo para a�adir un car�cter al inicio o al final del texto
    public boolean anadirCaracter(char c, boolean alInicio) {
        if (this.contenido.length() < this.longitudMaxima) { // Verifica si hay espacio disponible
            this.contenido = alInicio ? c + this.contenido : this.contenido + c; // A�ade el car�cter en la posici�n indicada
            modificarFecha(); // Actualiza la fecha de �ltima modificaci�n
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

   //M�todo para a�adir una cadena de texto al inicio o al final del contenido
    public boolean anadirTexto(String texto, boolean alInicio) {
        if (this.contenido.length() + texto.length() <= this.longitudMaxima) { // Verifica si hay espacio disponible
            this.contenido = alInicio ? texto + this.contenido : this.contenido + texto; // A�ade el texto en la posici�n indicada
            modificarFecha(); // Actualiza la fecha de �ltima modificaci�n
            return true;
        }
        return false; // Retorna false si la operaci�n supera la longitud m�xima permitida
    }
// Metodos a�adir texto por alfonso
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
    
    //M�todo que cuenta el n�mero de vocales (may�sculas y min�sculas) en el contenido del texto
    public int contarVocales() {
        int contador = 0;
       
        for (char c : this.contenido.toCharArray()) { // Recorre el contenido car�cter por car�cter
            if (vocales.indexOf(c) != -1) { // Verifica si el car�cter es una vocal
                contador++; // Incrementa el contador si es una vocal
            }
        }
        return contador; // Retorna el total de vocales encontradas
    }
   
    //M�todo privado para actualizar la fecha de �ltima modificaci�n
    private void modificarFecha() {
        this.ultimaModificacion = LocalDateTime.now(); // Registra la nueva fecha de modificaci�n
    }
    //M�todo para obtener el contenido del texto
    public String getContenido() {
        return this.contenido; //@return El contenido almacenado en el objeto
    }
    
    //M�todo que muestra la informaci�n del objeto Texto, incluyendo:
    public void mostrarInformacion() {
        System.out.println("Contenido: " + this.contenido); //- Contenido del texto
        System.out.println("Fecha de creacion: " + this.fechaCreacion); //- Fecha de creaci�n
        System.out.println("Ultima modificacion: " + this.ultimaModificacion); //- �ltima fecha de modificaci�n
        System.out.println("Numero de vocales: " + this.contarVocales()); //- N�mero de vocales en el texto
    }
}