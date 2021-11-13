import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * La clase Tenista representa los distintos tenistas que competirán en el campeonato
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public class Tenista
{
    // instance variables - replace the example below with your own
    private String nombre;
    private Zapatilla zapatilla;
    private double saque;
    private double resto;
    private int ranking;
    private String pais;
    private double puntosAcumulados;
    private int posEliminado;
    private double numPie;
    private Raqueta raqueta;

    /**
     * Constructor parametrizado de la clase Tenista
     * Crea un nuevo objeto de la clase Tenista e invoca al constructor de la clase Zapatilla,
     * con los valores pasados por parametro
     */     
    public Tenista(String nombre, ZapatillaGenerica zapatilla, double saque,
    double resto,int ranking, String pais, double numPie)
    {
        this.nombre = nombre;
        this.zapatilla = zapatilla;
        this.saque = saque;
        this.resto = resto;
        this.ranking = ranking;
        this.pais = pais;
        this.puntosAcumulados = 0;
        this.numPie = numPie;
        this.raqueta = null;
    }
    /**
     * Invoca al método calcularValorSaque de la clase Zapatilla y suma el resultado 
     * al campo puntosAcumulados
     */   
    private void sacar()
    {   
        this.puntosAcumulados += this.calcularSaque();
    }
    /**
     * Compara el resto de un tenista con el saque del otro, dependiendo del resultado, 
     * el tenista que resta puede aumentar sus puntos o no
     * @param t1 tenista contrario al que resta
     */        
    private void restar(Tenista t1)
    {
        if(this.calcularResto() > t1.calcularSaque ()){
            this.puntosAcumulados+= this.calcularResto ();
        }
    }
    
    /**
     * Calcula el valor de resto del tenista según su zapatilla y raqueta
     * @return valor del resto de un tenista según su zapatilla y raqueta
     */
    private double calcularResto (){
        return zapatilla.calcularValorResto()*raqueta.calcularVelocidad()*
        raqueta.calcularControl()*resto;
    }

    /**
     * Calcula el valor de saque del tenista según su zapatilla y raqueta
     * @return valor de saque del tenista según su zapatilla y raqueta
     */
    private double calcularSaque (){
        return raqueta.calcularVelocidad()*raqueta.calcularPotencia()*
        zapatilla.calcularValorSaque()*saque;
    }
    
    /**
     * Simula un partido entre dos tenistas
     * @param t2 el tenista contrincante
     */
    public void jugar(Tenista t2)
    {
        this.sacar();
        t2.restar(this);
        t2.sacar();
        this.restar(t2);  
    }
    
    /**
     * Devuelve una cadena con todos los campos de un Tenista
     * @return cadena con todos los campos de un Tenista
     */         
       public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("**  Tenista [nombre=");
        builder.append(this.nombre);
        builder.append(", saque=");
        builder.append(this.saque);
        builder.append(", resto=");
        builder.append(this.resto);
        builder.append(", ranking=");
        builder.append(this.ranking);
        builder.append(", pais=");
        builder.append(this.pais);
        builder.append(", número pie=");
        builder.append(this.numPie+"]");
        builder.append("\n");
        builder.append(this.zapatilla.toString());
        return builder.toString();
    }
    /**
     * Devuelve el nombre de un Tenista
     * @return el nombre de un Tenista
     */    
    public String getNombre()
    {
        return this.nombre;
    }
    /**
     * Permite cambiar el nombre de un Tenista
     * @param nombre El nuevo nombre del Tenista
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    /**
     * Devuelve el valor del resto de un Tenista
     * @return el valor del resto del Tenista
     */     
    public double getResto()
    {
        return this.resto;
    }
    /**
     * Permite cambiar el resto de un Tenista
     * @param nombre El nuevo resto del Tenista
     */
    public void setResto(double resto)
    {
        this.resto = resto;
    }
    /**
     * Devuelve el valor del saque de un Tenista
     * @return el valor del saque del Tenista
     */     
    public double getSaque()
    {
        return this.saque;
    }
    /**
     * Permite cambiar el saque de un Tenista
     * @param nombre El nuevo saque del Tenista
     */
    public void setSaque(double saque)
    {
        this.saque = saque;
    }
    /**
     * Devuelve los puntos acumulados de un Tenista
     * @return los puntos acumulados de un Tenista
     */     
    public double getPuntosAcumulados()
    {
        return this.puntosAcumulados;
    }
    /**
     * Permite cambiar los puntosAcumulados de un Tenista
     * @param nombre Nuevos puntosAcumulados del Tenista
     */
    public void setPuntosAcumulados(double puntosAcumulados)
    {
        this.puntosAcumulados = puntosAcumulados;
    }
    /**
     * Permite poner a 0 el campo puntos acumulados de un Tenista
     */        
    public void resetPuntosAcumulados()
    {
        this.puntosAcumulados = 0;
    }
    /**
     * Devuelve la posicion de eliminado de un Tenista
     * @return la posicion de eliminado de un Tenista
     */     
    public int getPosEliminado()
    {
        return this.posEliminado;
    }
    /**
     * Permite cambiar la posicion de eliminado del Tenista
     * @param posEliminado posicion de eliminado en el torneo 
     */     
    public void setposEliminado(int posEliminado){
        this.posEliminado = posEliminado;
    }
    /**
     * Devuelve el ranking de un Tenista
     * @return el ranking de un Tenista
     */     
    public int getRanking()
    {
        return this.ranking;
    }
    /**
     * Permite cambiar el ranking de eliminado del Tenista
     * @param ranking el ranking un tenista
     */     
    public void setRanking(int ranking){
        this.ranking = ranking;
    }
    /**
     * Devuelve el numero de pie de un Tenista
     * @return el numero de pie de un Tenista
     */  
    public double getNumPie ()
    {
        return numPie;
    }
    /**
     * Permite cambiar la posicion de eliminado del Tenista
     * @param posEliminado posicion de eliminado en el torneo 
     */     
    public void setNumPie(double numPie){
        this.numPie = numPie;
    }
    /**
     * Devuelve la zapatilla usada por un tenista
     * @return zapatilla usada por un tenista
     */  
    public Zapatilla getZapatilla ()
    {
        return this.zapatilla;
    }
    /**
     * Permite cambiar la zapatilla del Tenista
     * @param  zapatilla zapatilla que queremos que use el tenista ahora
     */  
    public void setZapatilla (Zapatilla zapatilla)
    {
        this.zapatilla = zapatilla;
    }    
    /**
     * Devuelve la raqueta usada por un tenista
     * @return la raqueta usada por un tenista.
     */  
    public Raqueta getRaqueta ()
    {
        return this.raqueta;
    }
    /**
     * Permite cambiar la raqueta de un tenista
     * @param raqueta la nueva raqueta que queremos que use el tenista. 
     */  
    public void setRaqueta (Raqueta raqueta)
    {
        this.raqueta = raqueta;
    }
    /**
     * Devuelve el pais de un tenista
     * @return el pais de un tenista.
     */  
    public String getPais()
    {
        return pais;
    }
    /**
     * Permite cambiar el pais de un Tenista
     * @param nombre El nuevo pais del Tenista
     */
    public void setPais(String pais)
    {
        this.pais = pais;
    }
    
    
    /**
     * Realiza la asignacion de una zapatilla a un tenista dependiendo de su numero de pie 
     * en el Campeonato.
     * @param zapatillasCampeonato Lista de Zapatillas que pueden elegir los tenistas 
     * en el campeonato.
     */  
    public boolean elegirZapatillaTenista (ArrayList <Zapatilla> zapatillasCampeonato){
        boolean bandera = false;
            Iterator <Zapatilla> it = zapatillasCampeonato.iterator();
            while(it.hasNext() && !bandera){
                Zapatilla z = it.next();
                    if (this.getNumPie()==z.getNumero()){
                        this.setZapatilla(z);
                        zapatillasCampeonato.remove(z);
                        bandera=true;
                    }
                }
                return bandera;
    }
    
    public boolean equals(Object obj)
    {
        if(this == obj){
            return true; 
        }
        if(!(obj instanceof Tenista)){
            return false; 
        }
        
        Tenista other = (Tenista) obj;
        
        return getNombre().equals(other.getNombre()) && getZapatilla().equals(other.getZapatilla()) && 
                getSaque()==other.getSaque() && getResto()==other.getResto() && getRanking()==other.getRanking()
                && getPais().equals(other.getPais()) && getPuntosAcumulados()==other.getPuntosAcumulados() &&
                getPosEliminado()==other.getPosEliminado() && getNumPie()==other.getNumPie() &&
                getRaqueta().equals(other.getRaqueta());
    }
}
