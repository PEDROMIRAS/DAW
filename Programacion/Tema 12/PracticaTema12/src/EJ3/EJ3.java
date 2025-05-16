/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author pedromiras
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String usr = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost:3306/Empresa";
        Connection con;
        PreparedStatement pst;
        Scanner sc = new Scanner(System.in);
        
        try{
            con = DriverManager.getConnection(url, usr, pswd);
            String sql = "insert into empleados(numemp, nombre, edad, oficina, puesto, contrato) values(?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);
             
            System.out.printf("Introduce num emp: ");
            int id = sc.nextInt();
            pst.setInt(1, id);
            sc.nextLine();
            System.out.printf("Introduce nombre: ");
            String nombre = sc.nextLine();
            pst.setString(2, nombre);
            
            System.out.printf("Introduce edad: ");
            int edad = sc.nextInt();
            pst.setInt(3, edad);
            
            System.out.printf("Introduce oficina: ");
            int oficina = sc.nextInt();
            pst.setInt(4, oficina);
            sc.nextLine();
            System.out.printf("Introduce puesto: ");
            String puesto = sc.nextLine();
            pst.setString(5, puesto);
           
            pst.setDate(6, Date.valueOf(LocalDate.now()));
            
            pst.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage() );
        }
    }
    
}
