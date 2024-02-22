package Modelo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

public class Saioa {
    private LocalTime ordua;
    private LocalDate date;
    private Filma filma;
    private Areto aretoa;

    public Saioa(LocalTime ordua, LocalDate date, Filma filma, Areto aretoa) {
        this.ordua = ordua;
        this.date = date;
        this.filma = filma;
        this.aretoa = aretoa;
    }

    public LocalTime getOrdua() {
        return ordua;
    }

    public void setOrdua(LocalTime ordua) {
        this.ordua = ordua;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Filma getFilma() {
        return filma;
    }

    public void setFilma(Filma filma) {
        this.filma = filma;
    }

    public Areto getAretoa() {
        return aretoa;
    }

    public void setAretoa(Areto aretoa) {
        this.aretoa = aretoa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(aretoa, date, filma, ordua);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Saioa other = (Saioa) obj;
        return Objects.equals(aretoa, other.aretoa) && Objects.equals(date, other.date)
                && Objects.equals(filma, other.filma) && Objects.equals(ordua, other.ordua);
    }

    @Override
    public String toString() {
        return "Saioa [ordua=" + ordua + ", date=" + date + ", filma=" + filma + ", aretoa=" + aretoa + "]";
    }
}
