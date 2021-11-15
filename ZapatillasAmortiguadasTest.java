

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ZapatillasAmortiguadasTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadasTest
{
    private ZapatillasAmortiguadas zapatill1;
    private ZapatillasAmortiguadas zapatill2;
    private ZapatillasAmortiguadas zapatill3;
    private ZapatillasAmortiguadas zapatill5;

    /**
     * Default constructor for test class ZapatillasAmortiguadasTest
     */
    public ZapatillasAmortiguadasTest()
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
        zapatill1 = new ZapatillasAmortiguadas("UberSonic 4K", 40, 5.5);
        zapatill2 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42, 5.0);
        zapatill3 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7.0);
        zapatill5 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 7.0);
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
    public void calcularValorSaqueTest()
    {
        assertEquals(15.12, zapatill3.calcularValorSaque(), 0.1);
        assertEquals(11.87, zapatill1.calcularValorSaque(), 0.1);
        assertEquals(10.8, zapatill2.calcularValorSaque(), 0.1);
    }

    @Test
    public void equalsTest()
    {
        assertEquals(true, zapatill5.equals(zapatill3));
        assertEquals(false, zapatill5.equals(zapatill1));
    }
}


