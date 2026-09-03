package Parcial1;
import java.util.Scanner;

public class EstructurasDeControl {
    static void main() {
        //Retiro de cajeros
        Scanner tecl = new Scanner(System.in);
        double saldo = 4000.0, retiro;
        System.out.println("Cuanto va a retirar :(?");
        retiro = tecl.nextDouble();
        if (retiro <= saldo && retiro>0){
            saldo = saldo-retiro;
            //saldo -= retiro;
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente, trabaja");
        }
    }
}