

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Esta clase representa las pruebas sobre RaquetaControlada
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García 
 * @version 
 */
public class RaquetaControladaTest
{
    private RaquetaControlada raquetaC1;
    private RaquetaControlada raquetaC2;
    private RaquetaControlada raquetaC3;

    /**
     * Default constructor for test class RaquetaControladaTest
     */
    public RaquetaControladaTest()
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
        raquetaC1 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, Encordado.CERRADO);
        raquetaC2 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, Encordado.CERRADO);
        raquetaC3 = new RaquetaControlada("Wilson Silver", 220.0, 690.0, 650.0, Encordado.ABIERTO);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        raquetaC1=null;
        raquetaC2=null;
        raquetaC3=null;
    }


    @Test
    public void equalsTest()
    {
        assertEquals(false, raquetaC3.equals(raquetaC1));
        assertEquals(true, raquetaC2.equals(raquetaC1));
    }

    @Test
    public void velocidadTest()
    {
        assertEquals(2.4, raquetaC1.calcularVelocidad(), 0.1);
        assertEquals(2.4, raquetaC2.calcularVelocidad(), 0.1);
        assertEquals(12.0, raquetaC3.calcularVelocidad(), 0.1);
    }

    @Test
    public void controlTest()
    {
        assertEquals(25.0, raquetaC1.calcularControl(), 0.1);
        assertEquals(25.0, raquetaC2.calcularControl(), 0.1);
        assertEquals(13.20, raquetaC3.calcularControl(), 0.1);
    }
}




