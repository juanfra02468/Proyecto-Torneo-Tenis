

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
    private RaquetaGenerica raquetaC1;
    private RaquetaGenerica raquetaC2;
    private RaquetaGenerica raquetaC3;

    /**
     * Default constructor for test class RaquetaControladaTest
     */
    public RaquetaControladaTest()
    {
    }
    /**
     * Creación de las instancias de todas las raquetasEquilibradas justo antes de cada prueba
     */
    @BeforeEach
    public void setUp()
    {
        raquetaC1 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, Encordado.CERRADO);
        raquetaC2 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, Encordado.CERRADO);
        raquetaC3 = new RaquetaControlada("Wilson Silver", 220.0, 690.0, 650.0, Encordado.ABIERTO);
    }
    /**
     * Ejecución justo después de cada prueba
     */
    @AfterEach
    public void tearDown()
    {
    }
    /**
     * Prueba que dos raquetas sean iguales o no
     */
    @Test
    public void equalsTest()
    {
        assertEquals(false, raquetaC3.equals(raquetaC1));
        assertEquals(true, raquetaC2.equals(raquetaC1));
    }
    /**
     * Prueba el funcionamiento del método calcularVelocidad y comprueba que es el correcto
     */
    @Test
    public void velocidadTest()
    {
        assertEquals(2.4, raquetaC1.calcularVelocidad(), 0.1);
        assertEquals(2.4, raquetaC2.calcularVelocidad(), 0.1);
        assertEquals(12.0, raquetaC3.calcularVelocidad(), 0.1);
    }
    /**
     * Prueba el funcionamiento del método calcularControl y comprueba que es el correcto
     */
    @Test
    public void controlTest()
    {
        assertEquals(25.0, raquetaC1.calcularControl(), 0.1);
        assertEquals(25.0, raquetaC2.calcularControl(), 0.1);
        assertEquals(13.20, raquetaC3.calcularControl(), 0.1);
    }
    /**
     * Prueba el funcionamiento del método calcularPotencia y comprueba que es el correcto
     */    
    @Test
    public void potenciaTest()
    {
        assertEquals(10.0, raquetaC1.calcularPotencia(), 0.1);
        assertEquals(10.0, raquetaC2.calcularPotencia(), 0.1);
        assertEquals(4.0, raquetaC3.calcularPotencia(), 0.1);
    }
}




