/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJ4;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;
/**
 *
 * @author pedromiras
 */
public class EJ4 {

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
            String sql = "update Oficinas set ciudad = ?, ventas = ? where oficina = ?";
            pst = con.prepareStatement(sql);
            System.out.printf("Introduce la nueva ciudad:");
            String ciudad = sc.nextLine();
            System.out.printf("Introduce las ventas nuevas: ");
            double ventas = sc.nextDouble();
            System.out.printf("Introduce la oficina a modificar: ");
            int oficina = sc.nextInt();
            
            pst.setString(1, ciudad);
            pst.setDouble(2, ventas);
            pst.setInt(3, oficina);
            
            pst.executeUpdate();
            
            System.out.println("Tabla actualizada...");
            
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getLocalizedMessage());
        }
            
    }
    
}
