import java.util.HashMap;
import java.util.Map;
/**
 * Tablas inmutables que contienen los valores de potencia, control y longitud
 * de las raquetas según su longitud, tamaño de cabeza y peso respectivamente.
 * 
 * @author David Bonilla
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @version 19-12-2021
 */
public class TablasRaquetas
{
    private static final Map<Double, Double> mapaLongitudPotencia = Map.of(
        680.0, 2.0, 
        690.0, 4.0, 
        700.0, 6.0, 
        720.0, 8.0, 
        740.0, 10.0
    );
    private static final Map<Double, Double> mapaCabezaControl = Map.of(
        600.0, 10.0, 
        630.0, 8.0, 
        650.0, 6.0, 
        680.0, 4.0, 
        720.0, 2.0
    );
    private static final Map<Double, Double> mapaPesoVelocidad = Map.of(
        220.0, 10.0, 
        260.0, 8.0, 
        300.0, 6.0, 
        320.0, 4.0, 
        340.0, 2.0
    );
    
    
    /**
     * Devuelve la potencia asociada a la raqueta según su longitud
     * @return potencia asociada a la raqueta según su longitud
     */
    public static Double getMapaLongitudPotencia(double longitud){
        Double potencia = mapaLongitudPotencia.get((Double)longitud);
        return potencia;
    }
    
    /**
     * Devuelve el control asociado a la raqueta según su tamaño de cabeza
     * @return control asociado a la raqueta según su tamaño de cabeza
     */
    public static Double getMapaCabezaControl(double tamcabeza){
        Double control = mapaCabezaControl.get((Double)tamcabeza);
        return control;
    }

    /**
     * Devuelve la velocidad asociada a la raqueta según su peso
     * @return velocidad asociada a la raqueta según su peso
     */
    public static Double getMapaPesoVelocidad(double peso){
        Double velocidad = mapaPesoVelocidad.get((Double)peso);
        return velocidad;
    }
    
}
