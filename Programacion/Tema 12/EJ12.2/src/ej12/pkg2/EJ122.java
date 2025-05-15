/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12.pkg2;
/***
 * Ejercicio 2
 * Realizar una aplicacion que solicite todos los datos de un nuevo alumno 
 * y los inserte en la base de datos.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/**
 *
 * @author pedromiras
 */
public class EJ122 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "root";
        String password = ""; // asegúrate de que esta sea tu contraseña real
        Connection con;
        String url = "jdbc:mysql://localhost:3306/Instituto";
        Statement st;
        
        try{
            con = DriverManager.getConnection(url,user,password);
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Fecha de nacimiento (YYYY-MM-DD): ");
            String fnac = sc.nextLine();

            System.out.print("Nota media: ");
            double media = sc.nextDouble();

            sc.nextLine(); // limpiar buffer

            System.out.print("Curso: ");
            String curso = sc.nextLine();

            String sql = "INSERT INTO Alumnos (nombre, fnac, media, curso) "
                + "VALUES ('"+nombre+"','"+fnac+"',"+media+",'"+curso+"')";
            st = con.createStatement();
            st.executeUpdate(sql);
            con.close();
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
    }
    
}
