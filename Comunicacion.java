import java.util.ArrayList;
/**
 * Clase que representa la comunicacion entre los medios y el campeonato.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 19-12-2021
 */
public class Comunicacion
{
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
