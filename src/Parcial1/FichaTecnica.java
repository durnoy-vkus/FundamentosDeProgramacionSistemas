package Parcial1;

import java.util.Scanner;

public class FichaTecnica {
    static void main() {
        Scanner tecl = new Scanner(System.in);

        System.out.println("Ingrese los datos del telefono: ");
        System.out.println("Modelo: ");
        String nombre = tecl.nextLine();
        System.out.println("Almacenamiento: ");
        int almacenamiento = tecl.nextInt();
        System.out.println("Memoria RAM: ");
        int ram = tecl.nextInt();
        tecl.nextLine();
        System.out.println("Procesador: ");
        String procesador = tecl.nextLine();
        System.out.println("Resolucion de la camara: ");
        int resolucionCamara = tecl.nextInt();
        System.out.println("Tipo de pantalla");
        tecl.nextLine();
        String tipoPantalla = tecl.nextLine();

        System.out.println("Información del telefono");
        System.out.println();
        System.out.println("Telefono: " + nombre);
        System.out.println("Almacenamiento " + almacenamiento + " GB");
        System.out.println("Memoria RAM: " + ram + " GB");
        System.out.println("Procesador: " + procesador);
        System.out.println("Resolucion de la camara: " + resolucionCamara + " mpx");
        System.out.println("Tipo de pantalla: " + tipoPantalla);
    }
}