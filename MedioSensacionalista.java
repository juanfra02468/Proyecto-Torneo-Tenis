import java.lang.Math;
/**
 * Write a description of class MedioSensacionalista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MedioSensacionalista
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Constructor for objects of class MedioSensacionalista
     */
    public MedioSensacionalista(String nombre)
    {
        this.nombre=nombre;
    }

    public void actualizar (Tenista ganador, Tenista perdedor, int ronda){
        if (ganador.getRanking()>3 && perdedor.getRanking()<=3){
            System.out.println("@@@@@@ El medio sensacionalista "+nombre+" destaca en Deportes que ha habido sorpresa en el "+Campeonato.getInstance("Campeonato de Extremadura").getNombre()+
            " en la ronda "+ronda+" porque se ha impuesto "+ganador.getNombre()+" a "+perdedor.getNombre()+" cuando les separan "+Math.abs(ganador.getRanking()-perdedor.getRanking())+
            " puestos en el ranking.");
        }
    }
    
}
