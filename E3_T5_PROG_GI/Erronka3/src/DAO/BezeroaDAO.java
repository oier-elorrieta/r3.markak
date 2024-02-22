package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Bezeroa;

public class BezeroaDAO {
    private KonexioaBD konexioaBD;

    public BezeroaDAO() {
        konexioaBD = new KonexioaBD();
    }

    public Bezeroa[] getAllBezeroak() {
        Bezeroa[] bezeroList = null;
        int count = 0;

        try (Connection con = konexioaBD.getConnection()) {
            String countSql = "SELECT COUNT(*) AS total FROM BEZEROA";
            try (PreparedStatement countPstmt = con.prepareStatement(countSql)) {
                try (ResultSet countRs = countPstmt.executeQuery()) {
                    if (countRs.next()) {
                        count = countRs.getInt("total");
                    }
                }
            }

            bezeroList = new Bezeroa[count];

            String sql = "SELECT * FROM BEZEROA";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {

                        String izena = rs.getString("izena");
                        String abizena = rs.getString("abizena");
                        String nan = rs.getString("NAN");
                        String sexua = rs.getString("Generoa");
                        String erabiltzailea = rs.getString("erabiltzailea");
                        String pasahitza = rs.getString("pasahitza");

                        Bezeroa bezeroa = new Bezeroa(izena, abizena, nan, sexua, pasahitza, erabiltzailea);
                        bezeroList[index] = bezeroa;
                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar();         }

        return bezeroList;
    }
}
