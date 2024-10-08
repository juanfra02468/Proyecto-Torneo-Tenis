

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
    private ZapatillaGenerica zapatill1;
    private ZapatillaGenerica zapatill2;
    private ZapatillaGenerica zapatill3;

    /**
     * Default constructor for test class ZapatillasConAgarreTest
     */
    public ZapatillasConAgarreTest()
    {
    }
    /**
     * Se instancian 3 zapatillas esto se va a ejecutar antes de cada prueba
     */
    @BeforeEach
    public void setUp()
    {
        zapatill1 = new ZapatillasConAgarre("Court Lite", 39, 3.0);
        zapatill2 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40, 4.0);
        zapatill3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40, 4.0);
    }
    /**
     * Esto se va a ejecutar después de cada prueba
     */
    @AfterEach
    public void tearDown()
    {
    }
    /**
     * Se comprueba que los valores que devuelven las zapatillas al calcular el valor del resto, son correctos
     */
    @Test
    public void calcularValorRestoTest()
    {
        assertEquals(6.63, zapatill1.calcularValorResto(), 0.1);
        assertEquals(8.84, zapatill2.calcularValorResto(), 0.1);
        assertEquals(8.84, zapatill3.calcularValorResto(), 0.1);
    }
    /**
     * Se comprueba que los valores que devuelven las zapatillas al calcular el valor del saque, son correctos
     */
    @Test
    public void calcularValorSaqueTest()
    {
        assertEquals(3.59, zapatill1.calcularValorSaque(), 0.1);
        assertEquals(4.8, zapatill2.calcularValorSaque(), 0.1);
        assertEquals(4.8, zapatill3.calcularValorSaque(), 0.1);
    }
    /**
     * Se comprueban que zapatillas son iguales y cuales no lo son
     */
    @Test
    public void equalsTest()
    {
        assertEquals(false, zapatill1.equals(zapatill2));
        assertEquals(true, zapatill1.equals(zapatill1));
        assertEquals(true, zapatill2.equals(zapatill3));
    }
}



