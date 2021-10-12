
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
    private Zapatillas zapatilla;
    private double saque;
    private double resto;
    private int ranking;
    private String pais;
    private double puntosAcumulados;
    private int posEliminado;

    /**
     * Constructor por defecto de la clase Tenista
     * Este constructor crea un nuevo objeto de la clase Tenista e invoca al constructor de clase zapatilla
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
        this.posEliminado = 0;
        
    }
    /**
     * Constructor parametrizado de la clase Tenista
     * Este constructor crea un nuevo objeto de la clase Tenista e invoca al constructor de la clase Zapatilla, con los valores pasados por parametro
     */     
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
    /**
     * Este método invoca al método calcularValorSaque de la clase Zapatilla y almacena el resultado en el campo puntosAcumulados
     */   
    public void sacar()
    {   
        this.puntosAcumulados += zapatilla.calcularValorSaque(this.saque);
    }
    /**
     * Este método compara el resto de un tenista con el saque del otro, dependiendo del resultado, el tenista que resta puede aumentar sus puntos o no
     * @param t1 Hace referencia al Tenista que saca
     */        
    public void restar(Tenista t1)
    {
        if(this.zapatilla.calcularValorResto(this.resto) > t1.zapatilla.calcularValorSaque(t1.saque)){
            this.puntosAcumulados+= this.zapatilla.calcularValorResto(this.resto);
        }
    }
    /**
     * Este método muestra todos los campos de un Tenista
     */     
    public void mostrarTenista()
    {
        System.out.println("Tenista [nombre="+this.nombre+", saque="+this.saque+
        ", resto="+this.resto+", ranking="+this.ranking+", pais="+this.pais+"]");
        this.zapatilla.mostrarZapatilla();
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
}
