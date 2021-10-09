
/**
 * Write a description of class Tenista here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Tenista
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Zapatillas zapatilla;
    private double saque;
    private double resto;
    private int ranking;
    private String pais;
    private double puntosAcumulados;

    /**
     * Constructor for objects of class Tenista
     */
    public Tenista()
    {
        this.nombre = "";
        this.zapatilla =  new Zapatillas();
        this.saque = 0.0;
        this.resto = 0.0;
        this.ranking = 0;
        this.pais = "";
        this.puntosAcumulados = 0;
        
    }
    
    public Tenista(String nombre, Zapatillas zapatilla, double saque,
    double resto,int ranking, String pais)
    {
        this.nombre = nombre;
        this.zapatilla = zapatilla;
        this.saque = saque;
        this.resto = resto;
        this.ranking = ranking;
        this.pais = pais;
        this.puntosAcumulados = 0;
    }
    
    public void sacar()
    {   
        this.puntosAcumulados += zapatilla.calcularValorSaque(this.saque);
    }
       
    public void restar(Tenista t1)
    {
        if(this.zapatilla.calcularValorResto(this.resto) > t1.zapatilla.calcularValorSaque(t1.saque)){
            this.puntosAcumulados+= this.zapatilla.calcularValorResto(this.resto);
        }
    }
    
    public void mostrarTenista()
    {
        System.out.println("Tenista [nombre="+this.nombre+", saque="+this.saque+
        ", resto="+this.resto+", ranking="+this.ranking+", pais="+this.pais+"]");
        this.zapatilla.mostrarZapatilla();
    }
    
    public double getPuntosAcumulados()
    {
        return this.puntosAcumulados;
    }
     
    public void resetPuntosAcumulados()
    {
        this.puntosAcumulados = 0;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
}
