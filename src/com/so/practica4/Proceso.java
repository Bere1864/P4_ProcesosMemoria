package src.com.so.practica4;

import java.util.List;

public class Proceso {

    String nomProceso;
    int PID;
    int instruccionesTotales;
    int instruccionesEjecutadas;
    List dirAsignadas;

    public Proceso(String nomProceso, int PID, int instruccionesTotales, int instruccionesEjecutadas, List dirAsignadas) {
        this.nomProceso = nomProceso;
        this.PID = PID;
        this.instruccionesTotales = instruccionesTotales;
        this.instruccionesEjecutadas = instruccionesEjecutadas;
        this.dirAsignadas = dirAsignadas;
    }

    public String getNomProceso() {
        return nomProceso;
    }

    public int getPID() {
        return PID;
    }

    public int getInstruccionesTotales() {
        return instruccionesTotales;
    }

    public int getInstruccionesEjecutadas() {
        return instruccionesEjecutadas;
    }

    public List getDirAsignadas() {
        return dirAsignadas;
    }

    public void setNomProceso(String nomProceso) {
        this.nomProceso = nomProceso;
    }

    public void setPID(int PID) {
        this.PID = PID;
    }

    public void setInstruccionesTotales(int instruccionesTotales) {
        this.instruccionesTotales = instruccionesTotales;
    }

    public void setInstruccionesEjecutadas(int instruccionesEjecutadas) {
        this.instruccionesEjecutadas = instruccionesEjecutadas;
    }

    public void setDirAsignadas(List dirAsignadas) {
        this.dirAsignadas = dirAsignadas;
    }
}
