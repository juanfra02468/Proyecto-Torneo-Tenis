import java.util.Comparator;

/**
 * Comparador de posicion de eliminado.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */
 
class PosicionComparator implements Comparator<Tenista>{  
    public int compare(Tenista t1, Tenista t2)
    {
        if(t1.getPosEliminado()==t2.getPosEliminado())
            return t1.getNombre().compareTo(t2.getNombre());
        else if (t1.getPosEliminado()>t2.getPosEliminado())
            return 1;
        else 
            return -1;
    }
}  

