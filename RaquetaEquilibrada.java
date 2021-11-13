
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
    
    @Override
    public double calcularPotencia ()
    {
        double resultado = super.calcularPotencia();
        return multiplicadorPotencia*resultado;
    }
    @Override
    public double calcularControl ()
    {
        double resultado = super.calcularControl();
        return multiplicadorControl*resultado;
    }
    
    @Override
    public String getTipo(){
        StringBuilder builder = new StringBuilder();
        builder.append("    ** RaquetaEquilibrada");
        builder.append(" (MultiplicadorDePotencia: ");
        builder.append(this.multiplicadorPotencia);
        builder.append(" (MultiplicadorDeControl: ");
        builder.append(this.multiplicadorControl+")");
        builder.append("\n");
        return builder.toString();
    }
  
}
