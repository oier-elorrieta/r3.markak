package Modelo;

import java.util.Objects;

public class Filma {
	private String izena;
	private int id_peli;
	private int iraupena;
	private String generoa;
	private double prezioa;

	public Filma(String izena, int id_peli, int iraupena, String generoa, double prezioa) {

		this.izena = izena;
		this.id_peli = id_peli;
		this.iraupena = iraupena;
		this.generoa = generoa;
		this.prezioa = prezioa;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	public int getId_peli() {
		return id_peli;
	}

	public void setId_peli(int id_peli) {
		this.id_peli = id_peli;
	}

	public int getIraupena() {
		return iraupena;
	}

	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}

	public String getGeneroa() {
		return generoa;
	}

	public void setGeneroa(String generoa) {
		this.generoa = generoa;
	}

	public double getPrezioa() {
		return prezioa;
	}

	public void setPrezioa(double prezioa) {
		this.prezioa = prezioa;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Filma other = (Filma) obj;
		return Objects.equals(generoa, other.generoa) && id_peli == other.id_peli && iraupena == other.iraupena
				&& Objects.equals(izena, other.izena)
				&& Double.doubleToLongBits(prezioa) == Double.doubleToLongBits(other.prezioa);
	}

	@Override
	public String toString() {
		return "Pelikula izena " + izena + ", id_peli " + id_peli + ", iraupena " + iraupena + ", generoa " + generoa
				+ ", prezioa " + prezioa + "";
	}

}
