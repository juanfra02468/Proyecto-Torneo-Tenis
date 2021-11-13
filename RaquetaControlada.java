
/**
 * Esta clase representa las raquetas controladas, es una subclase de raqueta generica
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public class RaquetaControlada extends RaquetaGenerica
{
    private double multiplicadorVelocidad;

      /**
     * Constructor Parametrizado de la clase RaquetaPotente
     * Este constructor crea un nuevo objeto de la clase RaquetaPotente 
     * con los valores pasados por parametro.
     */
    public RaquetaControlada(String modelo, double peso, double longitud, double tamañoCabeza,
                             Encordado encordado)
    {
        super(modelo, peso, longitud, tamañoCabeza, encordado);
        this.multiplicadorVelocidad = 1.2;
    }
    
    @Override
    public double calcularControl ()
    {
        double control = super.getEncordado().getMultiplicadorControl();
        double resultado = super.calcularControl();
        return control*resultado;
    }
    @Override
    public double calcularVelocidad ()
    {
        double resultado = super.calcularVelocidad();
        return multiplicadorVelocidad*resultado;
    }
    
    @Override
    public String getTipo(){
        StringBuilder builder = new StringBuilder();
        builder.append("    ** RaquetaControlada(Encordado:");
        builder.append(getEncordado());
        builder.append(" (MultiplicadorDePotencia: ");
        builder.append(getEncordado().getMultiplicadorPotencia()+")");
        builder.append(" (MultiplicadorDeControl: ");
        builder.append(getEncordado().getMultiplicadorControl()+")");
        builder.append("\n");
        return builder.toString();
    }
  
}
