/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexionbd;

/**
 *
 * @author meschoyez
 */

import java.sql.*;

public class ConexionBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            // Objeto que maneja la conexion con el servidor BD
            //  - Requiere .jar en Libraries -
            //Connection con = DriverManager.getConnection("jdbc:mysql://192.168.122.115:3306/prueba111mil","111mil","111mil");
            Connection con = DriverManager.getConnection("jdbc:mysql://192.168.122.115:3306/euro2012","111mil","111mil");
            // Objeto que maneja las consultas SQL
            Statement stmt = con.createStatement();
            
            // executeUpdate() permite las consultas para modificar la BD
            //stmt.executeUpdate("CREATE TABLE razas (id INT unsigned NOT NULL AUTO_INCREMENT, nombre VARCHAR(150) NOT NULL, raza VARCHAR(150) NOT NULL, PRIMARY KEY (id))");
            //stmt.executeUpdate("INSERT INTO razas (nombre, raza) VALUES ('Chatran','gato chino'), ('Mickey','raton'), ('Benji','Callejero') , ('Lassie', 'Collie')");

            // executeQuery() permite las consultas de informacion en la BD
            //ResultSet rs = stmt.executeQuery("SELECT nombre, raza FROM razas");
            ResultSet rs = stmt.executeQuery("SELECT matchid, player FROM goal WHERE teamid = 'GER'");
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t" + rs.getString(2));
            }
            // Cierre de la conexion
            con.close();
        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}
