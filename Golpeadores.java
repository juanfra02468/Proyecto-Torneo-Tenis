
/**
 * Write a description of class TenistaGolpeador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golpeadores extends Tenista
{
    /**
     * Constructor parametrizado de la clase Golpeadores
     * Crea un nuevo objeto de la clase golpeadores e invoca al constructor 
     * de la clase Zapatilla con los valores pasados por parametros
     */
    public Golpeadores(String nombre, ZapatillaGenerica zapatilla, double saque,
                       double resto,int ranking, String pais, double numPie){
        super(nombre,zapatilla,saque,resto,ranking,pais,numPie);
    }
    /**
     * Metodo encargado de obtener los puntos de los tenista de tipo 
     * golpeadores
     */
    @Override
    public void golpear(){
        double puntos = this.getPuntosAcumulados()+this.getRaqueta().calcularVelocidad()*0.1;
        this.setPuntosAcumulados(puntos);
    }

}
