package JUnit;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Modelo.Erosketa;
import Modelo.Sarrera;

public class ErosketaTest {

    @Test
    public void testGetDiruTotala() {
        Erosketa erosketa = new Erosketa(100, null, 1);
        assertEquals(100, erosketa.getDiruTotala());
    }

    @Test
    public void testSetDiruTotala() {
        Erosketa erosketa = new Erosketa();
        erosketa.setDiruTotala(200);
        assertEquals(200, erosketa.getDiruTotala());
    }

    @Test
    public void testGetSarreraList() {
        Sarrera[] sarreraList = {new Sarrera(1, null)};
        Erosketa erosketa = new Erosketa(100, sarreraList, 1);
        assertArrayEquals(sarreraList, erosketa.getSarreraList());
    }

    @Test
    public void testSetSarreraList() {
        Sarrera[] sarreraList = {new Sarrera(1, null)};
        Erosketa erosketa = new Erosketa();
        erosketa.setSarreraList(sarreraList);
        assertArrayEquals(sarreraList, erosketa.getSarreraList());
    }

    @Test
    public void testGetId_erosketak() {
        Erosketa erosketa = new Erosketa(100, null, 1);
        assertEquals(1, erosketa.getId_erosketak());
    }

    @Test
    public void testSetId_erosketak() {
        Erosketa erosketa = new Erosketa();
        erosketa.setId_erosketak(2);
        assertEquals(2, erosketa.getId_erosketak());
    }

    @Test
    public void testEquals() {
        Sarrera[] sarreraList1 = {new Sarrera(1, null)};
        Sarrera[] sarreraList2 = {new Sarrera(1, null)};
        Erosketa erosketa1 = new Erosketa(100, sarreraList1, 1);
        Erosketa erosketa2 = new Erosketa(100, sarreraList2, 1);
        assertEquals(erosketa1, erosketa2);
    }


      	@Test
        public void testToString() {
            Sarrera[] sarreraList = {new Sarrera(1, null)};
            Erosketa erosketa = new Erosketa(100, sarreraList, 1);
            assertEquals("Erosketak diruTotala 100, SarreraList , id_erosketak 1", erosketa.toString());
        }
    }

