/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12.pkg6;

/***
 * Ejercicio 6
 * 
 * Mostrar el nombre y nota de todos los alumnos y, a posteriori, mostrar al 
 * alumno con la mejor nota y al alumno con la peor nota media. Obtener a los 
 * alumnos con la mejor y peor nota es posible mediante una consulta SQL. Existen
 * distintas soluciones; operador UNION, subconsultas, etc. En lugar de estos 
 * aprovecharemos la consulta que devuelve a todos los alumnos ordenados por su 
 * nota media en orden decreciente, ya que el primer alumno será el que posea la
 * mejor nota y el último el que tenga la nota más baja. Por sencillez, 
 * supondremos que no existen alumnos con notas repetidas.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author pedromiras
 */
public class EJ126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usr = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost:3306/Instituto";
        Connection con;
        Statement st;
        ResultSet rs;

        try {
            // Establecer la conexión con la base de datos
            con = DriverManager.getConnection(url, usr, pswd);
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            // Consulta para obtener todos los alumnos ordenados por nota media en orden decreciente
            String consulta = "SELECT nombre, media FROM alumnos ORDER BY media DESC";
            rs = st.executeQuery(consulta);

            String nombreMax = "";
            String nombreMin = "";
            double notaMax = Double.MIN_VALUE; // Inicializa con el valor más bajo posible
            double notaMin = Double.MAX_VALUE; // Inicializa con el valor más alto posible

            // Mostrar todos los alumnos y obtener el mejor y peor alumno
            System.out.println("Listado de alumnos:");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                double media = rs.getDouble("media");

                // Mostrar el nombre y la nota de cada alumno
                System.out.println(nombre + " - Nota media: " + media);

                // Verificar si es el alumno con la mejor nota
                if (media > notaMax) {
                    nombreMax = nombre;
                    notaMax = media;
                }

                // Verificar si es el alumno con la peor nota
                if (media < notaMin) {
                    nombreMin = nombre;
                    notaMin = media;
                }
            }

            // Mostrar el alumno con la mejor nota
            System.out.println("\nAlumno con mejor nota:");
            System.out.println(nombreMax + " - Nota media: " + notaMax);

            // Mostrar el alumno con la peor nota
            System.out.println("\nAlumno con peor nota:");
            System.out.println(nombreMin + " - Nota media: " + notaMin);

            // Cerrar recursos
            rs.close();
            st.close();
            con.close();

        } catch (SQLException ex) {
            System.out.println("Error al conectar o consultar la base de datos: " + ex.getMessage());
        }
        
    }
    
}
