
/**
 * Write a description of class RaquetaControlada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaControlada extends RaquetaGenerica
{
    // instance variables - replace the example below with your own
    private double multiplicadorVelocidad;

    /**
     * Constructor for objects of class RaquetaPotente
     */
    public RaquetaControlada(String modelo, int peso, int longitud, int tamañoCabeza, Encordado encordado)
    {
        super(modelo, peso, longitud, tamañoCabeza, encordado);
        this.multiplicadorVelocidad = 1.2;
    }
    
    @Override
    public double calcularControl (int tamañoCabeza)
    {
        double control = super.getEncordado().getMultiplicadorControl();
        double resultado = super.calcularControl(tamañoCabeza);
        return control*resultado;
    }
    @Override
    public double calcularVelocidad (int peso)
    {
        double resultado = super.calcularVelocidad(peso);
        return multiplicadorVelocidad*resultado;
    }
    
    @Override
public String toString(){
    StringBuilder builder = new StringBuilder();
    builder.append("*** RaquetaControlada(Encordado:");
    builder.append(getEncordado()+")");
    builder.append(" (MultiplicadorDePotencia: ");
    builder.append(getEncordado().getMultiplicadorPotencia()+")");
    builder.append(" (MultiplicadorDeControl: ");
    builder.append(getEncordado().getMultiplicadorControl()+")");
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
