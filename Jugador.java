/**
 * @author: Diego Oswaldo Flores 23714
 * @version: 24/09/2023b
 * 
 * Esta es una super clase que modela un jugador en general
 * Posee el nombre, pais, faltas, goles directos y el total de lanzamientos de un jugador
 */
public class Jugador {
    protected String nombre, pais;
    protected int faltas, golesDirectos, totalLanzamientos;

    public Jugador(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos) {
        this.nombre = nombre;
        this.pais = pais;
        this.faltas = faltas;
        this.golesDirectos = golesDirectos;
        this.totalLanzamientos = totalLanzamientos;
    }

    public Jugador(){
        this.nombre = "";
        this.pais = "";
        this.faltas = 0;
        this.golesDirectos = 0;
        this.totalLanzamientos = 0;
    }

    
    /** 
     * @return double
     */
    public double efectividad(){
        double efectividad = 0;
        return efectividad;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getPais() {
        return pais;
    }

    
    /** 
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    /** 
     * @return int
     */
    public int getFaltas() {
        return faltas;
    }

    
    /** 
     * @param faltas
     */
    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    
    /** 
     * @return int
     */
    public int getGolesDirectos() {
        return golesDirectos;
    }

    
    /** 
     * @param golesDirectos
     */
    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    
    /** 
     * @return int
     */
    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    
    /** 
     * @param totalLanzamientos
     */
    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }
    
}