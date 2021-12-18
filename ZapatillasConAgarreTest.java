

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Esta clase representa las pruebas sobre ZapatillasConAgarre
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García 
 * @version 
 */
public class ZapatillasConAgarreTest
{
    private ZapatillasConAgarre zapatill1;
    private ZapatillasConAgarre zapatill2;
    private ZapatillasConAgarre zapatill3;

    /**
     * Default constructor for test class ZapatillasConAgarreTest
     */
    public ZapatillasConAgarreTest()
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
        zapatill1 = new ZapatillasConAgarre("Court Lite", 39, 3.0);
        zapatill2 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40, 4.0);
        zapatill3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40, 4.0);
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
    public void calcularValorRestoTest()
    {
        assertEquals(6.63, zapatill1.calcularValorResto(), 0.1);
        assertEquals(8.84, zapatill2.calcularValorResto(), 0.1);
        assertEquals(8.84, zapatill3.calcularValorResto(), 0.1);
    }

    @Test
    public void equalsTest()
    {
        assertEquals(false, zapatill1.equals(zapatill2));
        assertEquals(true, zapatill1.equals(zapatill1));
        assertEquals(true, zapatill2.equals(zapatill3));
    }
}



