package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Modelo.Filma;

public class FilmaDAO {
    private KonexioaBD konexioaBD;

    public FilmaDAO() {
        konexioaBD = new KonexioaBD();
    }

    public List<Filma> getAllFilmak() {
        List<Filma> filmak = new ArrayList<>();

        try (Connection con = konexioaBD.getConnection()) {
            String sql = "SELECT * FROM FILMA";
            try (PreparedStatement pstmt = con.prepareStatement(sql)) {
                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        String izena = rs.getString("izena");
                        int id_peli = rs.getInt("filma_id");
                        int iraupena = rs.getInt("iraupena");
                        String generoa = rs.getString("generoa");
                        double prezioa = rs.getDouble("prezioa");

                        Filma filma = new Filma(izena, id_peli, iraupena, generoa, prezioa);
                        filmak.add(filma);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            konexioaBD.desconectar();
        }

        return filmak;
    }
}
