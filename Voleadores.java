
import java.util.Iterator;

/**
 * La clase Voleadores representa los tenistas de tipo Voleadores
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */
public class Voleadores extends Tenista
{
    /**
     * Constructor for objects of class TenistaVoleador
     */
    public Voleadores(String nombre, ZapatillaGenerica zapatilla, double saque,
                      double resto,int ranking, String pais, double numPie){
        super(nombre,zapatilla,saque,resto,ranking,pais,numPie);
    }
     /**
     * Metodo encargado de obtener los puntos de los tenista de tipo 
     * voleadores
     */
    @Override
    public void golpear(){
        double puntos = this.getPuntosAcumulados()+this.getRaqueta().calcularPotencia()*0.15;
        this.setPuntosAcumulados(puntos);
    }
    /**
     * Metodo que llama al metodo cambiarRaquetaVelocidad
     */
    @Override
    public void cambiarRaqueta(){
        cambiarRaquetaVelocidad();
    }
    
    /**
     * Metodo encargado de cambiar la raqueta a los tenistas Voleadores en caso de que se encuentre una
     * raqueta con mayor velocidad que la que tiene el tenista hasta ahora
     */
    public void cambiarRaquetaVelocidad(){
        boolean bandera = false;
        Iterator <Raqueta> it = Campeonato.getInstance("Campeonato de Extremadura").getRaquetasCampeonato().iterator();
        while(it.hasNext() && !bandera){
            Raqueta r = it.next();
                  if (this.getRaqueta().calcularVelocidad()<r.calcularVelocidad()){
                    this.setRaqueta(r);
                    Campeonato.getInstance("Campeonato de Extremadura").borrarRaqueta(r);
                    System.out.println("       "+this.getNombre()+" cambia su raqueta por: "+
                                       this.getRaqueta().mostrarRaquetaCambiada());
                    bandera=true;
                 }
            }
        
        if (!bandera){
            System.out.println("       "+this.getNombre()+" no cambia de raqueta ");
        }
    }
}
