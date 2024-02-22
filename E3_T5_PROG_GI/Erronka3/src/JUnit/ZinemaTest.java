package JUnit;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import Modelo.Areto;
import Modelo.Saioa;
import Modelo.Zinema;

public class ZinemaTest {
	  @Test
	    public void testGetSaioalistArray() {
	        Saioa[] saioaList = new Saioa[5];
	        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", saioaList, null);
	        assertArrayEquals(saioaList, zinema.getSaioalistArray());
	    }

	    @Test
	    public void testSetSaioalistArray() {
	        Saioa[] saioaList = new Saioa[5];
	        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
	        zinema.setSaioalistArray(saioaList);
	        assertArrayEquals(saioaList, zinema.getSaioalistArray());
	    }

	    @Test
	    public void testGetAretolistarray() {
	        Areto[] aretoList = new Areto[5];
	        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, aretoList);
	        assertArrayEquals(aretoList, zinema.getAretolistarray());
	    }

	    @Test
	    public void testSetAretolistarray() {
	        Areto[] aretoList = new Areto[5];
	        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
	        zinema.setAretolistarray(aretoList);
	        assertArrayEquals(aretoList, zinema.getAretolistarray());
	    }
    @Test
    public void testGetId_zine() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        assertEquals(1, zinema.getId_zine());
    }

    @Test
    public void testSetId_zine() {
        Zinema zinema = new Zinema("Z2", "Zinemaldia", "Bilbao", null, null);
        zinema.setId_zine("Z2");
        assertEquals(2, zinema.getId_zine());
    }

    @Test
    public void testGetIzena() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        assertEquals("Zinemaldia", zinema.getIzena());
    }

    @Test
    public void testSetIzena() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        zinema.setIzena("Zinefest");
        assertEquals("Zinefest", zinema.getIzena());
    }

    @Test
    public void testGetHelbidea() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        assertEquals("Bilbao", zinema.getHelbidea());
    }

    @Test
    public void testSetHelbidea() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        zinema.setHelbidea("Donostia");
        assertEquals("Donostia", zinema.getHelbidea());
    }

    @Test
    public void testEquals() {
        Zinema zinema1 = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        Zinema zinema2 = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);

        assertTrue(zinema1.equals(zinema2));
    }

    @Test
    public void testNotEquals() {
        Zinema zinema1 = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);
        Zinema zinema2 = new Zinema("Z1", "Zinefest", "Donostia", null, null);

        assertFalse(zinema1.equals(zinema2));
    }

    @Test
    public void testToString() {
        Zinema zinema = new Zinema("Z1", "Zinemaldia", "Bilbao", null, null);

        String expectedToString = "Zinema id_zine 1, izena Zinemaldia, helbidea Bilbao, Saioalist null, Aretolist null";
        assertEquals(expectedToString, zinema.toString());
    }
}
