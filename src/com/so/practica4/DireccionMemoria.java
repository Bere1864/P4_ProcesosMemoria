package src.com.so.practica4;

public class DireccionMemoria {
    int numDireccion;
    String nombreProceso;
    int PID;

    public DireccionMemoria(int numDireccion, String nombreProceso, int PID) {
        this.numDireccion = numDireccion;
        this.nombreProceso = nombreProceso;
        this.PID = PID;
    }

    public int getNumDireccion() {
        return numDireccion;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public int getPID() {
        return PID;
    }
}
