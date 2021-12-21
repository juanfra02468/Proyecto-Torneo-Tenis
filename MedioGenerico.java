
/**
 * Clase que representa la superclase MedioGenerico.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 19-12-2021
 */
public abstract class MedioGenerico
{
    // instance variables - replace the example below with your own
    private String nombre;

    /**
     * Contructor de la clase MedioGenerico 
     * @param el nombre del medio
     */
    public MedioGenerico(String nombre)
    {
        this.nombre=nombre;
    }
    
    /**
     * Contructor de la clase MedioGenerico 
     * @param el tenista ganador
     * @param el tenista perdedor
     * @param la ronda en la que se encuentran
     */
    public abstract void actualizar(Tenista ganador, Tenista perdedor, int ronda);
    
    /**
     * Devuelve el nombre del medio 
     * @return el nombre del medio
     */    
    public String getNombre()
    {
        return this.nombre;
    }
}
