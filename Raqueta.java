
/**
 * Write a description of interface Raqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Raqueta
{
    public double calcularPotencia(double longitud);
    
    public double calcularControl(double tamañoCabeza);
    
    public double calcularVelocidad(double peso);
    
    public String getModelo();
       
    public void setModelo(String modelo);
    
    public double getPeso();
    
    public void setPeso(double peso);
    
    public double getLongitud();
    
    public void setLongitud(double longitud);
    
    public double getTamañoCabeza();  
    
    public void setTamañoCabeza(double tamañoCabeza);
    
    public Encordado getEncordado();
   
    public void setEncordado(Encordado encordado);
    
    public String toString();

    public String getTipo();
}
