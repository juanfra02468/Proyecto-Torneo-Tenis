import java.util.ArrayList;
import java.util.List;
import java.util.*;
/**
 * La clase Tenista representa los distintos tenistas que competirán en el campeonato
 * 
 * 
 * @author David Bonilla, Antonio Javier Hidalgo y Juan Francisco García 
 * @version 09-10-2021
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
     * Este constructor crea un nuevo objeto de la clase Tenista e invoca al constructor de la clase Zapatilla, con los valores pasados por parametro
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
     * Este método invoca al método calcularValorSaque de la clase Zapatilla y almacena el resultado en el campo puntosAcumulados
     */   
    private void sacar()
    {   
        this.puntosAcumulados += this.calcularSaque();
    }
    /**
     * Este método compara el resto de un tenista con el saque del otro, dependiendo del resultado, el tenista que resta puede aumentar sus puntos o no
     * @param t1 Hace referencia al Tenista que saca
     */        
    private void restar(Tenista t1)
    {
        if(this.calcularResto() > t1.calcularSaque ()){
            this.puntosAcumulados+= this.calcularResto ();
        }
    }
    
    
    private double calcularResto (){
        return zapatilla.calcularValorResto()*raqueta.calcularVelocidad(raqueta.getPeso())*raqueta.calcularControl(raqueta.getTamañoCabeza())*resto;
    }

    private double calcularSaque (){
        return raqueta.calcularVelocidad(raqueta.getPeso())*raqueta.calcularPotencia(raqueta.getLongitud())*zapatilla.calcularValorSaque()*saque;
    }
    
   public void jugar(Tenista t2)
    {
        this.sacar();
        t2.restar(this);
        t2.sacar();
        this.restar(t2);  
    }
    /**
     * Este método muestra todos los campos de un Tenista
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
     * Este método devuelve el valor del resto de un Tenista
     * @return Double, que hacer referencia al valor del resto del Tenista
     */     
    public double getResto()
    {
        return this.resto;
    }
    /**
     * Este método devuelve el valor del saque de un Tenista
     * @return Double, que hace referencia al valor del saque del Tenista
     */     
    public double getSaque()
    {
        return this.saque;
    }
    /**
     * Este método devuelve los puntos acumulados de un Tenista
     * @return Double, que hace referencia a los puntos acumulados de un Tenista
     */     
    public double getPuntosAcumulados()
    {
        return this.puntosAcumulados;
    }
    /**
     * Este método permite poner a 0 el campo puntos acumulados de un Tenista
     */        
    public void resetPuntosAcumulados()
    {
        this.puntosAcumulados = 0;
    }
    /**
     * Este método devuelve el nombre de un Tenista
     * @return String, que hace referencia al nombre de un Tenista
     */    
    public String getNombre()
    {
        return this.nombre;
    }
    /**
     * Este método permite cambiar la posicion de eliminado del Tenista
     * @param posEliminado hace referencia a la posicion de eliminado en el torneo 
     */     
    public void setposEliminado(int posEliminado){
        this.posEliminado = posEliminado;
    }
    /**
     * Este método devuelve la posicion de eliminacion del tenista
     * @return int, que hace referencia a la posicion en la que fue eliminado en el torneo
     */     
    public int getposEliminado()
    {
        return this.posEliminado;
    }
    /**
     * Este método devuelve el numero de pie de un Tenista
     * @return Double, que hace referencia al numero de pie de un Tenista
     */  
    public double getNumPie ()
    {
        return numPie;
    }
    /**
     * Este método permite cambiar la zapatilla del Tenista
     * @param  zapatilla hace referencia a la zapatilla que queremos que use el tenista ahora. 
     */  
    public void setZapatilla (Zapatilla zapatilla)
    {
        this.zapatilla = zapatilla;
    }
    /**
     * Este método devuelve la zapatilla usada por un tenista
     * @return Zapatilla, que hace referencia a la zapatilla usada por un tenista.
     */  
    public Zapatilla getZapatilla ()
    {
        return this.zapatilla;
    }
    /**
     * Este método permite cambiar el numero de pie de un tenista.
     * @param  numPie hace referencia al nuevo numero de pie del tenista.
     */  
    public void setNumPie (double numPie)
    {
        this.numPie = numPie;
    }
    /**
     * Este método devuelve la raqueta usada por un tenista
     * @return Raqueta, que hace referencia a la raqueta usada por un tenista.
     */  
    public Raqueta getRaqueta ()
    {
        return this.raqueta;
    }
    /**
     * Este método permite cambiar la raqueta de un tenista
     * @param raqueta hace referencia a la nueva raqueta que queremos que use el tenista. 
     */  
    public void setRaqueta (Raqueta raqueta)
    {
        this.raqueta = raqueta;
    }
    /**
     * Este método realiza la asignacion de una zapatilla a un tenista dependiendo de su numero de pie en el Campeonato.
     * @param zapatillasCampeonato hace referencia a la lista de Zapatillas que pueden elegir los tenistas en el campeonato.
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
}
