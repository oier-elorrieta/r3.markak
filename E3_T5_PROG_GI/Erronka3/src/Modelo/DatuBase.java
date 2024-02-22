package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.BezeroaDAO;

public class DatuBase {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3307/db_elorrietazinemaT5";
            String user = "root";
            String pass = "";

            Connection con = DriverManager.getConnection(url, user, pass);
            

            BezeroaDAO bezeroaDAO = new BezeroaDAO();
            Bezeroa[] bezeroak = bezeroaDAO.getAllBezeroak();

        System.out.println(bezeroak[1]);
        
        con.close();  

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        
    }
}