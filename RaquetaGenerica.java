import java.util.HashMap;
import java.util.Map;
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
        double potencia = 0.0;
        switch (longitud)
        {
            case 680 :
                potencia = 2;
                break;
            case 690 :
                potencia = 4;
                break;
            case 700 :
                potencia = 6;
                break;
            case 720 :
                potencia = 8;
                break;
            case 740 :
                potencia = 10;
                break;
        }
        return potencia;
    }

    public double calcularControl(int tamañoCabeza){
        double control = 0.0;
        switch (tamañoCabeza)
        {
            case 600 :
                control = 10;
                break;
            case 630 :
                control = 8;
                break;
            case 650 :
                control = 6;
                break;
            case 680 :
                control = 4;
                break;
            case 720 :
                control = 2;
                break;
        }
        return control;
    }
    
    public double calcularVelocidad(int peso){
        double velocidad = 0;
        switch (peso)
        {
            case 220 :
                velocidad = 10;
                break;
            case 260 :
                velocidad = 8;
                break;
            case 300 :
                velocidad = 6;
                break;
            case 320 :
                velocidad = 4;
                break;
            case 340 :
                velocidad = 2;
                break;
        }
        return velocidad;
    }
          
}
