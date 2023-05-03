import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BarajaTest {

    private static BarajaEspanola b1;

    @BeforeAll
    static void setUp() {
        b1 = new BarajaEspanola();
    }
    @Test
    void repartirCarta() {
        Carta actual = b1.repartirCarta();
        assertNotNull(actual);
        assertTrue(b1.cartasSalidas().contains(actual));
        assertFalse(b1.cartasEnBaraja().contains(actual));
    }

    @Test
    void repartirVariasCartas() {
        List<Carta> actual = b1.repartirVariasCartas(5);
        assertNotNull(actual);
        assertTrue(b1.cartasSalidas().containsAll(actual));
        assertFalse(b1.cartasEnBaraja().containsAll(actual));
    }

    @Test
    void cartasEnBaraja() {
        List<Carta> actual = b1.cartasEnBaraja();
        assertNotNull(actual);
        assertTrue(b1.cartasEnBaraja().containsAll(actual));
        assertFalse(b1.cartasSalidas().containsAll(actual));
    }

    @Test
    void cartasSalidas() {
        List<Carta> actual = b1.cartasSalidas();
        assertNotNull(actual);
        assertTrue(b1.cartasSalidas().containsAll(actual));
        assertFalse(b1.cartasEnBaraja().containsAll(actual));
    }

    @Test
    void haSalidoCarta() {
        Carta actual = b1.repartirCarta();
        assertFalse(b1.haSalidoCarta(actual.toString()));
    }

    @Test
    void barajarCartasRestantes() {
        assertTrue(b1.barajarCartasRestantes());
    }

    @Test
    void barajarCartas() {
        BarajaEspanola b2 = new BarajaEspanola();
        assertTrue(b1.barajarCartas());
        assertTrue(b2.barajarCartas());
    }


    @Test
    void test1(){
        BarajaEspanola b2 = new BarajaEspanola();
        b2.repartirVariasCartas(39);
        assertEquals(1, b2.repartirVariasCartas(2).size());
    }
}