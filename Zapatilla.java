

/**
 * Esta clase representa la interfaz de zapatilla
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public interface Zapatilla
{
    /**
     * Permite cambiar el modelo de la zapatilla
     * @param modelo El modelo de la zapatilla
     */  
    public void setModelo(String modelo);
    
    /**
     * Devuelve el modelo de la zapatilla
     * @return el modelo de la zapatilla
     */ 
    public String getModelo();
    
    /**
     * Permite cambiar el valor de la zapatilla
     * @param El valor de la zapatilla
     */ 
    public void setValor(int valor);
    
    /**
     * Devuelve el valor de la zapatilla
     * @return el valor asignado a una zapatilla
     */  
    public double getValor();
    
    /**
     * Devuelve el valor del saque de dicha zapatilla
     * @return el valor del saque 
     */
    public double calcularValorSaque();
    
    /**
     * Devuelve el valor del resto de dicha zapatilla, cuando se invoca al metodo restar 
     * de la clase Tenista
     * @return el valor del resto 
     */ 
    public double calcularValorResto();
    
    /**
     * Devuelve el numero de pie de un modelo de zapatillas.
     * @return el numero de de pie de un modelo de zapatillas
     */  
    public double getNumero();
    
    /**
     * Permite cambiar el numero de pie de la zapatilla
     * @param valor El numero de pie de la zapatilla
     */  
    public void setNumero(double numero);
    
    /**
     * Devuelve una cadena con todos los campos de una zapatilla
     * @return cadena con todos los campos de una zapatilla
     */
    public String toString();
    
     /**
     * Permite obtener el tipo de zapatilla
     * @return el tipo de zapatilla que tenemos
     */  
    public String getTipo();

     /**
     * Calcula una funcion hash que permite saber si dos objetos son identicos
     */ 
    public int hashCode();
    
    /**
     * Devuelve true si todos los campos son iguales o si apuntan 
     * al mismo objeto, false si algún campo es diferente o 
     * no son del mismo tipo
     */
    public boolean equals(Object obj);
}