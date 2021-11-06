

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
    
    public abstract double calcularValorSaque(double saque);
    
    public abstract double calcularValorResto(double resto);
    
    public abstract void mostrarZapatilla();
    
}