
import java.util.Iterator;

/**
 * Write a description of class TenistaVoleador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    @Override
    public void golpear(){
        double puntos = this.getPuntosAcumulados()+this.getRaqueta().calcularPotencia()*0.15;
        this.setPuntosAcumulados(puntos);
    }
    
    @Override
    public void cambiarRaqueta(){
        cambiarRaquetaVelocidad();
    }
    
    @Override
    public String tipoTenista(){
        return "(Voleadores)";
    }
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("    ** Tenista (Voleadores)");
        builder.append(super.toString());
        return builder.toString();
    }
    
    public void cambiarRaquetaVelocidad(){
        boolean bandera = false;
        Iterator <Raqueta> it = Campeonato.getInstance("Campeonato de Extremadura").getRaquetasCampeonato().iterator();
        while(it.hasNext() && !bandera){
            Raqueta r = it.next();
                  if (this.getRaqueta().calcularVelocidad()<r.calcularVelocidad()){
                    this.setRaqueta(r);
                    Campeonato.getInstance("Campeonato de Extremadura").borrarRaqueta(r);
                    bandera=true;
                 }
            }
    }
}
