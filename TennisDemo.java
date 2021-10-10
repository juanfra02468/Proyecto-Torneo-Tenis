
/**
 * Clase que lanza la simulación del campeonato de tenis
 * 
 * @author David Bonilla, Antonio Javier Hidalgo y Juan Francisco García 
 * @version 1.0
 */

public class TennisDemo {
    /**
     * Main que se encarga de instanciar una variable campeonato, llama a la carga de datos y simula el campeonato
     */
    public static void main(String[] args) {
        //Creación del campeonato
        //Se instancia una variable de tipo Campeonato;
        Campeonato Campeonato1 = new Campeonato("Campeonato de Extremadura");
        
        //Carga de datos iniciales del campeonato
        //Se instancia una variable de tipo InitTennisData pasando la variable instanciada de tipo campeonato como parámetro;
        InitTennisData data = new InitTennisData(Campeonato1);
        
        //Llamada al método que inicia la simulación del campeonato
        Campeonato1.controlDeCampeonato();
        
    }
}
