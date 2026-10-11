package Parcial2;
import java.util.Scanner;

public class MetodosExtra {
    static void main() {
        MetodosExtra tienda = new MetodosExtra();
        Scanner tecl = new Scanner(System.in);
        System.out.println("1.- Venta   2.- Agregar Producto");
        int menu = tecl.nextInt();
        switch (menu){
            case 1:
                int precio = tienda.venderProducto(tecl);
                System.out.println(precio);
                break;
            case 2:
                tienda.agregarProducto(tecl);
                break;
        }
    }

    void agregarProducto(Scanner entrada){
        String producto1 = "Arroz"; int cantidadProducto1 = 100;
        String producto2 = "Maruchan"; int cantidadProducto2 = 50;
        String producto3 = "Arizona Cowboy Tea"; int cantidadProducto3 = 25;
        int decision = 0;
        System.out.println("¿Que producto va a ingresar?");
        System.out.println("1.- Arroz   2.- Maruchan    3.- Arizona");
        try{
            decision = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Error. Ingrese un numero valido.");
            decision = entrada.nextInt();
        }

        System.out.println("Cuanto producto va a entrar?");
        if (decision==1){
            cantidadProducto1 += entrada.nextInt();
        } else if (decision==2){
            cantidadProducto2 += entrada.nextInt();
        } else if (decision==3){
            cantidadProducto3 += entrada.nextInt();
        }
    }

    int venderProducto(Scanner entrada){
        int precioArroz = 20, precioMaruchan = 16, precioArizona = 25, decision = 0, costo = 0;
        System.out.println("Que se va a vender?");
        System.out.println("1.- Arroz   2.- Maruchan    3.- Arizona");
        try{
            decision = entrada.nextInt();
        } catch (Exception e) {
            System.out.println("Error. Ingrese un numero valido.");
            decision = entrada.nextInt();
        }
        System.out.println("Cuanto se va a vender?");
        int cantidadProducto = entrada.nextInt();
        if (decision==1){
            costo = precioArroz*cantidadProducto;
        } else if (decision==2){
            costo = precioMaruchan*cantidadProducto;
        } else if (decision==3){
            costo = precioArizona*cantidadProducto;
        }
        return costo;
    }
}