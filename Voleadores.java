
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
    public void cambiarRaquetaTenista(){
        Campeonato.cambiarRaquetaVelocidad(this);
    }
    
    @Override
    public String tipoTenista(){
        return "(Voleadores)";
    }
}
