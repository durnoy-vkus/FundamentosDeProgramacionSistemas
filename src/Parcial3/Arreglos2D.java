package Parcial3;

public class Arreglos2D {
    static void main() {
        int[] bateria = {80, 40};
        try{
            System.out.println(bateria[5]);
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Continua");

        int balas = 12;
        int jugadores = 0;

        try{
            int reparto = balas/jugadores;
            System.out.println(reparto);
        } catch(ArithmeticException e1){
            System.out.println("Error: Division entre 0");
        }
        System.out.println("La mision continua");
    }
}