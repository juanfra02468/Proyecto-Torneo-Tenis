
/**
 * La clase Zapatilla representa las zapatillas que llevan puesta los tenistas participantes del campeonato
 * 
 * 
 * @author David Bonilla, Antonio Javier Hidalgo y Juan Francisco García 
 * @version 09-10-2021
 */
public class Zapatillas
{
    // instance variables - replace the example below with your own
    private String modelo;
    private int numero;
    private String tipo;
    private double valor;

    /**
     * Constructor por defecto de la clase Zapatilla
     * Este constructor crea un nuevo objeto de la clase Zapatilla
     */
    public Zapatillas()
    {
        // initialise instance variables
        this.modelo = "";
        this.tipo = "";
        this.valor = 0;
        this.numero = 40;
    }
    
    /**
     * Constructor parametrizado de la clase Zapatilla
     * Este constructor crea un nuevo objeto de la clase Zapatilla con los valores pasados por parametro
     */    
    public Zapatillas(String modelo,int numero, String tipo, double valor)
    {
        this.modelo = modelo;
        this.numero = numero;
        this.tipo = tipo;
        this.valor = valor;
    }
       
    /**
     * Este método permite cambiar el modelo de la zapatilla
     * @param modelo Hace referencia al modelo de la zapatilla
     */     
    public void setModelo(String modelo)
    {
        this.modelo = modelo;    
    }
    /**
     * Este método devuelve el modelo de la zapatilla
     * @return String, que hace referencia al modelo de la zapatilla
     */    
    public String getModelo()
    {
        return this.modelo; 
    }
    /**
     * Este método permite cambiar el tipo de la zapatilla
     * @param tipo Hace referencia al tipo de la zapatilla
     */     
    public void setTipo(String tipo)
    {
        this.tipo = tipo;    
    }
    /**
     * Este método devuelve el tipo de la zapatilla
     * @return String, que hace referencia al tipo de la zapatilla
     */    
    public String getTipo()
    {
        return this.tipo; 
    }
    /**
     * Este método permite cambiar el valor de la zapatilla
     * @param valor Hace referencia al valor de la zapatilla
     */    
    public void setValor(int valor)
    {
        this.valor = valor;    
    }
    /**
     * Este método devuelve el valor de la zapatilla
     * @return Double, que hace referencia al valor asignado a una zapatilla
     */    
    public double getValor()
    {
        return this.valor; 
    }   
    /**
     * Este método devuelve el valor del saque de dicha zapatilla, cuando se invoca al metodo sacar de la clase Tenista
     * @param saque Hace referencia al valor del saque de un Tenista
     * @return Double, que hace referencia al valor del saque segun el tipo de zapatilla
     */
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
    /**
     * Este método devuelve el valor del resto de dicha zapatilla, cuando se invoca al metodo restar de la clase Tenista
     * @param resto Hace referencia al valor del resto de un Tenista
     * @return Double, que hace referencia al valor del resto segun el tipo de zapatilla
     */    
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
    /**
     * Este método muestra todos los campos de una zapatilla
     */    
    public void mostrarZapatilla()
    {
        System.out.println("Zapatillas [modelo="+this.modelo+", numero="+this.numero+
        ", tipo="+this.tipo+", valor="+this.valor+"]");
    }
}
