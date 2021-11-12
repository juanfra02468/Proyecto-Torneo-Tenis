
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
    public RaquetaControlada(String modelo, double peso, double longitud, double tamañoCabeza, Encordado encordado)
    {
        super(modelo, peso, longitud, tamañoCabeza, encordado);
        this.multiplicadorVelocidad = 1.2;
    }
    
    @Override
    public double calcularControl (double tamañoCabeza)
    {
        double control = super.getEncordado().getMultiplicadorControl();
        double resultado = super.calcularControl(tamañoCabeza);
        return control*resultado;
    }
    @Override
    public double calcularVelocidad (double peso)
    {
        double resultado = super.calcularVelocidad(peso);
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
