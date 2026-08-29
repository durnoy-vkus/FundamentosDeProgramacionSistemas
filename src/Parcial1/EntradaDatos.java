package Parcial1;

import java.util.Scanner;

public class EntradaDatos {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        System.out.println("¿Cual es su nombre?");
        String nombre = tecl.nextLine();
        System.out.println("¿Cual es tu edad?");
        int edad = tecl.nextInt();
        System.out.println("¿Cuantas veces has ido al cine?");
        int visitasAlCine = tecl.nextInt();


        System.out.println("Visitas al cine: " + visitasAlCine);
    }
}
