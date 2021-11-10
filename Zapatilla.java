

/**
 * Write a description of interface Zapatilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Zapatilla
{
    /**
     * Este método permite cambiar el modelo de la zapatilla
     * @param modelo Hace referencia al modelo de la zapatilla
     */ 
    public void setModelo(String modelo);
    /**
     * Este método devuelve el modelo de la zapatilla
     * @return String, que hace referencia al modelo de la zapatilla
     */ 
    public String getModelo();
    /**
     * Este método permite cambiar el valor de la zapatilla
     * @param valor Hace referencia al valor de la zapatilla
     */  
    public void setValor(int valor);
    /**
     * Este método devuelve el valor de la zapatilla
     * @return Double, que hace referencia al valor asignado a una zapatilla
     */   
    public double getValor();
    /**
     * Este método devuelve el valor del saque de dicha zapatilla, cuando se invoca al metodo sacar de la clase Tenista
     * @param saque Hace referencia al valor del saque de un Tenista
     * @return Double, que hace referencia al valor del saque segun el tipo de zapatilla
     */
    public double calcularValorSaque();
    /**
     * Este método devuelve el valor del resto de dicha zapatilla, cuando se invoca al metodo restar de la clase Tenista
     * @param resto Hace referencia al valor del resto de un Tenista
     * @return Double, que hace referencia al valor del resto segun el tipo de zapatilla
     */
    public double calcularValorResto();
    /**
     * Este método devuelve el numero de pie de un modelo de zapatillas. 
     * @return Double, que hace referencia al numero de de pie de un modelo de zapatillas.
     */ 
    public double getNumero();
     /**
     * Este método permite cambiar el numero de pie de la zapatilla.
     * @param valor Hace referencia al numero de pie de la zapatilla.
     */  
    public void setNumero(double numero);
    /**
     * Este método muestra todos los campos de una zapatilla
     */
    public String toString();
     /**
     * Este método permite obtener el tipo de zapatilla.
     * @return devuelve el tipo de zapatilla que tenemos.
     */  
    public String getTipo();
}