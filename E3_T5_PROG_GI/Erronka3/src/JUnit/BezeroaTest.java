package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Bezeroa;

public class BezeroaTest {

    @Test
    public void testGetIzena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertEquals("Izena", bezeroa.getIzena());
    }

    @Test
    public void testSetIzena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password","erabiltzailea1");
        bezeroa.setIzena("Izena2");
        assertEquals("Izena2", bezeroa.getIzena());
    }

    @Test
    public void testGetAbizena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertEquals("Abizena", bezeroa.getAbizena());
    }

    @Test
    public void testSetAbizena() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        bezeroa.setAbizena("Abizena2");
        assertEquals("Abizena2", bezeroa.getAbizena());
    }

    @Test
    public void testGetNan() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertEquals("12345678A", bezeroa.getNan());
    }

    @Test
    public void testSetNan() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        bezeroa.setNan("87654321B");
        assertEquals("87654321B", bezeroa.getNan());
    }

    @Test
    public void testGetSexua() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertEquals("Gizona", bezeroa.getSexua());
    }

    @Test
    public void testSetSexua() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        bezeroa.setSexua("Emakumea");
        assertEquals("Emakumea", bezeroa.getSexua());
    }

    @Test
    public void testGetPasahitza() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertEquals("password", bezeroa.getPasahitza());
    }

    @Test
    public void testSetPasahitza() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        bezeroa.setPasahitza("newpassword");
        assertEquals("newpassword", bezeroa.getPasahitza());
    }

    @Test
    public void testEquals() {
        Bezeroa bezeroa1 = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        Bezeroa bezeroa2 = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertTrue(bezeroa1.equals(bezeroa2));
    }

    @Test
    public void testHashCode() {
        Bezeroa bezeroa1 = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        Bezeroa bezeroa2 = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertEquals(bezeroa1.hashCode(), bezeroa2.hashCode());
    }

    @Test
    public void testToString() {
        Bezeroa bezeroa = new Bezeroa("Izena", "Abizena", "12345678A", "Gizona", "password", "erabiltzailea1");
        assertEquals("Bezeroa izena Izena, abizena Abizena, nan 12345678A, sexua Gizona, pasahitza password, Erabiltzailea erabiltzailea1 ", bezeroa.toString());
    }
}
