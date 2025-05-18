package ej12.pkg8;

/***
 * Ejercicio 8
 * Muestra dos informes ordenados ascendentemente por nota:
 *   1. Alumnos con nota "Bien"  ??6 y <?7
 *   2. Alumnos con nota "Notable" ??7 y <?9
 * Se reutiliza la misma consulta parametrizada cambiando los rangos.
 */
import java.sql.*;

public class EJ128 {
    // Consulta parametrizada: límites inferior y superior
    private static final String SQL =
        "SELECT nombre, media " +
        "FROM alumnos " +
        "WHERE media >= ? AND media < ? " +
        "ORDER BY media"; // ascendente

    public static void main(String[] args) {
        String usr = "root";
        String pswd = "";
        String url  = "jdbc:mysql://localhost:3306/Instituto";

        // Rangos y etiquetas
        double[][] rangos   = { {6, 7}, {7, 9} };
        String[]   etiquetas = { "Bien", "Notable" };

        try (Connection con = DriverManager.getConnection(url, usr, pswd);
             PreparedStatement pst = con.prepareStatement(SQL)) {

            for (int i = 0; i < rangos.length; i++) {
                double min = rangos[i][0];
                double max = rangos[i][1];

                pst.setDouble(1, min);
                pst.setDouble(2, max);

                try (ResultSet rs = pst.executeQuery()) {
                    System.out.println("\n----Alumnos " + etiquetas[i] + " (" + min + " - " + max + ")----");
                    while (rs.next()) {
                        String nombre = rs.getString("nombre");
                        double nota   = rs.getDouble("media");
                        System.out.printf(nombre + "  " + nota);
                        System.out.println("");
                    }
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
