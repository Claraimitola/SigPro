package database;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author migopa
 */
public class Cconnetion {

    public static void main(String[] args) {
        Cconnetion cConexion = new Cconnetion();
        Connection cx = cConexion.conecarDB();
    }

    Connection cx = null;

    String user = "root";
    String password = "1043999547";
    String bd = "sigprocoredb";
    String ip = "localhost";
    String puerto = "3306";
    String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd;

    public Cconnetion() {

    }

    public Connection conecarDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cx = DriverManager.getConnection(cadena, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logro conectar con la base de datos, error: " + e.toString());
        }

        return cx;
    }
}