import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Iterator;

/**
 * La clase Campeonato representa el torneo que se va a disputar entre los distintos 
 * tenistas que participan.
 * 
 * @author Antonio Javier Hidalgo
 * @author Juan Francisco García
 * @author David Bonilla
 * @version 13-11-2021
 * 
 */

public class Campeonato
{
    private String nombre;
    private ArrayList <Tenista> competidores;
    private ArrayList <Tenista> eliminados;
    private ArrayList <Zapatilla> zapatillasCampeonato;
    private TreeSet <Raqueta> raquetasCampeonato;
    private Comunicacion comunicacion;
    private static Campeonato singletonCampeonato;
    
    /**
     * Constructor parametrizado de la clase Campeonato
     * Crea un nuevo objeto de la clase Campeonato 
     */ 
    private Campeonato(String nombre)
    {
        this.nombre = nombre;
        competidores = new ArrayList <Tenista>();
        eliminados = new ArrayList <Tenista>();
        zapatillasCampeonato = new ArrayList <Zapatilla>();
        comunicacion = new Comunicacion();
        raquetasCampeonato = new TreeSet <Raqueta> (new PotenciaComparator());
    }
    
    /**
     * Método que impide crear mas de un campeonato con el mismo nombre 
     * @param nombre nombre del campeonato
     */
    public static synchronized Campeonato getInstance(String nombre)
    {
        if(singletonCampeonato == null){
            singletonCampeonato = new Campeonato(nombre);
        }
        return singletonCampeonato;
    }
    
    /**
     * Método que inscribe a un Tenista al campeonato, añadiendolo a la lista de competidores
     * @param t1 un tenista
     */
    public void inscripcionCompetidores (Tenista t1)
    {
        competidores.add(t1);
    }
    
    /**
     * Método que añade una zapatilla a la lista zapatillas
     * @param z1 una zapatilla
     */
    public void añadirZapatilla (Zapatilla z1)
    {
        zapatillasCampeonato.add(z1);
    }
    
    /**
     * Método que añade una raqueta al arbol de raquetas
     * @param una raqueta
     */
    public void añadirRaquetas (Raqueta r1)
    {
        raquetasCampeonato.add(r1);
    }
    
     /**
     * Metodo encargado de asignar las raquetas a los competidores
     * @return verdadero si se ha asignado una raqueta y falso en caso contrario
     */
    public boolean asignarRaquetas (){
        boolean bandera=false;
        System.out.println("***** Asignando raquetas a tenistas *****");
        if (raquetasCampeonato.size()>=competidores.size()){
            bandera=true;
                for (int i = 0; i<competidores.size(); i++){
                        Tenista t = competidores.get(i);
                        t.setRaqueta(raquetasCampeonato.first());
                        raquetasCampeonato.remove(raquetasCampeonato.first());
                }
            }
        
        return bandera;
    }
    
    /**
     * Método que muestra por pantalla el avance de los partidos, las rondas, 
     * quién ha ganado y el listado de eliminados
     */
    public void controlDeCampeonato() throws ExcepcionRaquetas
    {
        System.out.println("***** Inicio del campeonato: "+nombre+" *****\n");
        if (asignarRaquetas()){
            mostrarRaquetas();
            int i = 1;
            System.out.println("***** Listado de competidores: ");
            listaTenistas_competidores();
            System.out.println("***** Listado de raquetas disponibles: ");
            raquetasDisponibles();
            while(competidores.size() != 1){
               System.out.println("\n"); 
               System.out.println("***** Ronda---->>>: "+i);
               partidos(i);
               i++;
            }
            
            Tenista ganador = competidores.get(0);
            mostrarganadorTorneo(ganador);
            System.out.println("***** Listado de eliminados: ");
            Collections.sort(eliminados, Collections.reverseOrder(new PosicionComparator()));
            listaTenistas_eliminados();
        }
        else{
            throw new ExcepcionRaquetas(); //Excepcion que salta cuando hay más jugadores 
                                           //que raquetas          
        } 
    }
    
