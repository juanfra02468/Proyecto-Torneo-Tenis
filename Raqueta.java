
/**
 * Write a description of interface Raqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Raqueta
{
    public abstract double calcularPotencia(int longitud);
    
    public abstract double calcularControl(int tamañoCabeza);
    
    public abstract double calcularVelocidad(int peso);
    
    public String getModelo();
       
    public void setModelo(String modelo);
    
    public double getPeso();
    
    public void setPeso(int peso);
    
    public double getLongitud();
    
    public void setLongitud(int longitud);
    
    public double getTamañoCabeza();  
    
    public void setTamañoCabeza(int tamañoCabeza);
    
    public Encordado getEncordado();
   
    public void setEncordado(Encordado encordado);

}
