
/**
 * Write a description of class RaquetaEquilibrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaEquilibrada extends RaquetaGenerica
{
    // instance variables - replace the example below with your own
    private double multiplicadorControl;
    private double multiplicadorPotencia;
    /**
     * Constructor for objects of class RaquetaPotente
     */
    public RaquetaEquilibrada(String modelo, int peso, int longitud, int tamañoCabeza, Encordado encordado, double multiplicadorPotencia, double multiplicadorControl)
    {
        super(modelo, peso, longitud, tamañoCabeza, encordado);
        this.multiplicadorPotencia = multiplicadorPotencia;
        this.multiplicadorControl = multiplicadorControl;
    }
    
    @Override
    public double calcularPotencia (int longitud)
    {
        double resultado = super.calcularPotencia(longitud);
        return multiplicadorPotencia*resultado;
    }
    @Override
    public double calcularControl (int tamañoCabeza)
    {
        double resultado = super.calcularControl(tamañoCabeza);
        return multiplicadorControl*resultado;
    }
    
    @Override
public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("*** RaquetaEquilibrada(Encordado:");
    builder.append(getEncordado()+")");
    builder.append(" (MultiplicadorDePotencia: ");
    builder.append(this.multiplicadorPotencia+")");
    builder.append(" (MultiplicadorDeControl: ");
    builder.append(this.multiplicadorControl+")");
    builder.append("\n");
    builder.append(" [modelo= ");
    builder.append(getModelo());
    builder.append("\n");
    builder.append(" longitud: ");
    builder.append(getLongitud() +", ");
    builder.append(" potencia asociada: ");
    builder.append(calcularPotencia(getLongitud()));
    builder.append("\n");
    builder.append(" tamaño: ");
    builder.append(getTamañoCabeza() +", ");
    builder.append(" control asociado: ");
    builder.append(calcularControl(getTamañoCabeza()));
    builder.append("\n");
    builder.append(" peso: ");
    builder.append(getPeso() +", ");
    builder.append(" velocidad asoaciada: ");
    builder.append(calcularVelocidad(getPeso()));
    return builder.toString();
}
  
}
