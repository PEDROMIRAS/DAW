/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12.pkg8;
/***
 * Ejercicio 8
 * Diseñar una aplicación que muestre un informe de los alumnos, según sus 
 * notas: todos los alumnos cuya nota es Bien (nota entre 6 y 7) y todos los 
 * alumnos cuya nota es Notable (entre 7 y 9). Cada informe debe ordenarse por 
 * la nota de forma ascendente.Para realizar esta actividad usaremos una consulta 
 * con parámetros y la reutilizaremos.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author pedromiras
 */
public class EJ128 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String usr = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost:3306/Instituto";
        Connection  con;
        ResultSet rs;
        PreparedStatement pst;
        
    }
    
}
