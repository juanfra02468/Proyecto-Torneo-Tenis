import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/**
 * Esta clase representa la superclase de las subclases: RaquetaPotente, RaquetaEquilibrada y 
 * RaquetaControlada
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @version 13-11-2021
 */

public abstract class RaquetaGenerica implements Raqueta
{
    // instance variables - replace the example below with your own
    private String modelo;
    private Encordado encordado;
    private double peso;
    private double longitud;
    private double tamañoCabeza;
    private static final Map<Double, Double> mapaLongitudPotencia = Map.of(
        680.0, 2.0, 
        690.0, 4.0, 
        700.0, 6.0, 
        720.0, 8.0, 
        740.0, 10.0
    );
    private static final Map<Double, Double> mapaCabezaControl = Map.of(
        600.0, 10.0, 
        630.0, 8.0, 
        650.0, 6.0, 
        680.0, 4.0, 
        720.0, 2.0
    );
    private static final Map<Double, Double> mapaPesoVelocidad = Map.of(
        220.0, 10.0, 
        260.0, 8.0, 
        300.0, 6.0, 
        320.0, 4.0, 
        340.0, 2.0
    );
    
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
        double potencia=(double)mapaLongitudPotencia.get((Double)longitud);
        return potencia;
    }

    public double calcularControl()
    {
        double control=(double)mapaCabezaControl.get((Double)tamañoCabeza);
        return control;
    }
    
    public double calcularVelocidad()
    {
        double velocidad=(double)mapaPesoVelocidad.get((Double)peso);
        return velocidad;
    }
     
    public abstract String getTipo();  
    
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(getTipo());
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
          
}
