
/**
 * Clase que representa al medio generalista.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 19-12-2021
 */
public class MedioGeneralista extends MedioGenerico
{

    /**
     * Constructor de la clase MedioSensacionalista
     */
    public MedioGeneralista(String nombre)
    {
        super(nombre);
    }

    /**
     * Imprime por pantalla el nombre del medio, el nombre del campeonato, la ronda, el nombre del ganador, el nombre del perdedor 
     * y la diferencia de puntos del ganador con el perdedor después de cada partido cuando cualquiera de los dos tenistas se encuentre
     * entre las 3 primeras posiciones del ranking.
     */
    public void actualizar (Tenista ganador, Tenista perdedor, int ronda){
        if (ganador.getRanking()<=2 || perdedor.getRanking()<=2){
            System.out.println("@@@@@@ El medio generalista "+getNombre()+" destaca en Deportes que en el "+Campeonato.getInstance("Campeonato de Extremadura").getNombre()+
            " en la ronda "+ronda+" porque se ha impuesto "+ganador.getNombre()+" a "+perdedor.getNombre()+" por una diferencia "+(ganador.getPuntosAcumulados()-perdedor.getPuntosAcumulados())+
            " puntos.");
        }
    }
}
