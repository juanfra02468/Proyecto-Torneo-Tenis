import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
/**
 * Abstract class RaquetaGenerica - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class RaquetaGenerica implements Raqueta
{
    // instance variables - replace the example below with your own
    private String modelo;
    private Encordado encordado;
    private int peso;
    private int longitud;
    private int tamañoCabeza;
    private static final Map<Integer, Integer> mapaLongitudPotencia = Map.of(
        680, 2, 
        690, 4, 
        700, 6, 
        720, 8, 
        740, 10
    );
    private static final Map<Integer, Integer> mapaCabezaControl = Map.of(
        600, 10, 
        630, 8, 
        650, 6, 
        680, 4, 
        720, 2
    );
    private static final Map<Integer, Integer> mapaPesoVelocidad = Map.of(
        220, 10, 
        260, 8, 
        300, 6, 
        320, 4, 
        340, 2
    );
    /**
     * Constructor parametrizado de la clase RaquetaGenerica
     * Este constructor crea un nuevo objeto de la clase RaquetaGenerica con los valores pasados por parametro
     */    
    public RaquetaGenerica(String modelo, int peso, int longitud, int tamañoCabeza, Encordado encordado)
    {
        this.modelo = modelo;
        this.peso = peso;
        this.longitud = longitud;
        this.tamañoCabeza = tamañoCabeza;
        this.encordado = encordado;
    }
    /**
     * Este método devuelve el modelo de la Raqueta
     * @return String, que hace referencia al modelo de la raqueta
     */ 
    public String getModelo()
    {
        return modelo;
    }
      /**
     * Este método permite cambiar el modelo de la raqueta
     * @param modelo Hace referencia al nuevo modelo de la raqueta
     */     
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    /**
     * Este método devuelve el peso de la Raqueta
     * @return int, que hace referencia al peso de la raqueta
     */ 
    public int getPeso()
    {
        return peso;
    }
    /**
     * Este método permite cambiar el peso de la raqueta
     * @param peso Hace referencia al nuevo peso de la raqueta
     */     
    public void setPeso(int peso)
    {
        this.peso = peso;
    }
    /**
     * Este método devuelve la longitud de la raqueta
     * @return int, que hace referencia a la longitud de la raqueta
     */ 
    public int getLongitud()
    {
        return longitud;
    }
     /**
     * Este método permite cambiar la longitud de la raqueta
     * @param longitud Hace referencia a la nueva longitud de la raqueta 
     */     
    public void setLongitud(int longitud)
    {
        this.longitud = longitud;
    }
     /**
     * Este método devuelve el tamaño de la cabeza de la raqueta
     * @return int, que hace referencia a el tamaño de la cabeza de la raqueta
     */ 
    public int getTamañoCabeza()
    {
        return tamañoCabeza;
    }
    /**
     * Este método permite cambiar eltamaño de la cabeza de la raqueta
     * @param tamañoCabeza Hace referencia al nuevo tamaño de la cabeza de la raqueta
     */     
    public void setTamañoCabeza(int tamañoCabeza)
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
    
    public double calcularPotencia(int longitud)
    {
        double potencia=(double)mapaLongitudPotencia.get((Integer)longitud);
        return potencia;
    }

    public double calcularControl(int TamCabeza)
    {
        double control=(double)mapaCabezaControl.get((Integer)TamCabeza);
        return control;
    }
    
    public double calcularVelocidad(int peso)
    {
        double velocidad=(double)mapaPesoVelocidad.get((Integer)peso);
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
