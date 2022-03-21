package com.so.practica4;

import java.util.ArrayList;
import java.util.List;

public class ColaProcesos {
    List<Proceso> colaProcesos = new ArrayList<Proceso>();
    public ColaProcesos() {
    }

    public void aniadirProceso (Proceso nuevoProce){
        colaProcesos.add(nuevoProce);
    }

}
