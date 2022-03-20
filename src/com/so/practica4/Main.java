package com.so.practica4;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;


public class Main {

    static Scanner scanner = new Scanner(System.in); //Sirve para recoger texto por consola
    static int opcion; //opción elegida del usuario
    Queue<Integer> Cola_Procesos =new LinkedList();

    public static void main(String[] args) {
        while(opcion != 8){
            //Try catch para evitar que el programa termine si hay un error
            try{
                System.out.println("Elige opción:\n"+
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
                switch(opcion){
                    case 1:
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

            }catch(Exception e){
                System.out.println("Error");
            }
        }

    }


}

