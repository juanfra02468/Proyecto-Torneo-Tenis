import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
/**
 * Abstract class RaquetaGenerica - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class RaquetaGenerica implements Raqueta
{
    // instance variables - replace the example below with your own
    private String modelo;
    private Encordado encordado;
    private int peso;
    private int longitud;
    private int tamañoCabeza;
    private static final Map<Integer, Integer> mapaLongitudPotencia = Map.of(
        680, 2, 
        690, 4, 
        700, 6, 
        720, 8, 
        740, 10
    );
    private static final Map<Integer, Integer> mapaCabezaControl = Map.of(
        600, 10, 
        630, 8, 
        650, 6, 
        680, 4, 
        720, 2
    );
    private static final Map<Integer, Integer> mapaPesoVelocidad = Map.of(
        220, 10, 
        260, 8, 
        300, 6, 
        320, 4, 
        340, 2
    );
    
    
    public RaquetaGenerica(String modelo, int peso, int longitud, int tamañoCabeza, Encordado encordado)
    {
        this.modelo = modelo;
        this.peso = peso;
        this.longitud = longitud;
        this.tamañoCabeza = tamañoCabeza;
        this.encordado = encordado;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public int getPeso(){
        return peso;
    }
    
    public void setPeso(int peso){
        this.peso = peso;
    }
    
    public int getLongitud(){
        return longitud;
    }
    
    public void setLongitud(int longitud){
        this.longitud = longitud;
    }
    
    public int getTamañoCabeza(){
        return tamañoCabeza;
    }
    
    public void setTamañoCabeza(int tamañoCabeza){
        this.tamañoCabeza = tamañoCabeza;
    }
    
   public Encordado getEncordado(){
        return encordado;
    }
    
    public void setEncordado(Encordado encordado){
        this.encordado = encordado;
    }
    
    public double calcularPotencia(int longitud){
        double potencia=(double)mapaLongitudPotencia.get((Integer)longitud);
        return potencia;
        }

     public double calcularControl(int TamCabeza){
         double control=(double)mapaCabezaControl.get((Integer)TamCabeza);
         return control;
         }
    
    public double calcularVelocidad(int peso){
     double velocidad=(double)mapaPesoVelocidad.get((Integer)peso);
     return velocidad;
     }
     
    public abstract String toString();        
          
}
