

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test ;

/**
 * The test class CampeonatoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CampeonatoTest
{
    private Tenista t1;
    private Tenista t2;
    private Tenista t3;
    private Tenista t4;
    private ZapatillaGenerica z1;
    private ZapatillaGenerica z2;
    private ZapatillaGenerica z5;
    private ZapatillaGenerica z7;
    private ZapatillaGenerica z9;
    private ZapatillaGenerica z10;
    private ZapatillaGenerica z11;
    private ZapatillaGenerica z12;
    private ZapatillaGenerica z13;
    private RaquetaGenerica r1;
    private RaquetaGenerica r2;
    private RaquetaGenerica r3;
    private RaquetaGenerica r4;
    private RaquetaGenerica r5;
    private RaquetaGenerica r6;
    private RaquetaGenerica r7;
    private RaquetaGenerica r8;
    private RaquetaGenerica r9;
    private RaquetaGenerica r10;
    private RaquetaGenerica r11;
    private RaquetaGenerica r12;
    private Campeonato campeonato;

    
    /**
     * Default constructor for test class CampeonatoTest
     */
    public CampeonatoTest()
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
         r1 =  new RaquetaPotente("Head Radical", 260, 680, 680, Encordado.ABIERTO);
         r2 =  new RaquetaPotente("Wilson Blade", 260, 690, 680, Encordado.ABIERTO);
         r3 =  new RaquetaPotente("Dunlop CX200", 300, 700, 630, Encordado.ABIERTO);
         r4 =  new RaquetaPotente("Yonex Vcore", 300, 680, 650, Encordado.CERRADO);
         r5 =  new RaquetaControlada("Babolat Drive", 340, 740, 600, Encordado.CERRADO);
         r6 =  new RaquetaControlada("Pure Aero", 340, 680, 720, Encordado.CERRADO);
         r7 =  new RaquetaControlada("TFlash 300", 300, 680, 680, Encordado.CERRADO);
         r8 =  new RaquetaControlada("Wilson Silver", 220, 690, 650, Encordado.ABIERTO);
         r9 =  new RaquetaEquilibrada("Prince Hornet 100", 220, 690, 600, Encordado.CERRADO, 2.5, 4);
         r10 =  new RaquetaEquilibrada("Head Graphene", 320, 690, 630, Encordado.ABIERTO, 6, 2);
         r11 =  new RaquetaEquilibrada("Prince TT Bandit", 220, 680, 680, Encordado.CERRADO, 6, 3);
         r12 =  new RaquetaEquilibrada("Class 100L", 320, 680, 720, Encordado.ABIERTO, 8, 1);
         z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42,  5);
         z2 = new ZapatillasConAgarre("Court Vapor React", 40,  5);
         z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43, 3.5);
         z5 = new ZapatillasConAgarre("Court Lite", 39, 3);
         z9 = new ZapatillasAmortiguadas("Lotto Space", 40,  5);
         z10 = new ZapatillasAmortiguadas("K-Swiss Express", 42,  3);
         z11 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42, 5.5);
         z12 = new ZapatillasAmortiguadas("Lotto Mirage", 40, 6);
         z13 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40,  5);
         t1 = new Golpeadores ("Novak Djokovic", z1, 90, 80, 1, "Serbia", 42);
         t2 = new Golpeadores ("Ashleigh Barty", z2, 70, 80, 1, "Australia", 40);
         t3 = new Voleadores ("Stefanos Tsitsipas", z7, 55, 48, 3, "Grecia", 43);
         t4 = new Voleadores ("Karolina Pliskova", z5, 67, 68.5, 3, "Rep Checa", 39);
         campeonato = Campeonato.getInstance("Campeonato de NigeriaTest");
        
        t1.realizarInscripcion();
        t2.realizarInscripcion();
        t3.realizarInscripcion();
        t4.realizarInscripcion();
        
        campeonato.añadirRaquetas(r1);
        campeonato.añadirRaquetas(r2);
        campeonato.añadirRaquetas(r3);
        campeonato.añadirRaquetas(r4);
        campeonato.añadirRaquetas(r5);
        campeonato.añadirRaquetas(r6);
        campeonato.añadirRaquetas(r7);
        campeonato.añadirRaquetas(r8);
        campeonato.añadirRaquetas(r9);
        campeonato.añadirRaquetas(r10);
        campeonato.añadirRaquetas(r11);
        campeonato.añadirRaquetas(r12);
        
        campeonato.añadirZapatilla(z9);
        campeonato.añadirZapatilla(z10);
        campeonato.añadirZapatilla(z11);
        campeonato.añadirZapatilla(z12);
        campeonato.añadirZapatilla(z13) ;
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
        campeonato.reset();
    }
    
    @Test
    public void asignarRaquetaTest()
    {
        campeonato.asignarRaquetas();
        assertEquals(true, r10.equals(t1.getRaqueta()));
        assertEquals(true, r12.equals(t2.getRaqueta()));
        assertEquals(true, r11.equals(t3.getRaqueta()));
        assertEquals(true, r3.equals(t4.getRaqueta()));
    }
    
    @Test
    public void controldeCampeonatoTest() throws ExcepcionRaquetas
    {
        campeonato.controlDeCampeonato();
        Tenista t = campeonato.getCompetidores().get(0);
        assertEquals(true, t1.equals(t));
        assertEquals(3, campeonato.getRaquetasCampeonato().size());
        assertEquals(true, r1.equals(t.getRaqueta()));
        
    }
}
