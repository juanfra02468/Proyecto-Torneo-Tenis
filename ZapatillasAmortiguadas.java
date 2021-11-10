/**
 * Write a description of class Amortiguadas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZapatillasAmortiguadas extends ZapatillaGenerica
{
    // atributo privado propio de la subclase
    private double multiplicadorSaque;

    /**
     * Constructor Parametrizado de la clase ZapatillasAmortiguadas
     * Este constructor crea un nuevo objeto de la clase ZapatillasAmortiguadas con los valores pasados por parametro.
     */
    public ZapatillasAmortiguadas(String modelo, int numero, double valor)
    {
        super(modelo,numero,valor);
        this.multiplicadorSaque=1.8;
    }

    /**
     * Funcion:Metodo heredado de la super clase ZapatillaGenerica, al que multiplicamos, por el multiplicador característico
     * de la subclase actual , para obtener el saque de un tenista con Zapatillas de tipo Amortiguacion.
     * @return devuelve el valor del saque del tenista con zapatillas de tipo Amortiguación.
     */
    @Override
    public double calcularValorSaque()
    {
        double valorSaque;
        valorSaque = multiplicadorSaque*super.calcularValorSaque();
        return valorSaque;
    }
    /**
     * Funcion:Metodo heredado de la super clase ZapatillaGenerica, en el que devolvemos el tipo de zapatillas 
     * caracteristico de esta subclase , en este caso devolvemos que son Zapatillad de Amortiguacion.
     * @return devuelve el tipo de zapatillas de la subclase actual.
     */
        @Override
    public String getTipo(){
        return "*** ZapatillasAmortiguadas ";
    }

}