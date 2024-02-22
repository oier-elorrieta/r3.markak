package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

import JUnit.ZinemaTest;
import Modelo.Saioa;
import Modelo.Zinema;
import Vista.Filmak;
import Vista.Saioak;
import Modelo.Areto;
import Modelo.Filma;

public class SaioaDAO {
    private KonexioaBD konexioaBD;

    public SaioaDAO() {
        konexioaBD = new KonexioaBD();
    }

    public Saioa[] getAllSaioak() {
        Saioa[] saioaList = null;
        int count = 0;

        try (Connection con = konexioaBD.getConnection()) {
            String countSql = "SELECT COUNT(*) AS total FROM SAIOA";
            try (PreparedStatement countPstmt = con.prepareStatement(countSql)) {
                try (ResultSet countRs = countPstmt.executeQuery()) {
                    if (countRs.next()) {
                        count = countRs.getInt("total");
                    }
                }
            }

            saioaList = new Saioa[count];

            String sql = "SELECT * FROM SAIOA";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    int index = 0;
                    while (rs.next()) {
                    	LocalTime ordua = rs.getTime("ordutegia").toLocalTime();
                        LocalDate date = rs.getDate("eguna").toLocalDate();
                        int filmaId = rs.getInt("filma_id"); 
                        String aretoId = rs.getString("aretoa_id"); 
                        Filma filma = getFilmaById(filmaId, con);
                        Areto areto = getAretoById(aretoId, con); 

                        Saioa saioa = new Saioa(ordua, date, filma, areto);
                        saioaList[index] = saioa;
                        index++;
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar(); 
            }

        return saioaList;
    }

    private Filma getFilmaById(int id, Connection con) {      
    	Filma filma = null;
        String sql = "SELECT * FROM FILMA WHERE filma_id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    String izena = rs.getString("izena");
                    int id_peli = rs.getInt("filma_id"); 
                    int iraupena = rs.getInt("iraupena");
                    String generoa = rs.getString("generoa");
                    double prezioa = rs.getDouble("prezioa");

                    filma = new Filma(izena, id_peli, iraupena, generoa, prezioa);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filma;
    }

    private Areto getAretoById(String aretoId, Connection con) {
        Areto areto = null;
        String sql = "SELECT * FROM ARETOA WHERE aretoa_id = ?";
        try (PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, aretoId);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                	String areto_id = rs.getString("aretoa_id");
                    String izena = rs.getString("izena");

                    areto = new Areto(areto_id, izena);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return areto;
    }
   
}
