import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

/**
 * Descripción
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @version
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
     * Este constructor crea un nuevo objeto de la clase RaquetaGenerica con los valores 
     * pasados por parametro
     */    
    public RaquetaGenerica(String modelo, double peso, double longitud, 
                           double tamañoCabeza, Encordado encordado){
        this.modelo = modelo;
        this.peso = peso;
        this.longitud = longitud;
        this.tamañoCabeza = tamañoCabeza;
        this.encordado = encordado;
    }
    
    /**
    * Este método devuelve el modelo de la Raqueta
    * @return el modelo de la raqueta
    */ 
    public String getModelo(){
        return modelo;
    }
      /**
     * Este método permite cambiar el modelo de la raqueta
     * @param modelo Hace referencia al nuevo modelo de la raqueta
     */     
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    /**
     * Este método devuelve el peso de la Raqueta
     * @return int, que hace referencia al peso de la raqueta
     */ 
    public double getPeso()
    {
        return peso;
    }
    /**
     * Este método permite cambiar el peso de la raqueta
     * @param peso Hace referencia al nuevo peso de la raqueta
     */     
    public void setPeso(double peso)
    {
        this.peso = peso;
    }
    /**
     * Este método devuelve la longitud de la raqueta
     * @return int, que hace referencia a la longitud de la raqueta
     */ 
    public double getLongitud()
    {
        return longitud;
    }
     /**
     * Este método permite cambiar la longitud de la raqueta
     * @param longitud Hace referencia a la nueva longitud de la raqueta 
     */     
    public void setLongitud(double longitud)
    {
        this.longitud = longitud;
    }
     /**
     * Este método devuelve el tamaño de la cabeza de la raqueta
     * @return int, que hace referencia a el tamaño de la cabeza de la raqueta
     */ 
    public double getTamañoCabeza()
    {
        return tamañoCabeza;
    }
    /**
     * Este método permite cambiar eltamaño de la cabeza de la raqueta
     * @param tamañoCabeza Hace referencia al nuevo tamaño de la cabeza de la raqueta
     */     
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
    
    public double calcularPotencia(double longitud)
    {
        double potencia=(double)mapaLongitudPotencia.get((Double)longitud);
        return potencia;
    }

    public double calcularControl(double TamCabeza)
    {
        double control=(double)mapaCabezaControl.get((Double)TamCabeza);
        return control;
    }
    
    public double calcularVelocidad(double peso)
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
        builder.append(calcularPotencia(getLongitud()));
        builder.append("\n");
        builder.append("        tamaño: ");
        builder.append(getTamañoCabeza() +", ");
        builder.append(" control asociado: ");
        builder.append(calcularControl(getTamañoCabeza()));
        builder.append("\n");
        builder.append("        peso: ");
        builder.append(getPeso() +", ");
        builder.append(" velocidad asociada: ");
        builder.append(calcularVelocidad(getPeso())+"]");
        return builder.toString();
    }
          
}
