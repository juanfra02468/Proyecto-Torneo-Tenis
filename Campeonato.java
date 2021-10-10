
/**
 * Write a description of class Campeonato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.*;


public class Campeonato
{
    private String nombre;
    private ArrayList <Tenista> competidores;
    private ArrayList <Tenista> eliminados;
    
    /**
     * Constructor for objects of class Campeonato
     */
    public Campeonato(String nombre)
    {
        this.nombre = nombre;
        competidores = new ArrayList <Tenista>();
        eliminados = new ArrayList <Tenista>();
    }
    /**
     * 
     */
    public void inscripcion (Tenista t1)
    {
        competidores.add(t1);
    }
        
    public void juego(Tenista t1, Tenista t2)
    {
        System.out.println("## Tenista1 ---->>>: "+t1.getNombre());
        System.out.println("## Tenista2 ---->>>: "+t2.getNombre());
        t1.sacar();
        t2.restar(t1);
        t2.sacar();
        t1.restar(t2);
        
    }
    
    public void controlDeCampeonato()
    {
        int i = 1;
        System.out.println("***** Inicio del campeonato: "+nombre+" *****\n");
        System.out.println("***** Listado de competidores: ");
        listaTenistas_competidores();
        while(competidores.size() != 1){
           System.out.println("\n"); 
           System.out.println("***** Ronda---->>>: "+i);
           i++;
           partidos();
        }
        
        Tenista ganador = competidores.get(0);
        mostrarganadorTorneo(ganador);
        System.out.println("***** Listado de eliminados: ");
        listaTenistas_eliminados();
    
    }
    
    public void mostrarganadorTorneo (Tenista ganador)
    {
        System.out.println("\n");
        System.out.println("---->>>> Gana la competición:"); 
        ganador.mostrarTenista();
        System.out.println("\n"); 
    }
    
    public void partidos()
    {   
        Tenista t1;
        Tenista t2;
        Tenista ganador;
        Tenista perdedor;
        for(int i = 0; i<competidores.size(); i++){
           t1 = competidores.get(i);
           t2 = competidores.get(competidores.size()-1);
           
           System.out.println("### Juego ------------>>>: "+i);
           juego(t1, t2);
           
           
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
    
    public void ganaPrimero(Tenista ganador, Tenista perdedor)
    {
       eliminados.add(perdedor);
       competidores.remove(competidores.size()-1);
       mostrarGanadoryPerdedor(ganador, perdedor);
    }
    
    public void ganaUltimo(Tenista ganador, Tenista perdedor, int indice)
    {
       eliminados.add(perdedor);
       competidores.remove(indice);
       competidores.add(indice, ganador);
       competidores.remove(competidores.size()-1);
       mostrarGanadoryPerdedor(ganador, perdedor);
    }
    
    public void mostrarGanadoryPerdedor(Tenista ganador, Tenista perdedor)
    {
       System.out.println("## Gana este juego: "+ganador.getNombre()+" con: "
       +ganador.getPuntosAcumulados()+" puntos acumulados.");
    
       System.out.println("## Se elimina: "+perdedor.getNombre()+" con: "
       +perdedor.getPuntosAcumulados()+" puntos acumulados. Tenista eliminado num: "+eliminados.size());
       ganador.resetPuntosAcumulados();        
    }
    
    public void listaTenistas_competidores ()
    {
        for(Tenista tenistas: competidores)
        {
            tenistas.mostrarTenista();
        }
    }
    public void listaTenistas_eliminados ()
    {
        for(Tenista tenistas: eliminados)
        {
            tenistas.mostrarTenista();
        }
    }
    
}