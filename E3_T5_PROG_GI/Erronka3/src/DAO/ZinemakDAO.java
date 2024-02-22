package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Modelo.Zinema;
import Modelo.Areto;
import Modelo.Saioa;

public class ZinemakDAO {
    private KonexioaBD konexioaBD;
    public Areto[] aretolist;
    public Saioa[] saioalist;

    public ZinemakDAO() {
        konexioaBD = new KonexioaBD();
    }

    public Zinema[] getAllZinemak() {
        Zinema[] zinemaList = null;
        int count = 0;

        try (Connection con = konexioaBD.getConnection()) {
            String countSql = "SELECT COUNT(*) AS total FROM ZINEMA";
            try (PreparedStatement sta = con.prepareStatement(countSql)) {
                try (ResultSet res = sta.executeQuery()) {
                    if (res.next()) {
                        count = res.getInt("total");
                    }
                }
            }

            zinemaList = new Zinema[count];

            String kontsulta = "SELECT * FROM ZINEMA";
            try (PreparedStatement pstmt = con.prepareStatement(kontsulta)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                    	String id_zine = rs.getString("zinema_id");
                        String izena = rs.getString("izena");
                        
                        AretoDAO areto = new AretoDAO();
                        Areto[] aretolist = areto.getAllAretoak();
                        
                        SaioaDAO saioa = new SaioaDAO();
                        Saioa[] saioalist = saioa.getAllSaioak();

                        Zinema zinema = new Zinema(id_zine, izena, null, saioalist, aretolist);

                        zinemaList[index] = zinema;
                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar(); 
        }

        return zinemaList;
    }
}
