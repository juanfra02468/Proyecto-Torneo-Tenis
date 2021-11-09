

/**
 * Write a description of interface Zapatilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Zapatilla
{
    public void setModelo(String modelo);
    
    public String getModelo();
    
    public void setValor(int valor);
    
    public double getValor();
    
    public double calcularValorSaque();
    
    public double calcularValorResto();
    
    public void mostrarZapatilla();
    
    public double getNumero();
    
    public void setNumero(double numero);
}