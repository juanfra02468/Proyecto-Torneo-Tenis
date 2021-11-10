/**
 * Write a description of class Amortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends ZapatillaGenerica
{
    // instance variables - replace the example below with your own
    private double multiplicadorSaque;

    /**
     * Constructor for objects of class Amortiguadas
     */
    public ZapatillasAmortiguadas(String modelo, int numero, double valor)
    {
        super(modelo,numero,valor);
        this.multiplicadorSaque=1.8;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public double calcularValorSaque()
    {
        double valorSaque;
        valorSaque = multiplicadorSaque*super.calcularValorSaque();
        return valorSaque;
    }
    
        @Override
    public String getTipo(){
        return "*** ZapatillasAmortiguadas ";
    }

}