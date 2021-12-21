
/**
 * Esta clase representa el tipo de encordado de cada raqueta siendo este ABIERTO O CERRADO
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public enum Encordado
{
    ABIERTO (2.0, 2.2), CERRADO (1.8, 2.5);
    
    private final double multiplicadorPotencia;
    private final double multiplicadorControl;
    
    Encordado (double multiplicadorPotencia, double multiplicadorControl){
        this.multiplicadorPotencia = multiplicadorPotencia;
        this.multiplicadorControl = multiplicadorControl;
    }
    
    /**
     * Devuelve el multiplicador de potencia de la raqueta
     * @return el multiplicador de potencia
     */
    public double getMultiplicadorPotencia(){
        return multiplicadorPotencia;
    }
    
    /**
     * Devuelve el multiplicador de potencia de la raqueta
     * @return el multiplicador de potencia
     */
    public double getMultiplicadorControl(){
        return multiplicadorControl;
    }
    
    private String tipoEncordado()
    {
        if(getMultiplicadorPotencia() == 2.0)
        {
            return "Abierto";
        }
        else
        {
            return "Cerrado";
        }
    }
    
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("(Encordado: ");
        builder.append(tipoEncordado());
        builder.append(" (MultiplicadorDePotencia: ");
        builder.append(getMultiplicadorPotencia()+")");
        builder.append(" (MultiplicadorDeControl: ");
        builder.append(getMultiplicadorControl()+")");
        return builder.toString();
    }
}
