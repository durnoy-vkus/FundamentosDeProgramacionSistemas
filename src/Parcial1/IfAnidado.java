package Parcial1;

import java.util.Scanner;

public class IfAnidado {
    static void main() {
        Scanner texl = new Scanner(System.in);
        String tipo = "Asalariado";
        int ganes = 400000;
        int cantidadTrabajos = 2;
        if (tipo.equals("Asalariado")){
            System.out.println("Patron");
            if(ganes>=400000 || cantidadTrabajos>2){
                System.out.println("Declaracion anual");
            }
        }
        else{
            System.out.println("Obligaciones:");
            System.out.println("Declaracion anual");
            System.out.println("Declaracion mensual");
        }
    }
}