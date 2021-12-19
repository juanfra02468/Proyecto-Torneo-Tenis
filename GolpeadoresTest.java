

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GolpeadoresTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GolpeadoresTest
{
    
    private Tenista t1;
    private Tenista t2;
    private ZapatillaGenerica z1;
    private ZapatillaGenerica z2;
    private ZapatillaGenerica z5;
    private ZapatillaGenerica z7;
    private ZapatillaGenerica z9;
    private RaquetaGenerica r1;
    private RaquetaGenerica r2;
    private RaquetaGenerica r3;
    private RaquetaGenerica r4;
    private RaquetaGenerica r5;
    private RaquetaGenerica r6;
    private Campeonato campeonato;

    /**
     * Default constructor for test class GolpeadoresTest
     */
    public GolpeadoresTest()
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
         z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
         z2 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
         z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
         z5 = new ZapatillasConAgarre("Court Lite", 42, 3);
         z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
         t1 = new Golpeadores ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
         t2 = new Golpeadores ("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
         r1 =  new RaquetaPotente("Head Radical", 260, 680, 680,Encordado.ABIERTO);
         r2 =  new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
         r3 =  new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
         r4 =  new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
         r5 =  new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
         r6 =  new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
        Campeonato campeonato = Campeonato.getInstance("Campeonato de BoliviaTest");
        
        t1.realizarInscripcion();
        t2.realizarInscripcion();
        
        campeonato.añadirZapatilla(z7);
        campeonato.añadirZapatilla(z5);
        campeonato.añadirZapatilla(z9);
        
        campeonato.añadirRaquetas(r1);
        campeonato.añadirRaquetas(r2);
        campeonato.añadirRaquetas(r3);
        campeonato.añadirRaquetas(r4);
        campeonato.añadirRaquetas(r5);
        campeonato.añadirRaquetas(r6);
        
        t1.setRaqueta(r1);
        t2.setRaqueta(r2);
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        t1=null;
        t2=null;
        z1=null;
        z2=null;
        z7=null;
        z5=null;
        z9=null;
        r1=null;
        r2=null;
        r3=null;
        r4=null;
        r5=null;
        r6=null;
    }
    
    @Test
    public void jugarTest()
    {
        t1.jugar(t2);
        assertEquals(46657.20, t1.getPuntosAcumulados(), 0.1);
        assertEquals(false, r1.equals(t1.getRaqueta()));
        t2.jugar(t1);
        assertEquals(40321.2, t2.getPuntosAcumulados(), 0.1); 
        assertEquals(false, r2.equals(t2.getRaqueta()));
    }
    
    @Test
    public void elegirZapatillasTest(){
        t1.elegirZapatillaTenista();
        assertEquals(false, z2.equals(t1.getZapatilla()));
        assertEquals(true, z5.equals(t1.getZapatilla()));
        t2.elegirZapatillaTenista();
        assertEquals(false, z1.equals(t2.getZapatilla()));
        assertEquals(true, z9.equals(t2.getZapatilla()));
    }
    
}
