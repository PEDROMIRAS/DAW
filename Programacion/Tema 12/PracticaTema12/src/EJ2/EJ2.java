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
 * Ejercicio 2 
 * Muestra un listado con el nombre y la edad de los empleados cuya edad se 
 * encuentra comprendida entre un valor máximo y un valor mínimo, introducidos 
 * por el usuario.
 */

/**
 *
 * @author pedromiras
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Credenciales y URL de conexión a MySQL
        String usr = "root";
        String pswd = "";
        String url  = "jdbc:mysql://localhost:3306/Empresa";

        // Objetos JDBC
        Connection con; // Conexion a la BD
        PreparedStatement pst; // Sentencia preparada
        ResultSet rs;  // Resultado de la consulta

        // Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);
        
        try {
            // 1. Conexion a la base de datos
            con = DriverManager.getConnection(url, usr, pswd);

            // 2. Consulta parametrizada (evita inyeccion SQL)
            String sql = "SELECT nombre, edad FROM Empleados WHERE edad BETWEEN ? AND ?";
            pst = con.prepareStatement(sql);
            
            // 3. Pedir al usuario los limites de edad
            System.out.print("Introduce la edad minima: ");
            int edadMin = sc.nextInt();
            System.out.print("Introduce la edad maxima: ");
            int edadMax = sc.nextInt();

            // 4. Sustituir parametros en la consulta
            pst.setInt(1, edadMin);
            pst.setInt(2, edadMax);
            
            // 5. Ejecutar la consulta
            rs = pst.executeQuery();
            
            // 6. Recorrer y mostrar resultados
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                int edad = rs.getInt("edad");
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }

            // Cierre de recursos
            rs.close();
            pst.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        // Cerrar el scanner
        sc.close();
    }
}
