package JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import Modelo.Saioa;
import Modelo.Sarrera;

public class SarreraTest {

    @Test
    public void testGetKantitatea() {
        Saioa saioa = new Saioa(null, null, null, null);
        Sarrera sarrera = new Sarrera(5, saioa);
        assertEquals(5, sarrera.getKantitatea());
    }

    @Test
    public void testSetKantitatea() {
        Saioa saioa = new Saioa(null, null, null, null);
        Sarrera sarrera = new Sarrera(0, saioa);
        sarrera.setKantitatea(10);
        assertEquals(10, sarrera.getKantitatea());
    }

    @Test
    public void testGetSaioa() {
        Saioa saioa = new Saioa(null, null, null, null);
        Sarrera sarrera = new Sarrera(0, saioa);
        assertEquals(saioa, sarrera.getSaioa());
    }

    @Test
    public void testSetSaioa() {
        Saioa saioa1 = new Saioa(null, null, null, null);
        Saioa saioa2 = new Saioa(null, null, null, null);
        Sarrera sarrera = new Sarrera(0, saioa1);
        sarrera.setSaioa(saioa2);
        assertEquals(saioa2, sarrera.getSaioa());
    }

    @Test
    public void testEquals() {
        Saioa saioa1 = new Saioa(null, null, null, null);
        Saioa saioa2 = new Saioa(null, null, null, null);
        Sarrera sarrera1 = new Sarrera(5, saioa1);
        Sarrera sarrera2 = new Sarrera(5, saioa1);
        Sarrera sarrera3 = new Sarrera(10, saioa1);
        Sarrera sarrera4 = new Sarrera(5, saioa2);

        assertEquals(sarrera1, sarrera2);
        assertNotEquals(sarrera1, sarrera3);
    }

    @Test
    public void testHashCode() {
        Saioa saioa = new Saioa(null, null, null, null);
        Sarrera sarrera1 = new Sarrera(5, saioa);
        Sarrera sarrera2 = new Sarrera(5, saioa);

        assertEquals(sarrera1.hashCode(), sarrera2.hashCode());
    }

    @Test
    public void testToString() {
        Saioa saioa = new Saioa(null, null, null, null);
        Sarrera sarrera = new Sarrera(5, saioa);
        assertEquals("Sarrera kantitatea 5, saioa " + saioa + "", sarrera.toString());
    }
}
