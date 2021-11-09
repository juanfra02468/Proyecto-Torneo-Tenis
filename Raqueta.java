
/**
 * Write a description of interface Raqueta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Raqueta
{
    public double calcularPotencia(int longitud);
    
    public double calcularControl(int tamañoCabeza);
    
    public double calcularVelocidad(int peso);
    
    public String getModelo();
       
    public void setModelo(String modelo);
    
    public int getPeso();
    
    public void setPeso(int peso);
    
    public int getLongitud();
    
    public void setLongitud(int longitud);
    
    public int getTamañoCabeza();  
    
    public void setTamañoCabeza(int tamañoCabeza);
    
    public Encordado getEncordado();
   
    public void setEncordado(Encordado encordado);

}
