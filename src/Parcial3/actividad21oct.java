package Parcial3;
import java.util.Scanner;

public class actividad21oct {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Calificacion");
        int calif = tecl.nextInt();
        actividad21oct calificacion = new actividad21oct();
        System.out.println(calificacion.calcularCalificacion(calif));
    }


    String calcularCalificacion(int calif){
        int revision = calif;
        String resultado = "";
        if(revision == 100){
            resultado = "Excelente";
        } else if (revision>=79 && revision<=99){
            resultado = "Buena";
        } else if (revision<69){
            resultado = "Insuficiente";
        }
        return resultado;
    }
}
