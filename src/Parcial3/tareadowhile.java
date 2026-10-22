package Parcial3;
import java.util.Scanner;

public class tareadowhile {
    static void main() {
        short decision = 0;
        short conexion = 0;
        Scanner tecl = new Scanner(System.in);

        do {
            System.out.println("1.- Probar conexion");
            System.out.println("2.- Ver estado");
            System.out.println("3.- Cancelar");
            decision = tecl.nextShort();

            switch (decision) {
                case 1:
                    System.out.println("Ingrese el nuevo estado: ");
                    conexion = tecl.nextShort();
                    break;
                case 2:
                    tareadowhile revisar = new tareadowhile();
                    System.out.println("Estado actual:");
                    if (!revisar.estadoConexion(conexion)) {
                        System.out.println("Desconectado");
                        continue;
                    } else if (revisar.estadoConexion(conexion)) {
                        System.out.println("Conectado");
                        continue;
                    }
                    break;
                case 3:
                    System.out.println("Prueba cancelada.");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (conexion != 1);
        System.out.println("Servidor conectado.");
    }

    boolean estadoConexion(short estado) {
        if (estado == 0) {
            return false;
        } else if (estado == 1) {
            return true;
        }
        return false;
    }
}