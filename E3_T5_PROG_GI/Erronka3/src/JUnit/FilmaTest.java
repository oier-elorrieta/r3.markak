package JUnit;

import static org.junit.Assert.*;

import java.util.Objects;

import org.junit.Test;

import Modelo.Filma;

public class FilmaTest {

    @Test
    public void testGetIzena() {
        Filma filmak = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals("Film1", filmak.getIzena());
    }

    @Test
    public void testSetIzena() {
        Filma filmak = new Filma(null, 0, 0, null, 0);
        filmak.setIzena("Film2");
        assertEquals("Film2", filmak.getIzena());
    }

    @Test
    public void testGetId_peli() {
        Filma filmak = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(1, filmak.getId_peli());
    }

    @Test
    public void testSetId_peli() {
        Filma filmak = new Filma(null, 0, 0, null, 0);
        filmak.setId_peli(2);
        assertEquals(2, filmak.getId_peli());
    }

    @Test
    public void testGetIraupena() {
        Filma filmak = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(120, filmak.getIraupena());
    }

    @Test
    public void testSetIraupena() {
        Filma filmak = new Filma(null, 0, 0, null, 0);
        filmak.setIraupena(130);
        assertEquals(130, filmak.getIraupena());
    }

    @Test
    public void testGetGeneroa() {
        Filma filmak = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals("Generoa1", filmak.getGeneroa());
    }

    @Test
    public void testSetGeneroa() {
        Filma filmak = new Filma(null, 0, 0, null, 0);
        filmak.setGeneroa("Generoa2");
        assertEquals("Generoa2", filmak.getGeneroa());
    }

    @Test
    public void testGetPrezioa() {
        Filma filmak = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(10.0, filmak.getPrezioa(), 0.01);
    }

    @Test
    public void testSetPrezioa() {
        Filma filmak = new Filma(null, 0, 0, null, 0);
        filmak.setPrezioa(15.5);
        assertEquals(15.5, filmak.getPrezioa(), 0.01);
    }

    @Test
    public void testEquals() {
        Filma filmak1 = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        Filma filmak2 = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals(filmak1, filmak2);
    }

    @Test
    public void testToString() {
        Filma filmak = new Filma("Film1", 1, 120, "Generoa1", 10.0);
        assertEquals("Pelikula izena Film1, id_peli 1, iraupena 120, generoa Generoa1, prezioa 10.0", filmak.toString());
    }

}
