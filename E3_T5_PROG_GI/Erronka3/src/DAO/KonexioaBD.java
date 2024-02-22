package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KonexioaBD {
    private String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
    private String user = "root";
    private String pass = "";
    private Connection connection;

    public KonexioaBD() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión establecida correctamente.");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
