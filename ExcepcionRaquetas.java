
/**
 * Excepción usada en caso de falta de raquetas al inicio del campeonato.
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @version 19-12-2021
 */
public class ExcepcionRaquetas extends Exception
{
    public String toString(){
        return "CAMPEONATO SUSPENDIDO POR FALTA DE RAQUETAS";
    }
}
