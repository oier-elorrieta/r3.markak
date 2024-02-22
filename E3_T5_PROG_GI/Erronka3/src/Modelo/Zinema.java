package Modelo;

import java.time.LocalDate;
import java.util.Arrays;

public class Zinema {
    private String id_zine;
    private String izena;
    private String helbidea;
    private Saioa[] saioalist;
    private Areto[] aretolist;

    public Zinema(String id_zine, String izena, String helbidea, Saioa[] saioalist, Areto[] aretolist) {
        this.id_zine = id_zine;
        this.izena = izena;
        this.helbidea = helbidea;
        this.saioalist = saioalist;
        this.aretolist = aretolist;
    }

    public String getId_zine() {
        return id_zine;
    }

    public void setId_zine(String id_zine) {
        this.id_zine = id_zine;
    }

    public String getIzena() {
        return izena;
    }

    public void setIzena(String izena) {
        this.izena = izena;
    }

    public String getHelbidea() {
        return helbidea;
    }

    public void setHelbidea(String helbidea) {
        this.helbidea = helbidea;
    }

    public Saioa[] getSaioalistArray() {
        return saioalist;
    }

    public void setSaioalistArray(Saioa[] saioalist) {
        this.saioalist = saioalist;
    }

    public Areto[] getAretolistarray() {
        return aretolist;
    }

    public void setAretolistarray(Areto[] aretolist) {
        this.aretolist = aretolist;
    }

    public String[] getClosestMovies(Saioa[] saioak) {
        LocalDate today = LocalDate.now();
        int numClosestMovies = 0;

        // Contar el número de películas más cercanas al día actual
        for (Saioa saioa : saioak) {
            if (saioa.getDate().isAfter(today)) {
                numClosestMovies++;
            }
        }

        // Crear un array para almacenar las películas más cercanas
        String[] closestMovies = new String[numClosestMovies];
        int index = 0;

        // Iterar sobre las sesiones del cine y añadir las películas más cercanas al día actual
        for (Saioa saioa : saioak) {
            if (saioa.getDate().isAfter(today)) {
                closestMovies[index] = saioa.getFilma().getIzena();
                index++;
            }
        }

        return closestMovies;
    }

	@Override
	public String toString() {
		return "Zinema [id_zine=" + id_zine + ", izena=" + izena + ", helbidea=" + helbidea + ", saioalist="
				+ Arrays.toString(saioalist) + ", aretolist=" + Arrays.toString(aretolist) + "]";
	}

}
