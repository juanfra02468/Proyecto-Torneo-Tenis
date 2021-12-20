import java.util.ArrayList;
/**
 * Write a description of class Comunicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comunicacion
{
    // instance variables - replace the example below with your own
    private ArrayList <MedioGenerico> subscriptores;   

    /**
     * Constructor de la clase Comunicacion
     */
    public Comunicacion()
    {
        subscriptores = new ArrayList <>(); 
    }
    
    public void añadirMedio(MedioGenerico medio){
        subscriptores.add(medio);
    }
    
    /**
     * Notifica a los medios y les pasa el resultado del partido
     */
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
        
        for (MedioGenerico medio: subscriptores){
            medio.actualizar(ganador,perdedor,ronda);
        }
    }
}
