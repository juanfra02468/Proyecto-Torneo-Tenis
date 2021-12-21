import java.lang.Math;
/**
 * Clase que representa al medio sensacionalista.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 19-12-2021
 */
public class MedioSensacionalista extends MedioGenerico
{

    /**
     * Constructor de la clase MedioSensacionalista
     */
    public MedioSensacionalista(String nombre)
    {
        super(nombre);
    }

    /**
     * Imprime por pantalla el nombre del medio, el nombre del campeonato, la ronda, el nombre del ganador, el nombre del perdedor y
     * la diferencia de puestos en el ranking después de cada partido, si el ganador del partido no está entre las 3 primeras posiciones
     * y el ranking del perdedor sí está entre las 3 primeras posiciones.
     */
    public void actualizar (Tenista ganador, Tenista perdedor, int ronda){
        if (ganador.getRanking()>3 && perdedor.getRanking()<=3){
            Campeonato.getInstance("Campeonato de Extremadura").escribirFicheroPantalla("@@@@@@ El medio sensacionalista "+getNombre()+" destaca en Deportes que ha habido sorpresa en el "+Campeonato.getInstance("Campeonato de Extremadura").getNombre()+
            " en la ronda "+ronda+" porque se ha impuesto "+ganador.getNombre()+" a "+perdedor.getNombre()+" cuando les separan "+Math.abs(ganador.getRanking()-perdedor.getRanking())+
            " puestos en el ranking.");
        }
    }
    
}
