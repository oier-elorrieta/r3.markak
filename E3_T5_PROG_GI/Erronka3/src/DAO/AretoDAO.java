package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Areto;

public class AretoDAO {
    private KonexioaBD konexioaBD;

    public AretoDAO() {
        konexioaBD = new KonexioaBD();
    }

    public Areto[] getAllAretoak() {
        Areto[] aretoList = null;
        int count = 0;

        try (Connection con = konexioaBD.getConnection()) {
            String countSql = "SELECT COUNT(*) AS total FROM aretoa";
            try (PreparedStatement sta = con.prepareStatement(countSql)) {
                try (ResultSet res = sta.executeQuery()) {
                    if (res.next()) {
                        count = res.getInt("total");
                    }
                }
            }

            aretoList = new Areto[count];

            String kontsulta = "SELECT * FROM Aretoa";
            try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                    	String id_areto = rs.getString("aretoa_id");
                        String izena = rs.getString("izena");
                        
                        Areto areto = new Areto(id_areto, izena);

                        aretoList[index] = areto;
                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar();         }

        return aretoList;
    }
}
