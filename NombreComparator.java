
/**
 * Write a description of class NombreComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;  
class NombreComparator implements Comparator<Tenista>{  
    public int compare(Tenista t1,Tenista t2){  
        return t1.getNombre().compareTo(t2.getNombre());  
    }  
}  