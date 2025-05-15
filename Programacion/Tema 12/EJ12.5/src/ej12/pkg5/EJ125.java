/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej12.pkg5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/***
* Ejercicio 5
* Modificar el ejercicio 4 para que los alumnos se muestren en orden inverso. 
* Si existiera algún criterio de ordenación en la consulta SQL, se podría 
* modificar para que fuera justo el contrario. Pero en el ejercicio 4 no existe 
* criterio de ordenación alguno, por lo tanto, tendremos que colocar el cursor 
* detrás de la última fila y recorrerlo de abajo arriba (con el método previous())
*/
/**
 *
 * @author pedromiras
 */
public class EJ125 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user = "root";
        String pwd = "";
        Connection con;
        String url = "jdbc:mysql://localhost:3306/Instituto";
        Statement st;
        ResultSet rs;
        try{
            con = DriverManager.getConnection(url,user,pwd);
            System.out.printf("Indique un curso para mostrar los alumnos: ");
            String curso = sc.nextLine();
            String sql = "SELECT nombre, fnac  from alumnos where curso = '" + curso +"'";
            st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery(sql);
            rs.afterLast();
            while(rs.previous()){
                System.out.println("Alumno: " + rs.getString("nombre"));
                System.out.println("Fecha nacimineto: " + rs.getString("fnac"));
                System.out.println();
            }
        }catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
}
