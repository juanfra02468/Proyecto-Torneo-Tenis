import java.util.Comparator;  

/**
 * Comparador de potencia de raquetas.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

 /**
  * Metodo encargado de comparar la potencia de una raqueta
  * @param r1 hace referencia a una raqueta 
  * @param t2 hace referencia a una raqueta
  * @return si la potencia de la raqueta 1 coincide con la raqueta 2 devuelve el compareTo
  * entre los modelos de ambas raquetas, si la potencia de la raqueta 1 es mayor que la potencia 
  * de la raqueta 2 devuelve 1 , y en caso contrario -1
  */
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






