package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private static String host = "jdbc:msql://localhos:3306/arenadeobjetos";
    private static String user = "root";
    private static String pass = "";

    public static Connection getConnection() throws SQLException {
        Connection c = null;
        try{
            c = DriverManager.getConnection(host, user, pass);
        } catch (SQLException e) {
            throw new SQLException("Erro ao conectar!\n" + e.getMessage());
        }
        return c;
    }

}
