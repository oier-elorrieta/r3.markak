package Modelo;

import java.util.Arrays;
import java.util.Objects;

public class Sarrera {
	private int kantitatea;
	Saioa saioa;
	

	public Sarrera(int kantitatea, Saioa saioa) {
		this.kantitatea = kantitatea;
		this.saioa = saioa;
	}

	public int getKantitatea() {
		return kantitatea;
	}

	public void setKantitatea(int kantitatea) {
		this.kantitatea = kantitatea;
	}

	public Saioa getSaioa() {
		return saioa;
	}

	public void setSaioa(Saioa saioa) {
		this.saioa = saioa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(kantitatea, saioa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sarrera other = (Sarrera) obj;
		return kantitatea == other.kantitatea && Objects.equals(saioa, other.saioa);
	}

	@Override
	public String toString() {
		return "Sarrera kantitatea " + kantitatea + ", saioa " + saioa + "";
	}

	

}