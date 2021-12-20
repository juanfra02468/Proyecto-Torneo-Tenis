
/**
 * Write a description of class MedioGenerico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class MedioGenerico
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Constructor for objects of class MedioGenerico
     */
    public MedioGenerico(String nombre)
    {
        this.nombre=nombre;
    }

    public abstract void actualizar(Tenista ganador, Tenista perdedor, int ronda);
    
    public String getNombre()
    {
        return this.nombre;
    }
}
