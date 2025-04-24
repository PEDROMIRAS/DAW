/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej11.pkg2;
/***
 * Ejercicio 2 
 * Escribir como una cadena, en el fichero binario cancionPirata.dat, la siguiente estrofa:
 * 
 *      Con diez cañones por banda,
 *      viento en popa a toda vela,
 *      no corta el mar, si no vuela
 *      un velero bergantín
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author pedromiras
 */

public class EJ112 {

    public static void main(String[] args) {
        String ruta = "cancionPirata.dat";
        String estrofa = "Con diez cañones por banda,\n"
                       + "viento en popa a toda vela,\n"
                       + "no corta el mar, si no vuela\n"
                       + "un velero bergantín";

        try (ObjectOutputStream oS = new ObjectOutputStream(new FileOutputStream(ruta))) {
            oS.writeObject(estrofa);
            System.out.println("Estrofa escrita correctamente en " + ruta);
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}