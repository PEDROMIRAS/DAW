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
 * Ejercicio 1
 * Crea un programa que muestre todos los empleados.
 */

/**
 *
 * @author pedromiras
 */
public class EJ1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Credenciales y URL de conexion
        String usr = "root";           // Usuario de MySQL
        String pswd = "";             // Contraseña del usuario
        String url  = "jdbc:mysql://localhost:3306/Empresa"; // BD Empresa

        // Objetos JDBC
        Connection con;  // Maneja la conexion
        Statement  st;   // Envia sentencias SQL
        ResultSet  rs;   // Almacena los resultados de la consulta
        
        try {
            // 1. Conexion a la base de datos
            con = DriverManager.getConnection(url, usr, pswd);

            // 2. Consulta SQL para obtener numero, nombre y puesto
            String sql = "SELECT numemp, nombre, puesto FROM Empleados";
            st = con.createStatement();

            // 3. Ejecutar la consulta y recibir el ResultSet
            rs = st.executeQuery(sql);

            // 4. Recorrer los registros y mostrarlos
            while (rs.next()) {
                int id = rs.getInt("numemp"); // Numero de empleado
                String nombre = rs.getString("nombre"); // Nombre del empleado
                String puesto = rs.getString("puesto"); // Puesto del empleado

                System.out.println("NumEmp: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto);
                System.out.println();
            }

            // Cierre de recursos 
            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            // Manejo de errores SQL
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
