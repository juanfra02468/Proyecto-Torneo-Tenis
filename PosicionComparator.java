import java.util.Comparator;

/**
 * Comparador de posicion de eliminado.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

 /**
  * Metodo encargado de comparar la posicion del tenista cuando se elimina
  * @param t1 hace referencia a un tenista eliminado
  * @param t2 hace referencia a un tenista eliminado
  * @return si la posicion de eliminados de ambos tenistas coincide devuelve el compareto
  * del nombre de ambos , si la posicion del tenista1 es mayor que la posicion del tenista 2
  * devuelve 1 , y en caso contrario -1
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

