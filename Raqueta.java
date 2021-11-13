
/**
 * Esta clase representa la interfaz de raqueta
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García 
 * @version 
 */

public interface Raqueta
{
    
    /**
     * Devuelve la potencia asociada a la raqueta según su longitud
     * @return potencia asociada a la raqueta según su longitud
     */
    public double calcularPotencia();
    
    /**
     * Devuelve el control asociado a la raqueta según su tamaño de cabeza
     * @return control asociado a la raqueta según su tamaño de cabeza
     */
    public double calcularControl();
    
    /**
     * Devuelve la velocidad asociada a la raqueta según su peso
     * @return velocidad asociada a la raqueta según su peso
     */
    public double calcularVelocidad();
    
    /**
     * Devuelve el modelo de la Raqueta
     * @return el modelo de la raqueta
     */ 
    public String getModelo();
       
    /**
     * Permite cambiar el modelo de la raqueta
     * @param modelo el nuevo modelo de la raqueta
     */
    public void setModelo(String modelo);
    
    /**
     * Devuelve el peso de la Raqueta
     * @return el peso de la raqueta
     */
    public double getPeso();
    
    /**
     * Permite cambiar el peso de la raqueta
     * @param peso el peso de la raqueta
     */ 
    public void setPeso(double peso);
    
    /**
     * Devuelve la longitud de la raqueta
     * @return la longitud de la raqueta
     */
    public double getLongitud();
    
    /**
     * Permite cambiar la longitud de la raqueta
     * @param longitud la nueva longitud de la raqueta 
     */
    public void setLongitud(double longitud);
    
    /**
     * Devuelve el tamaño de la cabeza de la raqueta
     * @return el tamaño de la cabeza de la raqueta
     */ 
    public double getTamañoCabeza();  
    
    /**
     * Permite cambiar el tamaño de la cabeza de la raqueta
     * @param El nuevo tamaño de la cabeza de la raqueta
     */  
    public void setTamañoCabeza(double tamañoCabeza);
    
    /**
     * Devuelve el encordado de la raqueta
     * @return el encordado de la raqueta
     */
    public Encordado getEncordado();
   
    /**
     * Permite cambiar el encordado de la raqueta
     * @param encordado El nuevo encordado de la raqueta
     */
    public void setEncordado(Encordado encordado);
    
    /**
     * Devuelve una cadena con todos los campos de una raqueta
     */
    public String toString();

    /**
     * Devuelve una cadena con el tipo específico de raqueta
     */
    public String getTipo();
}
