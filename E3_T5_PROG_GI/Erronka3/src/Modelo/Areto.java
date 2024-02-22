package Modelo;

import java.util.Objects;

public class Areto {
	private String id_areto;
	private String izena;

	public Areto(String i, String izena) {
		this.id_areto = i;
		this.izena = izena;
	}

	public String getId_areto() {
		return id_areto;
	}

	public void setId_areto(String id_areto) {
		this.id_areto = id_areto;
	}

	public String getIzena() {
		return izena;
	}

	public void setIzena(String izena) {
		this.izena = izena;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_areto, izena);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Areto other = (Areto) obj;
		return id_areto == other.id_areto && Objects.equals(izena, other.izena);
	}

	@Override
	public String toString() {
		return "Areto id_areto " + id_areto + ", izena " + izena + "";
	}

}
