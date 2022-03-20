package com.so.practica4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int opcion; //opción elegida del usuario
    //Tamaño de la memoria: 2
    MapaMemoria memoriaSistema = new MapaMemoria(50);

    public static void main(String[] args) {

        while (opcion != 8) {
            //Try catch para evitar que el programa termine si hay un error
            try {
                System.out.println("Elige opción:\n" +
                        "1. Crear Proceso nuevo\n" +
                        "2. Ver estado actual del sistema\n" +
                        "3. Imprimir cola de procesos\n" +
                        "4. Ver proceso actual\n" +
                        "5. Ejecutar proceso actual\n" +
                        "6. Pasar al proceso siguiente\n" +
                        "7. Matar proceso actual\n" +
                        "8. Salir del programa");

                //Recoger una variable por consola
                opcion = Integer.parseInt(scanner.nextLine());

                //Ejemplo de switch case en Java
                switch (opcion) {
                    case 1:
                        crearProceso();
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        System.out.println("Adios!");
                        break;
                    default:
                        System.out.println("Número inválido, selecciona de nuevo");
                        break;
                }

                System.out.println("\n");

            } catch (Exception e) {
                System.out.println("Error");
            }
        }

    }

    public static void crearProceso() {
        String nomProceso;
        int randomPID;
        int numInstrucciones;
        int espacioProceso;
        Random random = new Random();

        //Lectura del nombre del proceso
        System.out.println("Ingresa el nombre del proceso: ");
        nomProceso = scanner.nextLine();
        //PID aleatorio
        randomPID = random.nextInt(999999);
        //Num aleatorio instrucciones entre 10-30
        numInstrucciones = random.nextInt(30 + 10) +10;
        //Num aleatorio para espacio proceso
        int tamaniolocalidades[] = {64,128,256,512};
        int selecciontamanio = random.nextInt(3);
        espacioProceso = tamaniolocalidades[selecciontamanio];

        System.out.println(randomPID);
        System.out.println(numInstrucciones);
        System.out.println(espacioProceso);

    }
}