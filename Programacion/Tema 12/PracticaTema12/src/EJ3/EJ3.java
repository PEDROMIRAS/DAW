package EJ3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * Ejercicio 3
 * Inserta un nuevo empleado en la base de datos. Todos los datos se solicitan
 * al usuario excepto la fecha de contratación, que se asigna automáticamente 
 * con la fecha actual.
 */

/**
 *
 * @author pedromiras
 */
public class EJ3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Credenciales de conexion y URL de la base de datos
        String usr = "root";
        String pswd = "";
        String url  = "jdbc:mysql://localhost:3306/Empresa";

        // Objetos necesarios
        Connection con;
        PreparedStatement pst;
        Scanner sc = new Scanner(System.in);

        try {
            // 1. Establecer conexion con la base de datos
            con = DriverManager.getConnection(url, usr, pswd);

            // 2. Consulta SQL con parametros para insertar un nuevo empleado
            String sql = "INSERT INTO empleados(numemp, nombre, edad, oficina, puesto, contrato) VALUES (?, ?, ?, ?, ?, ?)";
            pst = con.prepareStatement(sql);

            // 3. Solicitar y establecer valores de los parametros
            System.out.print("Introduce num emp: ");
            int id = sc.nextInt();
            pst.setInt(1, id);
            sc.nextLine(); // Limpiar buffer

            System.out.print("Introduce nombre: ");
            String nombre = sc.nextLine();
            pst.setString(2, nombre);

            System.out.print("Introduce edad: ");
            int edad = sc.nextInt();
            pst.setInt(3, edad);

            System.out.print("Introduce oficina: ");
            int oficina = sc.nextInt();
            pst.setInt(4, oficina);
            sc.nextLine(); // Limpiar buffer

            System.out.print("Introduce puesto: ");
            String puesto = sc.nextLine();
            pst.setString(5, puesto);

            // 4. Fecha actual como fecha de contratacion
            pst.setDate(6, Date.valueOf(LocalDate.now()));

            // 5. Ejecutar la insercion
            pst.executeUpdate();

            // Cierre de recursos
            pst.close();
            con.close();

        } catch (SQLException ex) {
            // Manejo de errores
            System.out.println("Error: " + ex.getMessage());
        }

        // Cierre del escaner
        sc.close();
    }

}
