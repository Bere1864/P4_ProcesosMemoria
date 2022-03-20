package com.so.practica4;

import java.util.ArrayList;
import java.util.List;

public class MapaMemoria {
    int tamanio;
    List<DireccionMemoria> numDir = new ArrayList<DireccionMemoria>();

    //Constructor
    public MapaMemoria(int tamanio) {
        this.tamanio = tamanio;
        //Añade Direcciones de Memoria según el tamaño especificado
        for (int i = 1; i <= tamanio; i++) {
            numDir.add(new DireccionMemoria(i, null, null));
        }
    }

    public void imprimirInfo() {

        for (DireccionMemoria temp : numDir){
            temp.infoLocalidad();
        }
    }
}

