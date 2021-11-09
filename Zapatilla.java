

/**
 * Write a description of interface Zapatilla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Zapatilla
{
    public abstract void setModelo(String modelo);
    
    public abstract String getModelo();
    
    public abstract void setValor(int valor);
    
    public abstract double getValor();
    
    public abstract double calcularValorSaque();
    
    public abstract double calcularValorResto();
    
    public abstract void mostrarZapatilla();
    
    public abstract double getNumero();
    
    public abstract void setNumero(double numero);
}