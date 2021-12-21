import java.util.Iterator;

/**
 * Esta clase representa la superclase de las subclases: RaquetaPotente, RaquetaEquilibrada y 
 * RaquetaControlada
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @version 21-12-2021
 */

public class RaquetaGenerica implements Raqueta
{
    // instance variables - replace the example below with your own
    private String modelo;
    private Encordado encordado;
    private double peso;
    private double longitud;
    private double tamañoCabeza;
    
    /**
     * Constructor parametrizado de la clase RaquetaGenerica
     * Crea un nuevo objeto de la clase RaquetaGenerica con los valores 
     * pasados por parámetro
     */    
    public RaquetaGenerica(String modelo, double peso, double longitud, 
                           double tamañoCabeza, Encordado encordado){
        this.modelo = modelo;
        this.peso = peso;
        this.longitud = longitud;
        this.tamañoCabeza = tamañoCabeza;
        this.encordado = encordado;
    }
    
    public String getModelo(){
        return modelo;
    }
         
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
     
    public double getPeso()
    {
        return peso;
    }
        
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
     
    public double getLongitud()
    {
        return longitud;
    }
         
    public void setLongitud(double longitud)
    {
        this.longitud = longitud;
    }
    
    public double getTamañoCabeza()
    {
        return tamañoCabeza;
    }
       
    public void setTamañoCabeza(double tamañoCabeza)
    {
        this.tamañoCabeza = tamañoCabeza;
    }
    
    public Encordado getEncordado()
    {
        return encordado;
     }
    
    public void setEncordado(Encordado encordado)
    {
        this.encordado = encordado;
    }
    
    public double calcularPotencia()
    {
        double potencia=(double)TablasRaquetas.getMapaLongitudPotencia(longitud);
        return potencia;
    }

    public double calcularControl()
    {
        double control=(double)TablasRaquetas.getMapaCabezaControl(tamañoCabeza);
        return control;
    }
    
    public double calcularVelocidad()
    {
        double velocidad=(double)TablasRaquetas.getMapaPesoVelocidad(peso);
        return velocidad;
    }
    
    public String mostrarRaquetaCambiada(){
        return getClass().getName()+" modelo="+getModelo()+" velocidad="+calcularVelocidad();
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("        [modelo= ");
        builder.append(getModelo());
        builder.append("\n");
        builder.append("        longitud: ");
        builder.append(getLongitud() +", ");
        builder.append(" potencia asociada: ");
        builder.append(calcularPotencia());
        builder.append("\n");
        builder.append("        tamaño: ");
        builder.append(getTamañoCabeza() +", ");
        builder.append(" control asociado: ");
        builder.append(calcularControl());
        builder.append("\n");
        builder.append("        peso: ");
        builder.append(getPeso() +", ");
        builder.append(" velocidad asociada: ");
        builder.append(calcularVelocidad()+"]");
        return builder.toString();
    }

    @Override
    public int hashCode()
    {
        int result = 7;
        result = 3 * result + getModelo().hashCode();
        result = 5 * result + getEncordado().hashCode();
        result = 7 * result + ((Double)getPeso()).hashCode();
        result = 13 * result + ((Double)getLongitud()).hashCode();
        result = 17 * result + ((Double)getTamañoCabeza()).hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj){
            return true; 
        }
        if(!(obj instanceof RaquetaGenerica)){
            return false; 
        }
        
        RaquetaGenerica other = (RaquetaGenerica) obj;
        
        return getModelo().equals(other.getModelo()) && getEncordado().equals(other.getEncordado()) &&
                getPeso()==other.getPeso() && getLongitud()==other.getLongitud() && 
                getTamañoCabeza()==other.getTamañoCabeza();
    }
}
