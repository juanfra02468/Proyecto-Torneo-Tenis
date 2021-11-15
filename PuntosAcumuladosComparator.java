import java.util.Comparator;  

/**
 * Comparador de puntos acumulados.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */


 /**
  * Metodo encargado de comparar los puntos acumulados de dos tenistas
  * @param t1 hace referencia a un tenista 
  * @param t2 hace referencia a un tenista 
  * @return si los puntos acumulados de ambos tenistas coincide devuelve el compareTo
  * del nombre de ambos , si los puntos acumulados del tenista1 es mayor que los puntos acumulados del tenista 2
  * devuelve 1 , y en caso contrario -1
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

