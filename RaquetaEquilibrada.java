
/**
 * Esta clase representa las raquetas equilibrada, es una subclase de raqueta generica
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public class RaquetaEquilibrada extends RaquetaGenerica
{
    // instance variables - replace the example below with your own
    private double multiplicadorControl;
    private double multiplicadorPotencia;
      /**
     * Constructor Parametrizado de la clase RaquetaEquilibrada
     * Este constructor crea un nuevo objeto de la clase RaquetaEquilibrada 
     * con los valores pasados por parametro.
     */
    public RaquetaEquilibrada(String modelo, double peso, double longitud, double tamañoCabeza,
                              Encordado encordado, double multiplicadorPotencia, 
                              double multiplicadorControl)
    {
        super(modelo, peso, longitud, tamañoCabeza, encordado);
        this.multiplicadorPotencia = multiplicadorPotencia;
        this.multiplicadorControl = multiplicadorControl;
    }
    /**
     * Multiplica la potencia asociada a la raqueta según su longitud
     * @return potencia asociada a la raqueta según su longitud
     */
    @Override
    public double calcularPotencia ()
    {
        double resultado = super.calcularPotencia();
        return multiplicadorPotencia*resultado;
    }
    /**
     * Multiplica el control asociado a la raqueta según su tamaño de cabeza
     * @return control asociado a la raqueta según su tamaño de cabeza
     */
    @Override
    public double calcularControl ()
    {
        double resultado = super.calcularControl();
        return multiplicadorControl*resultado;
    }
    
    /**
     * Devuelve el multiplicador de control de la raqueta
     * @return el multiplicador de control
     */
    public double getMultiplicadorControl()
    {
        return multiplicadorControl;
    }
    /**
     * Permite cambiar el multiplicador de control de la raqueta
     * @param multiplicadorControl El nuevo multiplicador de control
     */
    public void setMultiplicadorControl(double multiplicadorControl)
    {
        this.multiplicadorControl = multiplicadorControl;
    }
    /**
     * Devuelve el multiplicador de potencia de la raqueta
     * @return el multiplicador de potencia
     */
    public double getMultiplicadorPotencia()
    {
        return multiplicadorPotencia;
    }
    /**
     * Permite cambiar el multiplicador de potencia de la raqueta
     * @param multiplicadorPotencia El nuevo multiplicador de potencia
     */
    public void setMultiplicadorPotencia(double multiplicadorPotencia)
    {
        this.multiplicadorPotencia = multiplicadorPotencia;
    }
    /**
     * Devuelve una cadena con el tipo de raqueta que es y los campos especificos de la subclase
     * @return el tipo de raqueta y sus campos especificos
     */
    @Override
    public String getTipo(){
        StringBuilder builder = new StringBuilder();
        builder.append("   ** RaquetaEquilibrada");
        builder.append(" (MultiplicadorDePotencia: ");
        builder.append(this.multiplicadorPotencia+")");
        builder.append(" (MultiplicadorDeControl: ");
        builder.append(this.multiplicadorControl+")");
        builder.append("\n");
        return builder.toString();
    }

    @Override
    public int hashCode()
    {
    int result = 7;
    result = 3 * result + super.hashCode();
    result = 5 * result + ((Double)getMultiplicadorControl()).hashCode();
    result = 7 * result + ((Double)getMultiplicadorPotencia()).hashCode();
    return result;
    }    
    /**
     * Devuelve true si todos los campos son iguales o si apuntan al mismo objeto, 
     * false si algún campo es diferente o no son del mismo tipo
     */
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj){
            return true; 
        }
        if(!(obj instanceof RaquetaEquilibrada)){
            return false; 
        }
        
        RaquetaEquilibrada other = (RaquetaEquilibrada) obj;
        
        return super.equals(other) && getMultiplicadorControl()==other.getMultiplicadorControl() &&
                    getMultiplicadorPotencia()==other.getMultiplicadorPotencia();
    }
}
