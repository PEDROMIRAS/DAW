/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author pedromiras
 */
public class Persona {
   public String nombre;
   public int edad;
   public double estatura;
   static public String dia;
   
   public Persona(String nombre, int edad, double estatura){
       this.nombre = nombre;
       this.edad = edad;
       this.estatura = edad;
   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

   public void imprimirNombre(){
       System.out.println("Hola mi nombre es  "+nombre);
   }
   public void cumplirAnios(){
       edad++;
       System.out.println("Felicidades la edad de "+nombre+" ahora es "+edad);
   }
   
   public void crecer(double incremento){
       estatura+=incremento;
       System.out.println(nombre+" crecio "+incremento +" cm, ahora mide "+estatura+".");
   }
   
   public void esHoy(int dia){
       switch(dia){
            case 1 -> Persona.dia = "Lunes";
            case 2 -> Persona.dia = "Martes";
            case 3 -> Persona.dia = "Miercoles";
            case 4 -> Persona.dia = "Jueves";
            case 5 -> Persona.dia = "Viernes";
            case 6 -> Persona.dia = "Sabado";
            case 7 -> Persona.dia = "Domingo";
       }
       System.out.println("Hoy es "+dia);
}
}
