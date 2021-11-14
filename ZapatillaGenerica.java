
/**
 * Esta clase representa la superclase de las subclases: ZapatillaConAgarre y ZapatillaAmortiguada
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @version 13-11-2021
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
     * @param modelo el modelo de la zapatilla
     * @param valor el valor de la zapatilla
     * @param numero el numero de pie de la zapatilla
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
    
    @Override
    public int hashCode()
    {
    int result = 7;
    result = 3 * result + getModelo().hashCode();
    result = 5 * result + ((Double)getNumero()).hashCode();
    result = 7 * result + ((Double)getValor()).hashCode();
    return result;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(this == obj){
            return true; 
        }
        if(!(obj instanceof ZapatillaGenerica)){
            return false; 
        }
        
        ZapatillaGenerica other = (ZapatillaGenerica) obj;
        
        return getModelo().equals(other.getModelo()) 
               && getNumero()==other.getNumero() 
               && getValor()==other.getValor();
    }
}
