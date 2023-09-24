/**
 * Jugador
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

    public double efectividad(){
        double efectividad = 0;
        return efectividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public int getGolesDirectos() {
        return golesDirectos;
    }

    public void setGolesDirectos(int golesDirectos) {
        this.golesDirectos = golesDirectos;
    }

    public int getTotalLanzamientos() {
        return totalLanzamientos;
    }

    public void setTotalLanzamientos(int totalLanzamientos) {
        this.totalLanzamientos = totalLanzamientos;
    }
    
}