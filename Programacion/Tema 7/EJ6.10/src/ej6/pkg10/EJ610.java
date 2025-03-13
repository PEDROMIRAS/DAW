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
* que se clasifican en tres grupos: los maquinistas, los mecánicos y los jefes de estación. De cada uno de 
* ellos es necesario guardar:
* ? Maquinistas: su nombre, DNI, sueldo y el rango que tienen adquirido.
* ? Mecánicos: su nombre, teléfono (para contactar en caso de urgencia) y en qué especialidad desarrollan 
*   su trabajo (esta puede ser: frenos, hidráulica, electricidad o motor).
* ? Jefes de estación: su nombre, DNI y la fecha en la que fue nombrado jefe de estación.
* En la parte de la maquinaria podemos encontrar trenes, locomotoras y vagones. De cada uno de ellos hay 
* que considerar:
* ? Vagones: tienen un número que los identifica, una carga máxima (en kilos), la carga actual y el tipo de 
*   mercancía con el que están cargados.
* ? Locomotoras: disponen de una matrícula (que las identifica), la potencia de sus motores y su antigüedad 
*   (año de fabricación). Además, cada locomotora tiene asignado un mecánico que se encarga de su mantenimiento.
* ? Trenes: están formados por una locomotora y un máximo de 5 vagones. Cada tren tiene asignado un maquinista 
*   que es el responsable de él.
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
        // Crear un mecánico
        Mecanico mecanico1 = new Mecanico("Pedro", 123456789, Mecanico.Especialidad.MOTOR);

        // Crear una locomotora
        Locomotora locomotora1 = new Locomotora("ABC123", 5000, 10, mecanico1);

        // Crear un maquinista
        Maquinista maquinista1 = new Maquinista("Juan Pérez", "12345678A", 2500, Maquinista.Rango.EXPERTO);

        // Crear un tren
        Tren tren1 = new Tren(locomotora1, maquinista1);

        // Agregar vagones
        tren1.agregarVagon(new Vagon(1, 1000, 500, "Granos"));
        tren1.agregarVagon(new Vagon(2, 1200, 800, "Petroleo"));
        tren1.agregarVagon(new Vagon(3, 900, 600, "Madera"));
        tren1.agregarVagon(new Vagon(4, 1100, 700, "Hierro"));
        tren1.agregarVagon(new Vagon(5, 950, 950, "Carbon"));
        tren1.agregarVagon(new Vagon(6, 800, 400, "Gas")); // No se añadirá porque es un sexto vagon y el tren solo tiene 5
    }
}
    

