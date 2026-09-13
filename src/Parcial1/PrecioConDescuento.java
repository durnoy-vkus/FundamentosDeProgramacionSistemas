package Parcial1;

import java.util.Scanner;

public class PrecioConDescuento {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        String nombreProducto;
        double precioProducto, descuento = 0.25, subtotal, descuentoAplicado, total;
        int cantidadProducto;
        //Ingresan los datos
        System.out.println("Ingrese el nombre del producto: ");
        nombreProducto = tecl.nextLine();
        System.out.println("¿Que precio tiene?");
        precioProducto = tecl.nextDouble();
        System.out.println("¿Cuantas unidades vas a comprar?");
        cantidadProducto = tecl.nextInt();

        //Se calculan subtotales, descuentos y el precio final
        subtotal = precioProducto*cantidadProducto;
        descuentoAplicado = subtotal*descuento;
        total = subtotal-descuentoAplicado;

        //Se imprimen resultados
        System.out.println("----------------------------------------------");
        System.out.println("Producto: " + nombreProducto + "  |   Cantidad: " + cantidadProducto);
        System.out.println("Subtotal: " + subtotal + "$");
        System.out.println("Descuento aplicado: " + descuentoAplicado + "$");
        System.out.println("Total: " + total + "$");
        System.out.println("Gracias por su preferencia");
    }
}
