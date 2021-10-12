
/**
 * Write a description of class PosicionComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;  
class PosicionComparator implements Comparator<Tenista>{  
    public int compare(Tenista t1, Tenista t2)
    {
        if(t1.getposEliminado()==t2.getposEliminado())
            return t1.getNombre().compareTo(t2.getNombre());
        else if (t1.getposEliminado()>t2.getposEliminado())
            return 1;
        else 
            return -1;
    }
}  

