
/**
 * Write a description of class DeAgarre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasConAgarre extends ZapatillaGenerica
{
    // atributo privado propio de la subclase
    private double multiplicadorResto;

   /**
     * Constructor Parametrizado de la clase ZapatillasConAgarre
     * Este constructor crea un nuevo objeto de la clase ZapatillasConAgarre con los valores pasados por parametro.
     */
    public ZapatillasConAgarre(String modelo, int numero, double valor)
    {
        super(modelo,numero,valor);
        this.multiplicadorResto=1.7;
    }
    /**
     * Funcion:Metodo heredado de la super clase ZapatillaGenerica, al que multiplicamos, por el multiplicador característico
     * de la subclase actual , para obtener el saque de un tenista con Zapatillas de tipo Agarre.
     * @return devuelve el valor del saque del tenista con zapatillas de tipo Agarre.
     */
    @Override
    public double calcularValorResto()
    {
        double valorResto;
        valorResto = multiplicadorResto*super.calcularValorResto();
        return valorResto;
    }
    /**
     * Funcion:Metodo heredado de la super clase ZapatillaGenerica, en el que devolvemos el tipo de zapatillas 
     * caracteristico de esta subclase , en este caso devolvemos que son Zapatillad de Agarre.
     * @return devuelve el tipo de zapatillas de la subclase actual.
     */
    @Override
    public String getTipo()
    {
        return "*** ZapatillasConAgarre ";
    }

}