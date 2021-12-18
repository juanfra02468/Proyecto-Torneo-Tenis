
/**
 * Write a description of class Comunicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comunicacion
{
    // instance variables - replace the example below with your own
    private MedioGeneralista generalista;
    private MedioDeportivo deportivo;
    private MedioSensacionalista sensacionalista;

    /**
     * Constructor for objects of class Comunicacion
     */
    public Comunicacion()
    {
        generalista = new MedioGeneralista("La Tierrina");
        deportivo = new MedioDeportivo("Anota");
        sensacionalista = new MedioSensacionalista("Adios"); 
    }
    
    public void notificar(Tenista t1, Tenista t2, int ronda){
        Tenista ganador;
        Tenista perdedor;
        if (t1.getPuntosAcumulados()>t2.getPuntosAcumulados()){
            ganador=t1;
            perdedor=t2;
        }
        else{
            ganador=t2;
            perdedor=t1;
        }
        generalista.actualizar(ganador,perdedor, ronda);
        deportivo.actualizar(ganador,perdedor, ronda);
        sensacionalista.actualizar(ganador,perdedor,ronda);
    }
}
