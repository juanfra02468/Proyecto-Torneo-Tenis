
/**
 * Write a description of class PuntoAcumuladosComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;  
class PuntosAcumuladosComparator implements Comparator<Tenista>{  
    public int compare(Tenista t1, Tenista t2)
    {
        if(t1.getPuntosAcumulados()==t2.getPuntosAcumulados())
            return 0;
        else if (t1.getPuntosAcumulados()>t2.getPuntosAcumulados())
            return 1;
        else 
            return -1;
    }

}  

