
/**
 * Write a description of class PuntoAcumuladosComparator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;  
class PotenciaComparator implements Comparator<Raqueta>{  
    public int compare(Raqueta r1, Raqueta r2)
    {
        if(r1.calcularPotencia(r1.getLongitud())==r2.calcularPotencia(r2.getLongitud()))
            return r1.getModelo().compareTo(r2.getModelo());
        else if (r1.calcularPotencia(r1.getLongitud())>r2.calcularPotencia(r2.getLongitud()))
            return 1;
        else 
            return -1;
    }

}  
