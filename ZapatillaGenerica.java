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
     * Crea un nuevo objeto de la clase Zapatilla
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
     * Crea un nuevo objeto de la clase Zapatilla con los valores pasados por parámetro
     */    
    public ZapatillaGenerica(String modelo,double numero,double valor)
    {
        this.modelo = modelo;
        this.numero = numero;
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
       
    public void setValor(int valor)
    {
        this.valor = valor;    
    }
      
    public double getValor()
    {
        return this.valor; 
    }   
    
    public double calcularValorSaque()
    {
     double valorSaque;
        valorSaque = valor*1.2;
     return valorSaque;
    }
       
    public double calcularValorResto()
    {
        double valorResto;
            valorResto = valor*1.3;
        return valorResto;
    }
     
    public double getNumero(){
        return numero;
    }
        
    public void setNumero(double numero){
        this.numero=numero;
    }
    
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
        return builder.toString();
    }
    
    public abstract String getTipo();
}
