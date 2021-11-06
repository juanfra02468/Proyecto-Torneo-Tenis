
/**
 * Write a description of class DeAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends ZapatillaGenerica
{
    // instance variables - replace the example below with your own
    private double multiplicadorResto;

    /**
     * Constructor for objects of class Amortiguadas
     */
    public ZapatillasConAgarre(String modelo, int numero, double valor)
    {
        super(modelo,numero,valor);
        this.multiplicadorResto=1.7;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public double calcularValorResto(double resto)
    {
        double valorResto;
        valorResto = multiplicadorResto*super.calcularValorSaque(resto);
        return valorResto;
    }
    @Override
    public void mostrarZapatilla()
    {
        System.out.println("ZapatillasConAgarre ");
        super.mostrarZapatilla();
    }
}