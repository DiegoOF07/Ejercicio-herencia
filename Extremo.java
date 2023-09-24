public class Extremo extends Jugador{
    private int pasesEfectivos, asistenciasEfectivas;

    public Extremo(String nombre, String pais, int faltas, int golesDirectos, int totalLanzamientos, int pasesEfectivos, int asistenciasEfectivas) {
        super(nombre, pais, faltas, golesDirectos, totalLanzamientos);
        this.pasesEfectivos = pasesEfectivos;
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    public double efectividad(){
        return ((pasesEfectivos + asistenciasEfectivas - faltas) * 100 / (pasesEfectivos + asistenciasEfectivas + faltas)) + (golesDirectos * 100 / totalLanzamientos);
    }

    public int getPasesEfectivos() {
        return pasesEfectivos;
    }

    public void setPasesEfectivos(int pasesEfectivos) {
        this.pasesEfectivos = pasesEfectivos;
    }

    public int getAsistenciasEfectivas() {
        return asistenciasEfectivas;
    }

    public void setAsistenciasEfectivas(int asistenciasEfectivas) {
        this.asistenciasEfectivas = asistenciasEfectivas;
    }

    @Override
    public String toString() {
        return "Extremo [pasesEfectivos=" + pasesEfectivos + ", asistenciasEfectivas=" + asistenciasEfectivas + "]";
    }

    
    
}
