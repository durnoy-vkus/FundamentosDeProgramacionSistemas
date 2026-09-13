package Parcial1;
import java.util.Scanner;
public class PrecioProgramaExtra {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Productos disponibles:");
        System.out.println("1.- Pan    Precio: 4.00$");
        System.out.println("2.- Vino   Precio: 400.25$");
        System.out.println("3.- Arroz  Precio: 20.50$ (Por kilo)");
        double subtotal = 0, total = 0;
        double precioPan = 4.00, precioVino = 400.25, precioArroz = 20.50;
        int menu = 1;
        while (menu > 0){
            System.out.println("¿Qué productos desea llevar? (Ingrese su codigo numerico)");
            System.out.println("Para salir del menú presione 0");
            menu = tecl.nextInt();
            switch(menu){
                case 1:
                    System.out.println("¿Cuantos panes llevará?");
                    int cantPanes = tecl.nextInt();
                    subtotal+=precioPan*cantPanes;
                    System.out.println("Subtotal acumulado: " + subtotal + "$");
                    break;
                case 2:
                    System.out.println("¿Cuantas botellas llevará?");
                    int cantVino = tecl.nextInt();
                    subtotal+=precioVino*cantVino;
                    System.out.println("Subtotal acumulado: " + subtotal + "$");
                    break;
                case 3:
                    System.out.println("¿Cuantos kilos de arroz llevará?");
                    int cantArroz = tecl.nextInt();
                    subtotal+=precioArroz*cantArroz;
                    System.out.println("Subtotal acumulado: " + subtotal + "$");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
            total += subtotal;
        }
        System.out.println("Gracias por su compra!");
        System.out.println("Total: " + total + "$");
    }
}