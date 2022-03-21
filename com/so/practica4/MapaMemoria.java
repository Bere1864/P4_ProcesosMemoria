package com.so.practica4;

import java.util.ArrayList;
import java.util.List;

public class MapaMemoria {
    int tamanio;
    List<DireccionMemoria> numDir = new ArrayList<DireccionMemoria>();

    //Constructor recibe tamaño del mapa de memoria
    public MapaMemoria(int tamanio) {
        this.tamanio = tamanio;
        //Añade Direcciones de Memoria según el tamaño especificado
        for (int i = 1; i <= tamanio; i++) {
            numDir.add(new DireccionMemoria(i, null, null));
        }
    }

    public void imprimirInfo() {
        System.out.println("Memoria total disponible: " + tamanio + " localidades.");
    }

    //Verifica que haya espacio en memoria para almacenar un proceso nuevo
    public boolean espacioDisponible(int locsRequeridas){
        boolean hayEspacio;
        int conteoLibres=0;
        for (DireccionMemoria temp: numDir){
            if(temp.PID == null)
                conteoLibres++;
        }
        if (conteoLibres>=locsRequeridas) {
            hayEspacio = true;
        }
        else
            hayEspacio = false;
        return hayEspacio;
    }

    public List<Integer> asignacionDirecciones(Proceso Proceso){
        int i = Proceso.getTamanioProceso();
        List<Integer> direccionesProceso = new ArrayList<Integer>();
        System.out.println(i);
        for (DireccionMemoria temp : numDir) {
            if (temp.getPID() == null && i>=1) {
                direccionesProceso.add(temp.getNumDireccion());
                temp.nombreProceso = Proceso.getNomProceso();
                temp.PID = Proceso.getPID();
                i--;
                }
        }
        return direccionesProceso;
    }
}

