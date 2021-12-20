

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
    private RaquetaGenerica raquetaE1; 
    private RaquetaGenerica raquetaE2;
    private RaquetaGenerica raquetaE3;
    private RaquetaGenerica raquetaE4;
    private RaquetaGenerica raquetaE5;
    private RaquetaGenerica raquetaE6;

    /**
     * Default constructor for test class RaquetaEquilibradaTest
     */
    public RaquetaEquilibradaTest()
    {
    }
    /**
     * Creación de las instancias de todas las raquetasEquilibradas justo antes de cada prueba
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
     * Ejecución justo después de cada prueba
     */
    @AfterEach
    public void tearDown()
    {
    }
    /**
     * Prueba el funcionamiento del método calcularControl y comprueba que es el correcto
     */
    @Test
    public void controlTest()
    {
        assertEquals(16.0, raquetaE1.calcularControl(), 0.1);
        assertEquals(2.0, raquetaE2.calcularControl(), 0.1);
        assertEquals(16.0, raquetaE3.calcularControl(), 0.1);
    } 
    /**
     * Prueba el funcionamiento del método calcularPotencia y comprueba que es el correcto
     */
    @Test
    public void potenciaTest()
    {
        assertEquals(24.0, raquetaE1.calcularPotencia(), 0.1);
        assertEquals(16.0, raquetaE2.calcularPotencia(), 0.1);
        assertEquals(24.0, raquetaE3.calcularPotencia(), 0.1);
    }
    /**
     * Prueba el funcionamiento del método calcularVelocidad y comprueba que es el correcto
     */
    @Test
    public void velocidadTest()
    {
        assertEquals(4.0, raquetaE1.calcularVelocidad(), 0.1);
        assertEquals(4.0, raquetaE2.calcularVelocidad(), 0.1);
        assertEquals(4.0, raquetaE3.calcularVelocidad(), 0.1);
    }
    /**
     * Prueba que dos raquetas sean iguales o no
     */
    @Test
    public void equalsTest()
    {
        assertEquals(false, raquetaE6.equals(raquetaE5));
        assertEquals(true, raquetaE4.equals(raquetaE5));
    }
}







