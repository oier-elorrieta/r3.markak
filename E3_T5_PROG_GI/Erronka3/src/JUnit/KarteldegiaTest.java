package JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

import Modelo.Filma;
import Modelo.Karteldegia;

public class KarteldegiaTest {

    @Test
    public void testGetFilmak() {
        Filma[] filmak = {new Filma("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia = new Karteldegia(filmak);
        assertArrayEquals(filmak, karteldegia.getFilmak());
    }

    @Test
    public void testSetFilmak() {
        Filma[] filmak = {new Filma("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia = new Karteldegia(filmak);
        karteldegia.setFilmak(filmak);
        assertArrayEquals(filmak, karteldegia.getFilmak());
    }

    @Test
    public void testEquals() {
        Filma[] filmak1 = {new Filma("Film1", 1, 120, "Generoa1", 10.0)};
        Filma[] filmak2 = {new Filma("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia1 = new Karteldegia(filmak1);
        Karteldegia karteldegia2 = new Karteldegia(filmak2);
        assertEquals(karteldegia1, karteldegia2);
    }

    @Test
    public void testToString() {
        Filma[] filmak = {new Filma("Film1", 1, 120, "Generoa1", 10.0)};
        Karteldegia karteldegia = new Karteldegia(filmak);
        assertEquals("Karteldegia [filmak=[Pelikula [izena=Film1, id_peli=1, iraupena=120, generoa=Generoa1, prezioa=10.0]]]", karteldegia.toString());
    }
}