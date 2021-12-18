
/**
 * Write a description of class MedioGeneralista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedioGeneralista
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Constructor for objects of class MedioSensacionalista
     */
    public MedioGeneralista(String nombre)
    {
        this.nombre=nombre;
    }

    public void actualizar (Tenista ganador, Tenista perdedor, int ronda){
        if (ganador.getRanking()<=2 || perdedor.getRanking()<=2){
            System.out.println("@@@@@@ El medio generalista "+nombre+" destaca en Deportes que en el "+Campeonato.getInstance("Campeonato de Extremadura").getNombre()+
            " en la ronda "+ronda+" porque se ha impuesto "+ganador.getNombre()+" a "+perdedor.getNombre()+" por una diferencia "+(ganador.getPuntosAcumulados()-perdedor.getPuntosAcumulados())+
            " puntos.");
        }
    }
}
