package Parcial2;
import java.util.Scanner;

public class RespaldoDeArchivos {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        String[] archivos = new String[5];
        RespaldoDeArchivos archivo = new RespaldoDeArchivos();
        int contador = 0, numeroArchivos = 0;

        while(!archivo.respaldoCompleto(archivos)){
            int menu = 0;
            try{
                System.out.println("1.- Respaldar un archivo");
                System.out.println("2.- Ver avance");
                System.out.println("3.- Cancelar");
                menu = tecl.nextInt();
                tecl.nextLine();
            } catch (Exception e) {
                System.out.println("Ingrese un valor numerico");
            }
            switch(menu){
                case 1:
                    System.out.println("Respaldar archivo (Ingrese nombre del archivo): ");
                    String archivoNombre = tecl.nextLine();
                    archivos[contador] = archivoNombre;
                    archivo.respaldoCompleto(archivos);
                    numeroArchivos++;
                    System.out.println("Archivos respaldados: " + numeroArchivos);
                    break;
                case 2:
                    boolean avance = archivo.respaldoCompleto(archivos);
                    if(!avance){
                        System.out.println("Faltan " + (5-numeroArchivos) + " archivos por respaldar.");
                    } else {
                        System.out.println("Respaldo completo.");
                    }
                    break;
                case 3:
                    System.out.println("Respaldo cancelado.");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            contador++;
        }
        System.out.println("Respaldo listo");
    }

    boolean respaldoCompleto(String[] archivosRegistrados){
        int contadorArchivos = 0;
        for (String archivo : archivosRegistrados) {
            if (archivo != null) {
                contadorArchivos++;
            }
        }
        return contadorArchivos == 5;
}
}
