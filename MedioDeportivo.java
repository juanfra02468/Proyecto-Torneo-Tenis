
/**
 * Clase que representa al medio deportivo.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 19-12-2021
 */
public class MedioDeportivo extends MedioGenerico
{
    /**
     * Constructor de la clase MedioSensacionalista
     */
    public MedioDeportivo(String nombre)
    {
        super(nombre);
    }

    /**
     * Imprime por pantalla el nombre del medio, el nombre del campeonato, la ronda, el nombre del ganador, el ranking del ganador, 
     * el nombre del perdedor, el ranking del perdedor y el resultado del partido siempre después de cada partido.
     */
    public void actualizar (Tenista ganador, Tenista perdedor, int ronda){
        System.out.println("@@@@@@ El medio deportivo "+getNombre()+" destaca que en el campeonato "+Campeonato.getInstance("Campeonato de Extremadura").getNombre()+
            " en la ronda "+ronda+" se ha impuesto "+ganador.getNombre()+" que ocupa la posición "+ganador.getRanking()+" en el ranking a "+perdedor.getNombre()+ " que ocupa la posicion "+
            perdedor.getRanking()+" con un marcador de "+ganador.getPuntosAcumulados()+"-"+perdedor.getPuntosAcumulados()+".");
    }
}
