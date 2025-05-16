/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author pedromiras
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usr = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost:3306/Empresa";
        Connection con;
        Statement pst;
        ResultSet rs;
        
        try{
            con = DriverManager.getConnection(url, usr, pswd);
            String sql = "select numemp, nombre, puesto from Empleados";
            pst = con.createStatement();
            
            rs = pst.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("numemp");
                String nombre = rs.getString("nombre");
                String puesto = rs.getString("puesto");
                System.out.println("NumEmp: " + id + ", Nombre:" + nombre + ", Puesto: " + puesto);
                System.out.println();
            }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage() );
        }
        
    }
    
}
