
/**
 * Write a description of class RaquetaPotente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RaquetaPotente extends RaquetaGenerica
{
    // atributo privado de la sublcase
    private double multiplicadorVelocidad;

      /**
     * Constructor Parametrizado de la clase RaquetaPotente
     * Este constructor crea un nuevo objeto de la clase RaquetaPotente con los valores pasados por parametro.
     */
    public RaquetaPotente(String modelo, double peso, double longitud, double tamañoCabeza, Encordado encordado)
    {
        super(modelo, peso, longitud, tamañoCabeza, encordado);
        this.multiplicadorVelocidad = 1.5;
    }
    
    @Override
    public double calcularPotencia (double longitud)
    {
        double potencia = super.getEncordado().getMultiplicadorPotencia();
        double resultado = super.calcularPotencia(longitud);
        return potencia*resultado;
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
        builder.append("    ** RaquetaPotente(Encordado:");
        builder.append(getEncordado());
        builder.append(" (MultiplicadorDePotencia: ");
        builder.append(getEncordado().getMultiplicadorPotencia()+")");
        builder.append(" (MultiplicadorDeControl: ");
        builder.append(getEncordado().getMultiplicadorControl()+")");
        builder.append("\n");
        return builder.toString();
    }
  
}
