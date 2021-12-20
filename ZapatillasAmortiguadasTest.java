

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Esta clase representa las pruebas sobre ZapatillasAmortiguadas
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García 
 * @version 
 */
public class ZapatillasAmortiguadasTest
{
    private ZapatillaGenerica zapatill1;
    private ZapatillaGenerica zapatill2;
    private ZapatillaGenerica zapatill3;
    private ZapatillaGenerica zapatill5;

    /**
     * Default constructor for test class ZapatillasAmortiguadasTest
     */
    public ZapatillasAmortiguadasTest()
    {
    }
    /**
     * Se instancian 3 zapatillas esto se va a ejecutar antes de cada prueba
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
     * Esto se va a ejecutar después de cada prueba
     */
    @AfterEach
    public void tearDown()
    {
    }
    /**
     * Se comprueba que los valores que devuelven las zapatillas al calcular el valor del saque, son correctos
     */
    @Test
    public void calcularValorSaqueTest()
    {
        assertEquals(15.12, zapatill3.calcularValorSaque(), 0.1);
        assertEquals(11.87, zapatill1.calcularValorSaque(), 0.1);
        assertEquals(10.8, zapatill2.calcularValorSaque(), 0.1);
    }
    /**
     * Se comprueba que los valores que devuelven las zapatillas al calcular el valor del resto, son correctos
     */
    @Test
    public void calcularValorRestoTest()
    {
        assertEquals(9.1, zapatill3.calcularValorResto(), 0.1);
        assertEquals(7.15, zapatill1.calcularValorResto(), 0.1);
        assertEquals(6.5, zapatill2.calcularValorResto(), 0.1);
    }
    /**
     * Se comprueban que zapatillas son iguales y cuales no lo son
     */    
    @Test
    public void equalsTest()
    {
        assertEquals(true, zapatill5.equals(zapatill3));
        assertEquals(false, zapatill5.equals(zapatill1));
    }

}



