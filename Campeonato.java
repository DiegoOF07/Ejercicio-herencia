/**
 * @author: Diego Oswaldo Flores 23714
 * @version: 24/09/2023b
 * 
 * Esta clase es el controlador que se encarga de hacer todos los calculos y almacenar
 * a los diferentes jugadores
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Campeonato {
    private ArrayList<Portero> porteros;
    private ArrayList<Extremo> extremos;

    public Campeonato(){
        porteros = new ArrayList<Portero>();
        extremos = new ArrayList<Extremo>();
    }

    
    /** 
     * @param nombre
     * @param pais
     * @param faltas
     * @param golesDirectos
     * @param totalLanzamientos
     * @param paradasEfectivas
     * @param golesRecibidos
     */
    public void agregarPortero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int paradasEfectivas, int golesRecibidos){
        if(!nombre.isEmpty() && !pais.isEmpty()){
            if(faltas>=0 && golesDirectos>=0 && totalLanzamientos>=0 && paradasEfectivas>=0 && golesRecibidos>=0){
                porteros.add(new Portero(nombre, pais, faltas, golesDirectos, totalLanzamientos, paradasEfectivas, golesRecibidos));
            }else{
                System.out.println("Las estadisticas del jugador no pueden ser negativas");
            }
        }else{
            System.out.println("El nombre y el pais no pueden estar vacios");
        }
    }

    
    /** 
     * @param nombre
     * @param pais
     * @param faltas
     * @param golesDirectos
     * @param totalLanzamientos
     * @param pasesEfectivos
     * @param asistenciasEfectivas
     */
    public void agregarExtremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int pasesEfectivos, int asistenciasEfectivas){
        if(!nombre.isEmpty() && !pais.isEmpty()){
            if(faltas>=0 && golesDirectos>=0 && totalLanzamientos>=0 && pasesEfectivos>=0 && asistenciasEfectivas>=0){
                extremos.add(new Extremo(nombre, pais, faltas, golesDirectos, totalLanzamientos, pasesEfectivos, asistenciasEfectivas));
            }else{
                System.out.println("Las estadisticas del jugador no pueden ser negativas");
            }
        }else{
            System.out.println("El nombre y el pais no pueden estar vacios");
        }
    }

    public void mostrarJugadores(){
        for (Portero portero : porteros) {
            System.out.println(portero+"\n");   
        }
        for (Extremo extremo : extremos) {
            System.out.println(extremo+"\n");
        }
    }

    public void mejoresPorteros(){
        try{
            Collections.sort(porteros, new Comparator<Portero>() {
                @Override
                public int compare(Portero portero1, Portero portero2) {
                    return Double.valueOf(portero1.efectividad()).compareTo(Double.valueOf(portero2.efectividad()));
                }
            });
            System.out.println("\nTOP 3 MEJORES PORTEROS\n");
            System.out.println(porteros.get(porteros.size()-1)+"\n");
            System.out.println(porteros.get(porteros.size()-2)+"\n");
            System.out.println(porteros.get(porteros.size()-3)+"\n");
        }catch(IndexOutOfBoundsException e){
            System.out.println("No hay suficientes porteros para realizar el top");
        }
    }

    
    /** 
     * @return int
     */
    public int extremosEfectivos(){
        int contador = 0;
        for (Extremo extremo : extremos) {
            if(extremo.efectividad()>85){
                contador++;
            }
        }
        return contador;
    }
}
