/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6.pkg10;

import Maquinaria.Locomotora;
import Maquinaria.Tren;
import Maquinaria.Vagon;
import Personal.Maquinista;
import Personal.Mecanico;

/***
* Ejercicio 10
* Hemos recibido el encargo de un cliente para definir los paquetes y las clases necesarias (solo implementar 
* los atributos y los constructores) para gestionar una empresa ferroviaria, en la que se distinguen dos 
* grandes grupos: el personal y la maquinaria. En el primero se ubican todos los empleados de la empresa y 
* que se clasifican en tres grupos: los maquinistas, los mec�nicos y los jefes de estaci�n. De cada uno de 
* ellos es necesario guardar:
* ? Maquinistas: su nombre, DNI, sueldo y el rango que tienen adquirido.
* ? Mec�nicos: su nombre, tel�fono (para contactar en caso de urgencia) y en qu� especialidad desarrollan 
*   su trabajo (esta puede ser: frenos, hidr�ulica, electricidad o motor).
* ? Jefes de estaci�n: su nombre, DNI y la fecha en la que fue nombrado jefe de estaci�n.
* En la parte de la maquinaria podemos encontrar trenes, locomotoras y vagones. De cada uno de ellos hay 
* que considerar:
* ? Vagones: tienen un n�mero que los identifica, una carga m�xima (en kilos), la carga actual y el tipo de 
*   mercanc�a con el que est�n cargados.
* ? Locomotoras: disponen de una matr�cula (que las identifica), la potencia de sus motores y su antig�edad 
*   (a�o de fabricaci�n). Adem�s, cada locomotora tiene asignado un mec�nico que se encarga de su mantenimiento.
* ? Trenes: est�n formados por una locomotora y un m�ximo de 5 vagones. Cada tren tiene asignado un maquinista 
*   que es el responsable de �l.
 */
/**
 *
 * @author pedromiras
 */
public class EJ610 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un mec�nico
        Mecanico mecanico1 = new Mecanico("Pedro", 123456789, Mecanico.Especialidad.MOTOR);

        // Crear una locomotora
        Locomotora locomotora1 = new Locomotora("ABC123", 5000, 10, mecanico1);

        // Crear un maquinista
        Maquinista maquinista1 = new Maquinista("Juan P�rez", "12345678A", 2500, Maquinista.Rango.EXPERTO);

        // Crear un tren
        Tren tren1 = new Tren(locomotora1, maquinista1);

        // Agregar vagones
        tren1.agregarVagon(new Vagon(1, 1000, 500, "Granos"));
        tren1.agregarVagon(new Vagon(2, 1200, 800, "Petroleo"));
        tren1.agregarVagon(new Vagon(3, 900, 600, "Madera"));
        tren1.agregarVagon(new Vagon(4, 1100, 700, "Hierro"));
        tren1.agregarVagon(new Vagon(5, 950, 950, "Carbon"));
        tren1.agregarVagon(new Vagon(6, 800, 400, "Gas")); // No se a�adir� porque es un sexto vagon y el tren solo tiene 5
    }
}
    

