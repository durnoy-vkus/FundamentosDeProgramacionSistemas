package Parcial1;

import java.util.Scanner;

public class Elif {
    static void main() {
        Scanner tecl2 = new Scanner(System.in);
        String tipoAmor = tecl2.nextLine();
        if(tipoAmor.equals("Te amo")){
            System.out.println("Te ama");
        } else if (tipoAmor.equals("te quiere")) {
            System.out.println("Te quiere");
        } else if (tipoAmor.equals("Le gustas")) {
            System.out.println("Suertudo");
        } else {
            System.out.println("Xd");
        }

        System.exit(0);

        Scanner tecl = new Scanner(System.in);
        System.out.println("1. Debito 2. Credito 3. Efectivo");
        int opcion = tecl.nextInt();;
        if (opcion ==1){
            System.out.println("Guarda dinero y transferencia");
            System.out.println("Clonar tarjeta");
            System.out.println("Robar dinero");
            System.out.println("No generas historial crediticio");
        } else if (opcion == 2) {
            System.out.println("Generas historial crediticio");
            System.out.println("Puntos");
            System.out.println("Cashback");
        } else if (opcion == 3) {
            System.out.println("Descapitalizacion");
        } else  {
            System.out.println("Opcion no valida");
        }
        {

        }
    }
}
