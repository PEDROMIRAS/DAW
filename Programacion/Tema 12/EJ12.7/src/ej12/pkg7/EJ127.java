/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12.pkg7;

/***
 * Ejercicio 7 
 * Escribir un programa que muestre todos los alumnos de un curso cuya nota es 
 * mayor que cierta nota de corte. Tanto el curso como la nota de corte serán 
 * introducidos por el usuario.
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
public class EJ127 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usr = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost:3306/Instituto";
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        Scanner sc = new Scanner(System.in);
        try{
            con = DriverManager.getConnection(url, usr, pswd);
            String sql = "select nombre from alumnos where curso = ? and media > ?";
            pst = con.prepareStatement(sql);
            
            System.out.printf("Introduce la clase: ");
            String curso = sc.nextLine();
            System.out.printf("Introduce la nota media: ");
            double media = sc.nextDouble();
            
            pst.setString(1, curso);
            pst.setDouble(2, media);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                String nombre = rs.getString("nombre");
                System.out.println("Nombre: " + nombre);
            }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
