package Parcial3;
import java.util.Scanner;

public class CalculadoraDoWhile {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        CalculadoraDoWhile calculadora = new CalculadoraDoWhile();
        int decision =0;
        double x=0, y=0;
        do{
            decision = calculadora.mostrarMenu(tecl);

            switch (decision) {
                case 1:
                    System.out.println("Ingrese los numeros a sumar:");
                    x = tecl.nextDouble();
                    y = tecl.nextDouble();
                    System.out.println("Suma: " + calculadora.sumar(x, y));
                    break;
                case 2:
                    System.out.println("Ingrese los numeros a restar:");
                    x = tecl.nextDouble();
                    y = tecl.nextDouble();
                    System.out.println("Resta: " + calculadora.restar(x, y));
                    break;
                case 3:
                    System.out.println("Ingrese los numeros a multiplicar:");
                    x = tecl.nextDouble();
                    y = tecl.nextDouble();
                    System.out.println("Multiplicaicion: " + calculadora.multiplicar(x, y));
                    break;
                case 4:
                    System.out.println("Ingrese los numeros a dividir:");
                    x = tecl.nextDouble();
                    y = tecl.nextDouble();
                    System.out.println("Division: " + calculadora.dividir(x, y));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }while(decision != 5);
        System.out.println("Proceso terminado.");
    }

    int mostrarMenu(Scanner tecl){
        int num = 0;
        System.out.println("======================");
        System.out.println("CALCULADORA SIMPLE");
        System.out.println("Escoga una operacion.");
        System.out.println("1.- Sumar");
        System.out.println("2.- Restar");
        System.out.println("3.- Multiplicar");
        System.out.println("4.- Dividir");
        System.out.println("5.- Cerrar");
        num = tecl.nextInt();
        return num;
    }

    double sumar(double num1, double num2){
        double suma = num1 + num2;
        return suma;
    }
    double restar(double num1, double num2){
        double resta = num1 - num2;
        return resta;
    }
    double multiplicar(double num1, double num2){
        double multi = num1 * num2;
        return multi;
    }
    double dividir(double num1, double num2){
        double division = num1 / num2;
        return division;
    }
}