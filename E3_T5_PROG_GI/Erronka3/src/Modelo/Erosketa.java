package Modelo;

import java.util.Arrays;

public class Erosketa {
	
	
	Bezeroa bezeroa;
	Sarrera[] SarreraList;
	private int diruTotala;
	private int id_erosketa;

	public Erosketa(int diruTotala, Sarrera[] sarreraList, int id_erosketak) {
		this.diruTotala = diruTotala;
		SarreraList = sarreraList;
		this.id_erosketa = id_erosketak;
	}

	public Erosketa() {
		
	}

	public int getDiruTotala() {
		return diruTotala;
	}

	public void setDiruTotala(int diruTotala) {
		this.diruTotala = diruTotala;
	}

	public Sarrera[] getSarreraList() {
		return SarreraList;
	}

	public void setSarreraList(Sarrera[] sarreraList) {
		SarreraList = sarreraList;
	}

	public int getId_erosketak() {
		return id_erosketa;
	}

	public void setId_erosketak(int id_erosketak) {
		this.id_erosketa = id_erosketak;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Erosketa other = (Erosketa) obj;
		return Arrays.equals(SarreraList, other.SarreraList) && diruTotala == other.diruTotala
				&& id_erosketa == other.id_erosketa;
	}

	@Override
	public String toString() {
		return "Erosketak diruTotala " + diruTotala + ", SarreraList " + Arrays.toString(SarreraList)
				+ ", id_erosketak " + id_erosketa + "";
	}

}
