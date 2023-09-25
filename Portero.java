/**
 * @author: Diego Oswaldo Flores 23714
 * @version: 24/09/2023b
 * 
 * Esta es una clase hija de Jugador, en ella se modela el tipo de jugador "portero"
 * Posee ademas las paradas efectivas y los goles recibidos
 */
public class Portero extends Jugador{
    private int paradasEfectivas, golesRecibidos;

    public Portero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int paradasEfectivas, int golesRecibidos) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    }

    
    /** 
     * @return double
     */
    public double efectividad(){
        return ((paradasEfectivas - golesRecibidos) * 100 / (paradasEfectivas + golesRecibidos)) + (golesDirectos* 100 / totalLanzamientos);
    }

    
    /** 
     * @return int
     */
    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    
    /** 
     * @param paradasEfectivas
     */
    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    
    /** 
     * @return int
     */
    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    
    /** 
     * @param golesRecibidos
     */
    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Portero: " +nombre+" del pais de "+pais+" con efectividad de: "+efectividad()+"\n"+ 
        "Estadisticas | Faltas: "+faltas+" | Goles directos: "+golesDirectos+" | Total de lanzamientos: "+totalLanzamientos+" | Paradas efectivas: "+paradasEfectivas + " | Goles recibidos: " + golesRecibidos;
    }

    
    
}
