
/**
 * Esta clase representa las raquetas potentes, es una subclase de raqueta generica
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public class RaquetaPotente extends RaquetaGenerica
{
    // atributo privado de la sublcase
    private double multiplicadorVelocidad;

      /**
     * Constructor Parametrizado de la clase RaquetaPotente
     * Este constructor crea un nuevo objeto de la clase RaquetaPotente 
     * con los valores pasados por parametro.
     */
    public RaquetaPotente(String modelo, double peso, double longitud, double tamañoCabeza, 
                          Encordado encordado)
    {
        super(modelo, peso, longitud, tamañoCabeza, encordado);
        this.multiplicadorVelocidad = 1.5;
    }
    
    /**
     * Multiplica la potencia asociada a la raqueta según su longitud
     * @return potencia asociada a la raqueta según su longitud
     */
    @Override
    public double calcularPotencia ()
    {
        double potencia = super.getEncordado().getMultiplicadorPotencia();
        double resultado = super.calcularPotencia();
        return potencia*resultado;
    }
    /**
     * Multiplica la velocidad asociada a la raqueta según su peso
     * @return velocidad asociada a la raqueta según su peso
     */
    @Override
    public double calcularVelocidad ()
    {
        double resultado = super.calcularVelocidad();
        return multiplicadorVelocidad*resultado;
    }

    /**
     * Devuelve el multiplicador de velocidad de la raqueta
     * @return el multiplicador de velocidad
     */
    public double getMultiplicadorVelocidad()
    {
        return multiplicadorVelocidad;
    }
    /**
     * Permite cambiar el multiplicador de velocidad de la raqueta
     * @param multiplicadorVelocidad El nuevo multiplicador de velocidad
     */
    public void setMultiplicadorVelocidad(double multiplicadorVelocidad)
    {
        this.multiplicadorVelocidad = multiplicadorVelocidad;
    }
    /**
     * Devuelve una cadena con el tipo de raqueta que es y los campos especificos de la subclase
     * @return el tipo de raqueta y sus campos especificos
     */
    @Override
    public String getTipo(){
        StringBuilder builder = new StringBuilder();
        builder.append("    ** RaquetaPotente(Encordado:");
        builder.append(getEncordado());
        builder.append(" (MultiplicadorDePotencia: ");
        builder.append(getEncordado().getMultiplicadorPotencia()+")");
        builder.append(" (MultiplicadorDeControl: ");
        builder.append(getEncordado().getMultiplicadorControl()+")");
        builder.append("\n");
        return builder.toString();
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
        if(!(obj instanceof RaquetaPotente)){
            return false; 
        }
        
        RaquetaPotente other = (RaquetaPotente) obj;
        
        return super.equals(other) && getMultiplicadorVelocidad()==other.getMultiplicadorVelocidad();
    }
}