    /**
     * Método que gestiona la puntuacion de los tenistas tras los partidos y muestra por 
     * pantalla quién ha ganado y quién ha perdido
     */
    public void partidos(int ronda)
    {   
        Tenista t1;
        Tenista t2;
        Tenista ganador;
        Tenista perdedor;
        for(int i = 0; i<competidores.size(); i++){
           t1 = competidores.get(i);
           t2 = competidores.get(competidores.size()-1);
           
           System.out.println("  #### Juego ------------>>>: "+i);
           juego(t1, t2);
           //LLAMADA A LOS MEDIOS
           comunicacion.notificar(t1,t2,ronda);
           
           if(t1.getPuntosAcumulados()==t2.getPuntosAcumulados())
           {
               if((t1.getSaque()+t1.getResto())<(t2.getSaque()+t2.getResto())){
                    ganaPrimero(t1,t2);                  
               }
               else{
                    ganaUltimo(t2,t1,i);                  
               }
           }
           else if(t1.getPuntosAcumulados() > t2.getPuntosAcumulados()){
                    ganaPrimero(t1,t2);
           }
           
           else{
                    ganaUltimo(t2,t1,i);                    
           }  
        }
    }
    
    /**
     * Método que simula un partido entre dos tenistas
     * @param t1 un tenista
     * @param t2 un tenista
     */  
    private void juego(Tenista t1, Tenista t2)
    {
        System.out.println("    ## Tenista1 "+t1.tipoTenista()+" ---->>>: "+t1.getNombre());
        comprobacionMostrarZapatilla(t1);
        System.out.println("    ## Tenista2 "+t2.tipoTenista()+"---->>>: "+t2.getNombre());
        comprobacionMostrarZapatilla(t2);
        t1.jugar(t2);
        t2.jugar(t1);
        mostrarCambioRaqueta(t1);
        mostrarCambioRaqueta(t2);
    }
    
    /**
     * Método que muestra el ganador y perdedor en el caso de que gane el primer tenista 
     * situado en la lista
     */
    private void ganaPrimero(Tenista ganador, Tenista perdedor)
    {
       añadirEliminado(perdedor);        
       borrarUltimoymostrar(ganador, perdedor);
    }
    
    /**
     * Metodo que añade a la lista de eliminados al tenista perdedor 
     * eliminandolo del campeonato, añade a la lista de competidores al ganador y 
     * muestra llamando a GanadorYperdedor
     * @param ganador El Tenista que gana el partido
     * @param perdedor El Tenista que pierde el partido
     * @param indice La posicion del tenista que se va a borrar.
     */
    private void ganaUltimo(Tenista ganador, Tenista perdedor, int indice)
    {
       añadirEliminado(perdedor);
       competidores.remove(indice);
       competidores.add(indice, ganador);
       borrarUltimoymostrar(ganador, perdedor);       
    }
    
    /**
     * Método que muestra las Raquetas que llevarán los jugadores en el siguiente partido, 
     * puede ser la misma Raqueta o no
     */
    
    private void mostrarCambioRaqueta(Tenista t){
        System.out.println("       "+t.getNombre()+" cambia su raqueta por: "+
                           t.getRaqueta().mostrarRaquetaCambiada());
    }
    
    /**
     * Método que muestra el ganador del torneo
     * @param ganador El tenista ganador
     */
    private void mostrarganadorTorneo (Tenista ganador)
    {
        System.out.println("\n");
        System.out.println("---->>>>  Gana la competición:"+ganador.toString()+"  <<<<----"); 
        System.out.println("\n"); 
    }
    
    /**
     * Método que muestra las nuevas zapatillas del Tenista en caso de que cambie las suyas
     * @param t1 un Tenista
     */
    private void comprobacionMostrarZapatilla (Tenista t1){
       if (t1.elegirZapatillaTenista()){
            System.out.println("       Zapatillas asignadas: "+t1.getZapatilla().toString());
        }        
    }
    
    /**
     * Método que añade un Tenista a la lista de eliminados
     * @param perdedor un tenista que ha perdido
     */
    private void añadirEliminado(Tenista perdedor){
       eliminados.add(perdedor);
       perdedor.setposEliminado(eliminados.size());        
    }
    
