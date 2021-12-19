import java.util.HashMap;
import java.util.Map;
/**
 * Write a description of class TablasRaquetas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    
    public static Double getMapaLongitudPotencia(double longitud){
        return mapaLongitudPotencia.get((Double)longitud);
    }
    
    public static Double getMapaCabezaControl(double tamcabeza){
        return mapaCabezaControl.get((Double)tamcabeza);
    }

    public static Double getMapaPesoVelocidad(double peso){
        return mapaPesoVelocidad.get((Double)peso);
    }
    
}
