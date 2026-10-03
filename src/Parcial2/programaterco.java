package Parcial2;
import java.util.Scanner;

public class programaterco {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        int respuesta;

        do{
            System.out.println("Quieres ser mi novia? ");
            System.out.println("Si.- 1     No.- 2");
            respuesta = tecl.nextInt();

            if (respuesta==2){
                System.out.println("Respuesta no aceptada xd");
            }
        }while(respuesta!=1);

        System.out.println("Commit del amor terminado xd");
        tecl.close();
    }
}