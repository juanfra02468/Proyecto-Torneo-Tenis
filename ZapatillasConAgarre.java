
/**
 * Esta clase representa las zapatillas del tipo agarre, es una subclase de zapatilla generica
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public class ZapatillasConAgarre extends ZapatillaGenerica
{
    // atributo privado propio de la subclase
    private double multiplicadorResto;

    /**
     * Constructor Parametrizado de la clase ZapatillasConAgarre
     * Este constructor crea un nuevo objeto de la clase ZapatillasConAgarre con los valores 
     * pasados por parametro.
     */
    public ZapatillasConAgarre(String modelo, int numero, double valor)
    {
        super(modelo,numero,valor);
        this.multiplicadorResto=1.7;
    }
    /**
     * Funcion:Metodo heredado de la super clase ZapatillaGenerica, al que multiplicamos, 
     * por el multiplicador característico de la subclase actual , para obtener el saque de 
     * un tenista con Zapatillas de tipo Agarre.
     * @return valor del saque del tenista con zapatillas de tipo Agarre.
     */
    @Override
    public double calcularValorResto()
    {
        double valorResto;
        valorResto = multiplicadorResto*super.calcularValorResto();
        return valorResto;
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
        builder.append("       ZapatillasConAgarre ");
        builder.append(super.toString());
        return builder.toString();
    }
    /**
     * Devuelve el multiplicador de resto de la zapatilla
     * @return el multiplicador de resto
     */
    public double getMultiplicadorResto()
    {
        return this.multiplicadorResto;
    }
    /**
     * Permite cambiar el multiplicador de resto de la zapatilla
     * @param multiplicadorResto El nuevo multiplicador de resto
     */
    public void setMultiplicadorResto(double multiplicadorResto)
    {
        this.multiplicadorResto = multiplicadorResto;
    }
    
    @Override
    public int hashCode()
    {
        int result = 7;
        result = 3 * result + super.hashCode();
        result = 5 * result + ((Double)getMultiplicadorResto()).hashCode();
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
        if(!(obj instanceof ZapatillasConAgarre)){
            return false;
        }
        
        ZapatillasConAgarre other = (ZapatillasConAgarre) obj;
        
        return super.equals(other) && 
        getMultiplicadorResto()==other.getMultiplicadorResto();
    }
}