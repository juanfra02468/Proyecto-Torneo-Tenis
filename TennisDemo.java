
/**
 * Clase que lanza la simulación del campeonato de tenis.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 */

public class TennisDemo {
    /**
     * Main que se encarga de instanciar una variable campeonato, llama a la carga de datos y 
     * simula el campeonato
     */
    public static void main(String[] args) throws ExcepcionRaquetas {
        //Creación del campeonato
        //Se instancia una variable de tipo Campeonato;
        Campeonato Campeonato1 = Campeonato.getInstance("Campeonato de Extremadura");
        
        //Carga de datos iniciales del campeonato
        //Se instancia una variable de tipo InitTennisData pasando la variable instanciada 
        //de tipo campeonato como parámetro;
        InitTennisData data = new InitTennisData(Campeonato1);
        
        //Llamada al método que inicia la simulación del campeonato
        Campeonato1.controlDeCampeonato();
        
    }
}
