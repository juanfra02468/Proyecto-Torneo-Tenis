import java.util.Comparator;  

/**
 * Comparador de puntos acumulados.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

class PuntosAcumuladosComparator implements Comparator<Tenista>{  
    public int compare(Tenista t1, Tenista t2)
    {
        if(t1.getPuntosAcumulados()==t2.getPuntosAcumulados())
            return t1.getNombre().compareTo(t2.getNombre());
        else if (t1.getPuntosAcumulados()>t2.getPuntosAcumulados())
            return 1;
        else 
            return -1;
    }

}  

