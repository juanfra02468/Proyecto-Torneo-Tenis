

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TenistaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TenistaTest
{
    private ZapatillasAmortiguadas zap1;
    private Tenista tenista1;
    private Tenista tenista2;
    private ZapatillasAmortiguadas zapatill1;
    private Tenista tenista3;
    private Tenista tenista4;
    private Encordado aBIERTO1;
    private Encordado cERRADO1;
    private RaquetaEquilibrada raquetaE1;
    private RaquetaPotente raquetaP1;

    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    

    
    
    
    
    

    /**
     * Default constructor for test class TenistaTest
     */
    public TenistaTest()
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
        zap1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42, 5.0);
        tenista1 = new Tenista("Novak Djokovic", zap1, 90.0, 80.0, 1, "Serbia", 42.0);
        tenista2 = new Tenista("Ashleigh Barty", zap1, 70.0, 80.0, 1, "Australia", 40.0);
        zapatill1 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
        tenista3 = new Tenista("Karolina Pliskova", zapatill1, 67.0, 68.5, 3, "Rep Checa", 39.0);
        tenista1.equals(tenista2);
        tenista4 = new Tenista("Novak Djokovic", zap1, 90.0, 80.0, 1, "Serbia", 42.0);
        Encordado.values();
        Encordado.values();
        aBIERTO1 = Encordado.values()[0];
        cERRADO1 = Encordado.values()[1];
        raquetaE1 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, aBIERTO1, 6.0, 2.0);
        tenista1.setRaqueta(raquetaE1);
        tenista4.setRaqueta(raquetaE1);
        raquetaP1 = new RaquetaPotente("Dunlop CX200", 300.0, 700.0, 630.0, aBIERTO1);
        tenista3.setRaqueta(raquetaP1);
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
        assertEquals(false, tenista1.equals(tenista2));
        assertEquals(true, tenista1.equals(tenista4));
        tenista1.setRaqueta(raquetaP1);
        assertEquals(false, tenista1.equals(tenista4));
    }

    @Test
    public void hashCodeTest()
    {
        assertEquals(-982801996, tenista4.hashCode() );
        assertEquals(-982801996, tenista1.hashCode());
        assertEquals(400392848, tenista3.hashCode());
    }
}


