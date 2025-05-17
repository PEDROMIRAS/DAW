package EJ4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Scanner;

/**
 * Ejercicio 4
 * Programa para modificar la ciudad y las ventas de una oficina. 
 * Los nuevos valores se introducen por teclado.
 */

/**
 *
 * @author pedromiras
 */
public class EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Credenciales de conexion y URL de la base de datos
        String usr = "root";
        String pswd = "";
        String url = "jdbc:mysql://localhost:3306/Empresa";

        // Objetos necesarios
        Connection con;
        PreparedStatement pst;
        Scanner sc = new Scanner(System.in);

        try {
            // 1. Establecer conexion con la base de datos
            con = DriverManager.getConnection(url, usr, pswd);

            // 2. Consulta SQL para actualizar ciudad y ventas de una oficina
            String sql = "UPDATE Oficinas SET ciudad = ?, ventas = ? WHERE oficina = ?";
            pst = con.prepareStatement(sql);

            // 3. Solicitar datos al usuario
            System.out.print("Introduce la nueva ciudad: ");
            String ciudad = sc.nextLine();

            System.out.print("Introduce las ventas nuevas: ");
            double ventas = sc.nextDouble();

            System.out.print("Introduce la oficina a modificar: ");
            int oficina = sc.nextInt();

            // 4. Asignar parametros a la consulta preparada
            pst.setString(1, ciudad);
            pst.setDouble(2, ventas);
            pst.setInt(3, oficina);

            // 5. Ejecutar la actualizacion
            pst.executeUpdate();

            // 6. Confirmacion por consola
            System.out.println("Tabla actualizada...");

            // Cierre de recursos
            pst.close();
            con.close();

        } catch (SQLException ex) {
            // Manejo de errores
            System.out.println("Error: " + ex.getLocalizedMessage());
        }

        // Cierre del escaner
        sc.close();
    }

}
