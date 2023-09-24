public class Portero extends Jugador{
    private int paradasEfectivas, golesRecibidos;

    public Portero(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int paradasEfectivas, int golesRecibidos) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.paradasEfectivas = paradasEfectivas;
        this.golesRecibidos = golesRecibidos;
    }

    public double efectividad(){
        return ((paradasEfectivas - golesRecibidos) * 100 / (paradasEfectivas + golesRecibidos)) + (golesDirectos* 100 / totalLanzamientos);
    }

    public int getParadasEfectivas() {
        return paradasEfectivas;
    }

    public void setParadasEfectivas(int paradasEfectivas) {
        this.paradasEfectivas = paradasEfectivas;
    }

    public int getGolesRecibidos() {
        return golesRecibidos;
    }

    public void setGolesRecibidos(int golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    @Override
    public String toString() {
        return "Portero [paradasEfectivas=" + paradasEfectivas + ", golesRecibidos=" + golesRecibidos + "]";
    }

    
    
}
