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
    private double numero;
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
    public ZapatillaGenerica(String modelo,double numero,double valor)
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
     * @return Double, que hace referencia al valor del saque segun el tipo de zapatilla
     */
    public double calcularValorSaque()
    {
     double valorSaque;
        valorSaque = valor*1.2;
     return valorSaque;
    }
    /**
     * Este método devuelve el valor del resto de dicha zapatilla, cuando se invoca al metodo restar de la clase Tenista.
     * @return Double, que hace referencia al valor del resto segun el tipo de zapatilla
     */    
    public double calcularValorResto()
    {
        double valorResto;
            valorResto = valor*1.3;
        return valorResto;
    }
    /**
     * Este método devuelve el numero de pie de un modelo de zapatillas. 
     * @return Double, que hace referencia al numero de de pie de un modelo de zapatillas.
     */  
    public double getNumero(){
        return numero;
    }
    /**
     * Este método permite cambiar el numero de pie de la zapatilla.
     * @param valor Hace referencia al numero de pie de la zapatilla.
     */    
    public void setNumero(double numero){
        this.numero=numero;
    }
    /**
     * Este método muestra todos los campos de una zapatilla
     */
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(getTipo());
        builder.append(" [modelo= ");
        builder.append(getModelo()+", ");
        builder.append("numero= ");
        builder.append(getNumero()+", ");
        builder.append("valor= ");
        builder.append(getValor()+"]");
        builder.append("\n");
        return builder.toString();
    }
    /**
     * Este método permite obtener el tipo de zapatilla.
     * @return devuelve el tipo de zapatilla que tenemos.
     */ 
    public abstract String getTipo();
}
