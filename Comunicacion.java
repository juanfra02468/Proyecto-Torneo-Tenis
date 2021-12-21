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
    
    /**
     * Método para añadir un nuevo medio al ArrayList de subscriptores
     */ 
    public void añadirMedio(MedioGenerico medio){
        subscriptores.add(medio);
    }
    
    /**
     * Notifica a los medios y les pasa el resultado del partido, ganador, perdedor y ronda
     */
    public void notificar(Tenista ganador, Tenista perdedor, int ronda){
        for (MedioGenerico medio: subscriptores){
            medio.actualizar(ganador,perdedor,ronda);
        }
    }
}
