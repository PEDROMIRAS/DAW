/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author pedromiras
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuario_ddbb = "root";
        String password_bbdd = "";
        String url = "jdbc:mysql://localhost:3306/test";
        Connection connection;
        Statement st = null;
        try {
            // Paso 1: Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Paso 2: Establecer la conexión
            connection = DriverManager.getConnection(url, usuario_ddbb, password_bbdd);
            if (connection != null) {
                st = connection.createStatement();
                System.out.println(" Conexion a la base de datos correcta. ");
                
            } else {
                System.out.println(" Conexion fallida. ");
            }
        } catch (SQLException e) {
            System.out.println(" Error de conexión. "+ e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(" Error al cargar el controlador. "+
            e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
