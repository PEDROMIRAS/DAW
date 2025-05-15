/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej112.pkg4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;
/***
 * EJERCICIO 4
 * Mostrar el nombre y la fecha de nacimiento de todos los alumnos de un 
 * curso, que se solicitara por teclado
 */
/**
 *
 * @author pedromiras
 */
public class EJ1124 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "root";
        String pwd = "";
        Connection con;
        String url = "jdbc:mysql://localhost:3306/Instituto";
        Statement st;
        ResultSet rs;
        try{
            con = DriverManager.getConnection(url,user,pwd);
            System.out.printf("Indique un curso para mostrar los alumnos: ");
            String curso = sc.nextLine();
            String sql = "SELECT nombre, fnac  from alumnos where curso = '" + curso +"'";
            st = con.createStatement();
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                System.out.println("Alumno: " + rs.getString("nombre"));
                System.out.println("Fecha nacimineto: " + rs.getString("fnac"));
                System.out.println();
            }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
