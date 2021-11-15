

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Esta clase representa las pruebas sobre RaquetaPotente
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García 
 * @version 
 */
public class RaquetaPotenteTest
{
    private Encordado aBIERTO1;
    private Encordado cERRADO1;
    private RaquetaPotente raquetaP1;
    private RaquetaPotente raquetaP2;
    private RaquetaPotente raquetaP3;

    /**
     * Default constructor for test class RaquetaPotenteTest
     */
    public RaquetaPotenteTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        Encordado.values();
        aBIERTO1 = Encordado.values()[0];
        cERRADO1 = Encordado.values()[1];
        raquetaP1 = new RaquetaPotente("Dunlop CX200", 300.0, 700.0, 630.0, aBIERTO1);
        raquetaP2 = new RaquetaPotente("Dunlop CX200", 300.0, 700.0, 630.0, aBIERTO1);
        raquetaP3 = new RaquetaPotente("Wilson Blade", 300.0, 700.0, 631.0, cERRADO1);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void equalsTest()
    {
        assertEquals(true, raquetaP1.equals(raquetaP2));
        assertEquals(true, raquetaP1.equals(raquetaP1));
        assertEquals(false, raquetaP1.equals(raquetaP3));
    }

    @Test
    public void calcularPotenciaTest()
    {
        assertEquals(12, raquetaP1.calcularPotencia(), 0.1);
        assertEquals(10.8, raquetaP3.calcularPotencia(), 0.1);
    }

    @Test
    public void calcularVelocidadTest()
    {
        assertEquals(9, raquetaP1.calcularVelocidad(), 0.1);
        assertEquals(9, raquetaP3.calcularVelocidad(), 0.1);
    }
}



