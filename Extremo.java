/**
 * @author: Diego Oswaldo Flores 23714
 * @version: 24/09/2023b
 * 
 * Esta es una clase hija de Jugador que modela el tipo de jugador "Extremo" 
 * Ademas posee los pases y asistencias efectivas del jugador
 */

public class Extremo extends Jugador{
    private int pasesEfectivos, asistenciasEfectivas;

    public Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int pasesEfectivos, int asistenciasEfectivas) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.pasesEfectivos = pasesEfectivos;
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    
    /** 
     * @return double
     */
    public double efectividad(){
        return ((pasesEfectivos + asistenciasEfectivas - faltas) * 100 / (pasesEfectivos + asistenciasEfectivas + faltas)) + (golesDirectos * 100 / totalLanzamientos);
    }

    
    /** 
     * @return int
     */
    public int getPasesEfectivos() {
        return pasesEfectivos;
    }

    
    /** 
     * @param pasesEfectivos
     */
    public void setPasesEfectivos(int pasesEfectivos) {
        this.pasesEfectivos = pasesEfectivos;
    }

    
    /** 
     * @return int
     */
    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    
    /** 
     * @param asistenciasEfectivas
     */
    public void setAsistenciasEfectivas(int asistenciasEfectivas) {
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Extremo: " +nombre+" del pais de "+pais+" con efectividad de: "+efectividad()+"\n"+
        "Estadisticas | Faltas: "+faltas+" | Goles directos: "+golesDirectos+" | Total de lanzamientos: "+totalLanzamientos+" | Pases efectivos: "+pasesEfectivos + " | Asistencias efectivas: " + asistenciasEfectivas;
    }

    
    
}
