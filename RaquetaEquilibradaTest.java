

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Esta clase representa las pruebas sobre RaquetaEquilibrada
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García 
 * @version 
 */
public class RaquetaEquilibradaTest
{
    private RaquetaEquilibrada raquetaE1;
    private RaquetaEquilibrada raquetaE2;
    private RaquetaEquilibrada raquetaE3;
    private RaquetaEquilibrada raquetaE4;
    private RaquetaEquilibrada raquetaE5;
    private RaquetaEquilibrada raquetaE6;

    
    
    

    /**
     * Default constructor for test class RaquetaEquilibradaTest
     */
    public RaquetaEquilibradaTest()
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
        raquetaE1 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, null, 6.0, 2.0);
        raquetaE2 = new RaquetaEquilibrada("Class 100L", 320.0, 680.0, 720.0, null, 8.0, 1.0);
        raquetaE3 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, null, 6.0, 2.0);
        raquetaE4 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, Encordado.ABIERTO, 6.0, 2.0);
        raquetaE5 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, Encordado.ABIERTO, 6.0, 2.0);
        raquetaE6 = new RaquetaEquilibrada("Class 100L", 320.0, 680.0, 720.0, Encordado.CERRADO, 8.0, 1.0);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        raquetaE1=null;
        raquetaE2=null;
        raquetaE3=null;
        raquetaE4=null;
        raquetaE5=null;
        raquetaE6=null;
    }
    
    @Test
    public void controlTest()
    {
        assertEquals(16.0, raquetaE1.calcularControl(), 0.1);
        assertEquals(2.0, raquetaE2.calcularControl(), 0.1);
        assertEquals(16.0, raquetaE3.calcularControl(), 0.1);
    }

    @Test
    public void potenciaTest()
    {
        assertEquals(24.0, raquetaE1.calcularPotencia(), 0.1);
        assertEquals(16.0, raquetaE2.calcularPotencia(), 0.1);
        assertEquals(24.0, raquetaE3.calcularPotencia(), 0.1);
    }

    @Test
    public void equalsTest()
    {
        assertEquals(false, raquetaE6.equals(raquetaE5));
        assertEquals(true, raquetaE4.equals(raquetaE5));
    }

}







