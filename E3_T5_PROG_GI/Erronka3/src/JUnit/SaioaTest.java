package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.time.LocalDate;
import java.time.LocalTime;

import org.junit.Test;

import Modelo.Areto;
import Modelo.Filma;
import Modelo.Saioa;

public class SaioaTest {

    @Test
    public void testGetOrdua() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, date, filma, aretoa);
        assertEquals(ordua, saioa.getOrdua());
    }

    @Test
    public void testSetOrdua() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(null, date, filma, aretoa);
        saioa.setOrdua(ordua);
        assertEquals(ordua, saioa.getOrdua());
    }

    @Test
    public void testGetDate() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, date, filma, aretoa);
        assertEquals(date, saioa.getDate());
    }

    @Test
    public void testSetDate() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, null, filma, aretoa);
        saioa.setDate(date);
        assertEquals(date, saioa.getDate());
    }

    @Test
    public void testGetFilma() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, date, filma, aretoa);
        assertEquals(filma, saioa.getFilma());
    }

    @Test
    public void testSetFilma() {
        Filma filma1 = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Filma filma2 = new Filma("Beste Izena", 2, 90, "Beste Generoa", 8.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, date, filma1, aretoa);
        saioa.setFilma(filma2);
        assertEquals(filma2, saioa.getFilma());
    }

    @Test
    public void testGetAretoa() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, date, filma, aretoa);
        assertEquals(aretoa, saioa.getAretoa());
    }

    @Test
    public void testSetAretoa() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa1 = new Areto("A1", "Areto Izena");
        Areto aretoa2 = new Areto("A2", "Beste Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, date, filma, aretoa1);
        saioa.setAretoa(aretoa2);
        assertEquals(aretoa2, saioa.getAretoa());
    }

    @Test
    public void testEquals() {
        Filma filma1 = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Filma filma2 = new Filma("Beste Izena", 2, 90, "Beste Generoa", 8.0);
        Areto aretoa1 = new Areto("A1", "Areto Izena");
        Areto aretoa2 = new Areto("A2", "Beste Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa1 = new Saioa(ordua, date, filma1, aretoa1);
        Saioa saioa2 = new Saioa(ordua, date, filma1, aretoa1);
        Saioa saioa3 = new Saioa(ordua, date, filma2, aretoa1);
        Saioa saioa4 = new Saioa(ordua, date, filma1, aretoa2);

        assertEquals(saioa1, saioa2);
        assertNotEquals(saioa1, saioa3);
        assertNotEquals(saioa1, saioa4);
    }

    @Test
    public void testHashCode() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa1 = new Saioa(ordua, date, filma, aretoa);
        Saioa saioa2 = new Saioa(ordua, date, filma, aretoa);

        assertEquals(saioa1.hashCode(), saioa2.hashCode());
    }

    @Test
    public void testToString() {
        Filma filma = new Filma("Izena", 1, 120, "Generoa", 10.0);
        Areto aretoa = new Areto("A1", "Areto Izena");
        LocalTime ordua = LocalTime.of(10, 30);
        LocalDate date = LocalDate.of(2024, 2, 8);
        Saioa saioa = new Saioa(ordua, date, filma, aretoa);
        assertEquals("Saioa [ordua=10:30, date=2024-02-08, filma=" + filma + ", aretoa=" + aretoa + "]", saioa.toString());
    }
}