    /**
     * Método que borra el último jugador de la lista de competidores y muestra el
     * ganador y perdedor de cada partido
     * @param un Tenista ganador
     * @param un Tenista perdedor
     */
    private void borrarUltimoymostrar (Tenista ganador, Tenista perdedor){
       competidores.remove(competidores.size()-1);
       mostrarGanadoryPerdedor(ganador, perdedor);        
    }
    
    /**
     * Metodo que imprime por pantalla la informacion referida a el tenista ganador y 
     * al perdedor siendo esta , el nombre y los puntos acumulados
     * @param ganador hace referencia al Tenista que gana el partido
     * @param perdedor hace referencia al Tenista que pierde el partido
     */
    private void mostrarGanadoryPerdedor(Tenista ganador, Tenista perdedor)
    {
       System.out.println("    ## Gana este juego: "+ganador.getNombre()+" con: "
       +ganador.getPuntosAcumulados()+" puntos acumulados.");
    
       System.out.println("    ## Se elimina: "+perdedor.getNombre()+" con: "
       +perdedor.getPuntosAcumulados()+" puntos acumulados. Tenista eliminado num: "
       +eliminados.size() + "\n");
       ganador.resetPuntosAcumulados();        
    }
    
    /**
     * Método encargado de mostrar las raquetas asignadas a tenistas
     */
    public void mostrarRaquetas(){
        for(Tenista tenistas: competidores)
        {
            System.out.println("   **     "+tenistas.getRaqueta().toString()+ 
                               " asignada a -->> "+tenistas.getNombre());
        }        
    }
    
    /**
     * Método encargado de mostrar la lista de tenistas que compiten en el campeonato
     */
    private void listaTenistas_competidores ()
    {
        for(Tenista tenistas: competidores)
        {
             System.out.println(tenistas.toString());
        }
    }
    
    /**
     * Método encargado de mostrar las raquetas disponibles del campeonato
     */
    private void raquetasDisponibles(){
        for(Raqueta raqueta: raquetasCampeonato)
        {
             System.out.println("      "+raqueta.toString());
        }  
    }
    
    /**
     * Método encargado de mostrar la lista de tenistas eliminados en el campeonato
     */
    private void listaTenistas_eliminados ()
    {
        for(Tenista tenistas: eliminados)
        {
             System.out.println(tenistas.toString());
        }
    }
    
    /**
     * Método encargado de borrar una Zapatilla de la lista de zapatillas
     */
    public void borrarZapatilla(Zapatilla z)
    {
        zapatillasCampeonato.remove(z);
    }
    
    /**
     * Método encargado de borrar una Raqueta del treeset de raquetas
     */
    public void borrarRaqueta(Raqueta r)
    {
        raquetasCampeonato.remove(r);
    }
    
    /**
     * Método que realiza una copia de la lista de competidores
     */
    public ArrayList getCompetidores()
    {
        ArrayList <Tenista> copiaCompetidores = new ArrayList<Tenista>(competidores);
        return copiaCompetidores;
    }
    
    /**
     * Método que realiza una copia de la lista de zapatillas
     */
    public ArrayList getZapatillasCampeonato()
    {
        ArrayList <Zapatilla> copiaZapatillas = new ArrayList<Zapatilla>(zapatillasCampeonato);
        return copiaZapatillas;
    }
    
    /**
     * Método que hace una copia del treeset de raquetas
     */
    public TreeSet getRaquetasCampeonato()
    {
        TreeSet <Raqueta> copiaRaquetas = new TreeSet<Raqueta>(raquetasCampeonato);
        return copiaRaquetas;
    }
    
    /**
     * Devuelve el nombre de un Campeonato
     * @return el nombre de un campeonato
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Método que hace un reset de todas las listas y treeset del campeonato y 
     * finaliza la instancia campeonato
     */
    
    public void reset () throws Throwable 
    {
        competidores.clear();
        zapatillasCampeonato.clear();
        raquetasCampeonato.clear();
        eliminados.clear();
        singletonCampeonato.finalize();
    }
}