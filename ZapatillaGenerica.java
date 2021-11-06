/**
 * La clase Zapatilla representa las zapatillas que llevan puesta los tenistas participantes del campeonato
 * 
 * 
 * @author David Bonilla, Antonio Javier Hidalgo y Juan Francisco García 
 * @version 09-10-2021
 */
public abstract class ZapatillaGenerica implements Zapatilla
{
    // instance variables - replace the example below with your own
    private String modelo;
    private int numero;
    private double valor;

    /**
     * Constructor por defecto de la clase Zapatilla
     * Este constructor crea un nuevo objeto de la clase Zapatilla
     */
    public ZapatillaGenerica()
    {
        // initialise instance variables
        this.modelo = "";
        this.valor = 0;
        this.numero = 40;
    }
    
    /**
     * Constructor parametrizado de la clase Zapatilla
     * Este constructor crea un nuevo objeto de la clase Zapatilla con los valores pasados por parametro
     */    
    public ZapatillaGenerica(String modelo,int numero,double valor)
    {
        this.modelo = modelo;
        this.numero = numero;
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
        valorSaque = saque*valor*1.2;
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
            valorResto = resto*valor*1.3;
        return valorResto;
    }
    /**
     * Este método muestra todos los campos de una zapatilla
     */    
    public void mostrarZapatilla()
    {
        System.out.println("[modelo="+this.modelo+", numero="+this.numero+
        ", valor="+this.valor+"]");
    }
}
