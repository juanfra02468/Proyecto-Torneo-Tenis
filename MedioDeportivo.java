
/**
 * Write a description of class MedioGeneralista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedioDeportivo
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Constructor for objects of class MedioSensacionalista
     */
    public MedioDeportivo(String nombre)
    {
        this.nombre=nombre;
    }

    public void actualizar (Tenista ganador, Tenista perdedor, int ronda){
            System.out.println("@@@@@@ El medio deportivo "+nombre+" destaca que en el campeonato "+Campeonato.getInstance("Campeonato de Extremadura").getNombre()+
            " en la ronda "+ronda+" se ha impuesto "+ganador.getNombre()+" que ocupa la posición "+ganador.getRanking()+" en el ranking a "+perdedor.getNombre()+ " que ocupa la posicion "+
            perdedor.getRanking()+" con un marcador de "+ganador.getPuntosAcumulados()+"-"+perdedor.getPuntosAcumulados()+".");
    }
}
