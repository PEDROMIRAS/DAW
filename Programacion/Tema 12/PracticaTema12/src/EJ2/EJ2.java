/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usr = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost:3306/Empresa";
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        Scanner sc = new Scanner(System.in);
        
        try{
            con = DriverManager.getConnection(url, usr, pswd);
            String sql = "select nombre, edad from Empleados where edad between ? and ?";
            pst = con.prepareStatement(sql);
             
            System.out.printf("Introduce la edad minima: ");
            int edadMin = sc.nextInt();
            System.out.printf("Introduce la edad maxima: ");
            int edadMax = sc.nextInt();
            pst.setInt(1, edadMin);
            pst.setInt(2, edadMax);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println("Nombre:" + nombre + ", Edad: " + edad);
                System.out.println();
            }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage() );
        }
        
    }
    
}

