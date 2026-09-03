package Parcial1;

import java.util.Scanner;

public class IfSencillo {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Cuanta aura tienes?");
        int aura = tecl.nextInt();
        System.out.println("Tienes memorias?");
        boolean tienesMemorias = tecl.nextBoolean();
        //&& Ambas condiciones se tienen que cumplir
        //|| Una condicion se tiene que cumplir
        if (aura >= 100 && !tienesMemorias){
            System.out.println("Bienvenido a tu primer startup");
        }

        System.exit(0);
        System.out.println(10>3);
        System.out.println(10<3);
        System.out.println(10>=3);
        System.out.println();
        int corazones = 48;
        if (corazones == 13) {
            System.out.println("Completo");
        }
        if (corazones >= 20){
            System.out.println("Tienes mods");
        }
    }
}