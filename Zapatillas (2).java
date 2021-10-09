
/**
 * Write a description of class Zapatillas here.
 * 
 * @author David Bonilla, Antonio y Juan Francisco García 
 * @version 27-09-2021
 */
public class Zapatillas
{
    // instance variables - replace the example below with your own
    private String modelo;
    private int numero;
    private String tipo;
    private double valor;

    /**
     * Constructor for objects of class Zapatillas
     */
    public Zapatillas()
    {
        // initialise instance variables
        this.modelo = "";
        this.tipo = "";
        this.valor = 0;
    }
    
    
    public Zapatillas(String modelo,int numero, String tipo, double valor)
    {
        this.modelo = modelo;
        this.numero = numero;
        this.tipo = tipo;
        this.valor = valor;
    }
    
    public void setModelo(String modelo)
    {
        this.modelo = modelo;    
    }
    
    public String getModelo()
    {
        return this.modelo; 
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;    
    }
    
    public String getTipo()
    {
        return this.tipo; 
    }
    
    public void setValor(int valor)
    {
        this.valor = valor;    
    }
    
    public double getValor()
    {
        return this.valor; 
    }
    
    public double calcularValorSaque(double saque)
    {
        double valorSaque;
        if (getTipo()=="amortiguacion")
        {
            valorSaque = saque*valor*2;
        }
        else
        {
            valorSaque = saque*valor;
        }
        return valorSaque;
    }
    
    public double calcularValorResto(double resto)
    {
        double valorResto;
        if (getTipo()=="agarre")
        {
            valorResto = resto*valor*1.5;
        }
        else
        {
            valorResto = resto*valor;
        }
        return valorResto;
    }
    
    public void mostrarZapatilla()
    {
        System.out.println("Zapatillas [modelo="+this.modelo+", numero="+this.numero+
        ", tipo="+this.tipo+", valor="+this.valor+"]");
    }
}
