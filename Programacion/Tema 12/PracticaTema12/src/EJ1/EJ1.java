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
 * Muestra todos los empleados registrados en la base de datos Empresa.
 * 
 * Pasos principales:
 * 1. Establecer conexión con la BD.
 * 2. Ejecutar consulta SQL SELECT.
 * 3. Recorrer el ResultSet y mostrar los datos.
 * 4. Manejar excepciones SQL.
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
        // Credenciales y URL de conexión
        String usr = "root";           // Usuario de MySQL
        String pswd = "";             // Contraseña del usuario
        String url  = "jdbc:mysql://localhost:3306/Empresa"; // BD Empresa

        // Objetos JDBC
        Connection con;   // Maneja la conexión
        Statement  st;   // Envía sentencias SQL
        ResultSet  rs;    // Almacena los resultados de la consulta
        
        try {
            // 1. Conexión a la base de datos
            con = DriverManager.getConnection(url, usr, pswd);

            // 2. Consulta SQL para obtener número, nombre y puesto
            String sql = "SELECT numemp, nombre, puesto FROM Empleados";
            st = con.createStatement();

            // 3. Ejecutar la consulta y recibir el ResultSet
            rs = st.executeQuery(sql);

            // 4. Recorrer los registros y mostrarlos
            while (rs.next()) {
                int    id     = rs.getInt("numemp");   // Número de empleado
                String nombre = rs.getString("nombre"); // Nombre del empleado
                String puesto = rs.getString("puesto"); // Puesto del empleado

                System.out.println("NumEmp: " + id + ", Nombre: " + nombre + ", Puesto: " + puesto);
                System.out.println();
            }

            // Cierre explícito de recursos (buena práctica)
            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            // Manejo de errores SQL
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
