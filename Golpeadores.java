
/**
 * Write a description of class TenistaGolpeador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Golpeadores extends Tenista
{
    /**
     * Constructor for objects of class TenistaVoleador
     */
    public Golpeadores(String nombre, ZapatillaGenerica zapatilla, double saque,
                       double resto,int ranking, String pais, double numPie){
        super(nombre,zapatilla,saque,resto,ranking,pais,numPie);
    }
    
    @Override
    public void golpear(){
        double puntos = this.getPuntosAcumulados()+this.getRaqueta().calcularVelocidad()*0.1;
        this.setPuntosAcumulados(puntos);
    }
    
    public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("   ** Tenista (Golpeadores)");
    builder.append(super.toString());
    return builder.toString();
    }
    
    @Override
    public String tipoTenista(){
        return "(Golpeadores)";
    }
    
    
}
