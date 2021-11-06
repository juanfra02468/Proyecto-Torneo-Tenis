
/**
 * Enumeration class Encordado - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Encordado
{
    ABIERTO (2.0, 2.2), CERRADO (1.8, 2.5);
    
    private final double multiplicadorPotencia;
    private final double multiplicadorControl;
    
    Encordado (double multiplicadorPotencia, double multiplicadorControl){
        this.multiplicadorPotencia = multiplicadorPotencia;
        this.multiplicadorControl = multiplicadorControl;
    }
    
    public double getMultiplicadorPotencia(){
        return multiplicadorPotencia;
    }
    
    public double getMultiplicadorControl(){
        return multiplicadorControl;
    }
}
