
/**
 * Comparador de potencia de raquetas.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 */
import java.util.*;  
class PotenciaComparator implements Comparator<Raqueta>{  
       public int compare(Raqueta r1, Raqueta r2){
        
            if(r1.calcularPotencia()==r2.calcularPotencia())
                return r2.getModelo().compareTo(r1.getModelo());
            else if (r1.calcularPotencia()>r2.calcularPotencia())
                return -1;
            else 
                return 1;
        

    } 

}  






