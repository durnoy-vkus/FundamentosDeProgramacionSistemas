package Parcial1;

import java.util.Scanner;

public class InventarioOrganizado {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        System.out.println("Nombre del producto: ");
        String nombreProducto = tecl.nextLine();
        System.out.println("Cantidad de productos: ");
        int cantidadProductos = tecl.nextInt();
        System.out.println("Capacidad de las tarimas: ");
        int capacidadTarimas = tecl.nextInt();

        int tarimasCompletas = cantidadProductos/capacidadTarimas;
        int productoSobrante = cantidadProductos - (tarimasCompletas*capacidadTarimas);

        System.out.println("Reporte de inventario.");
        System.out.println("Producto: " + nombreProducto);
        System.out.println("Tarimas llenas: " + tarimasCompletas);
        System.out.println("Producto sobrante: " + productoSobrante + " unidades");
    }
}