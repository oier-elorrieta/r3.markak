
package Modelo;

import java.util.Objects;

public class Bezeroa {
	private String izena;
	private String abizena;
	private String nan;
	private String sexua;
	private String pasahitza;
	private String Erabiltzailea;

	public Bezeroa(String izena, String abizena, String nan, String sexua, String pasahitza, String Erabiltzailea) {
		this.izena = izena;
		this.abizena = abizena;
		this.nan = nan;
		this.sexua = sexua;
		this.pasahitza = pasahitza;
		this.Erabiltzailea = Erabiltzailea;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public String getAbizena() {
		return abizena;
	}

	public void setAbizena(String abizena) {
		this.abizena = abizena;
	}

	public String getNan() {
		return nan;
	}

	public void setNan(String nan) {
		this.nan = nan;
	}

	public String getSexua() {
		return sexua;
	}

	public void setSexua(String sexua) {
		this.sexua = sexua;
	}
	
	public String getErabiltzailea () {
		return Erabiltzailea;
	}
	
	public void setErabiltzailea (String Erabiltzailea) {
		this.Erabiltzailea = Erabiltzailea;
	}

	public String getPasahitza() {
		return pasahitza;
	}

	public void setPasahitza(String pasahitza) {
		this.pasahitza = pasahitza;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Erabiltzailea, abizena, izena, nan, pasahitza, sexua);
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bezeroa other = (Bezeroa) obj;
		return Objects.equals(Erabiltzailea, other.Erabiltzailea) && Objects.equals(abizena, other.abizena)
				&& Objects.equals(izena, other.izena) && Objects.equals(nan, other.nan)
				&& Objects.equals(pasahitza, other.pasahitza) && sexua == other.sexua;
	}
	
	@Override
	public String toString() {
		return "Bezeroa izena " + izena + ", abizena " + abizena + ", nan " + nan + ", sexua " + sexua + ", pasahitza "
				+ pasahitza + ", Erabiltzailea " + Erabiltzailea + " ";
	}


}
