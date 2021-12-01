
/**
 * Esta clase representa las zapatillas de tipo amortiguación, es una subclase de zapatillagenerica
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public class ZapatillasAmortiguadas extends ZapatillaGenerica
{
    // atributo privado propio de la subclase
    private double multiplicadorSaque;

    /**
     * Constructor Parametrizado de la clase ZapatillasAmortiguadas
     * Este constructor crea un nuevo objeto de la clase ZapatillasAmortiguadas con los 
     * valores pasados por parametro.
     */
    public ZapatillasAmortiguadas(String modelo, int numero, double valor)
    {
        super(modelo,numero,valor);
        this.multiplicadorSaque=1.8;
    }

    /**
     * Funcion:Metodo heredado de la super clase ZapatillaGenerica, al que multiplicamos, 
     * por el multiplicador característico de la subclase actual, 
     * para obtener el saque de un tenista con Zapatillas de tipo Amortiguacion.
     * @return el valor del saque del tenista con zapatillas de tipo Amortiguación.
     */
    @Override
    public double calcularValorSaque()
    {
        double valorSaque;
        valorSaque = multiplicadorSaque*super.calcularValorSaque();
        return valorSaque;
    }
    /**
     * Funcion:Metodo sobrescrito de Zapatilla, añade el tipo de zapatilla
     *      a los demás datos
     * @return datos de la zapatilla
     */
    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("        ZapatillasAmortiguadas ");
        builder.append(super.toString());
        return builder.toString();
    }
    /**
     * Devuelve el multiplicador de saque de la zapatilla
     * @return el multiplicador de saque 
     */
    public double getMultiplicadorSaque()
    {
        return this.multiplicadorSaque;
    }
    /**
     * Permite cambiar el multiplicador de saque de la zapatilla
     * multiplicadorSaque El nuevo multiplicador de saque
     */
    public void setMultiplicadorSaque(double multiplicadorSaque)
    {
        this.multiplicadorSaque = multiplicadorSaque;
    }
    
    
    
    @Override
    public int hashCode()
    {
    int result = 7;
    result = 3 * result + super.hashCode();
    result = 5 * result + ((Double)getMultiplicadorSaque()).hashCode();
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
        if(!(obj instanceof ZapatillasAmortiguadas)){
            return false;
        }
        
        ZapatillasAmortiguadas other = (ZapatillasAmortiguadas) obj;
        
        return super.equals(other) 
               && getMultiplicadorSaque()==other.getMultiplicadorSaque();
    }
}