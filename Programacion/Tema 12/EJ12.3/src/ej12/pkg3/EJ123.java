/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12.pkg3;
import java.sql.*;
import java.util.Scanner;
/**
 *
 * @author pedromiras
 */
public class EJ123 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          String usr = "root";
          String pswd = "";
          String url = "jdbc:mysql://localhost:3306/Instituto";
          Connection con;
          PreparedStatement pst;
          Scanner sc = new Scanner(System.in);
          
          try{
              con = DriverManager.getConnection(url, usr, pswd);
              String sql = "delete from alumnos where num = ?";
              pst = con.prepareStatement(sql);
              
              System.out.println("Introduce el id del alumno a eliminar: ");
              int id = sc.nextInt();
              
              pst.setInt(1, id);
              pst.executeUpdate();
              
          }catch(SQLException ex){
              System.out.println("Error: " + ex.getMessage());
          }
    }
    
}
