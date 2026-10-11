package Parcial2;
import java.util.Scanner;

public class BibliotecaMusica {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        String[] canciones = new String[15];
        BibliotecaMusica musica = new BibliotecaMusica();
        int iterador = 0;
        while(!musica.bibliotecaLlena(canciones)){
            String nombreCancion = "";
            int menu = 0;
            System.out.println("1.- Agregar cancion");
            System.out.println("2.- Eliminar cancion");
            System.out.println("3.- Ver canciones");
            System.out.println("4.- Cerrar");
            try{
                menu = tecl.nextInt();
                tecl.nextLine();

            } catch (Exception e) {
                System.out.println("Ingrese un valor numerico");
                menu = tecl.nextInt();
                tecl.nextLine();
            }
            switch (menu){
                case 1:
                    System.out.println("Nombre de la cancion: ");
                    nombreCancion = tecl.nextLine();
                    canciones[iterador] = nombreCancion;
                    break;
                case 2:
                    System.out.println("Nombre de la cancion a eliminar: ");
                    nombreCancion = tecl.nextLine();
                    boolean encontrada = false;
                    for (int i = 0; i < canciones.length; i++) {
                        if (canciones[i] != null && canciones[i].equals(nombreCancion)) {
                            canciones[i] = null;
                            encontrada = true;
                            System.out.println("Cancion eliminada");
                            break;
                        }
                    }
                    if (!encontrada) {
                        System.out.println("No se encontro una cancion con ese nombre.");
                    }
                    break;
                case 3:
                    for(int j = 0; j < canciones.length; j++){
                        System.out.println(canciones[j]);
                    }
                    break;
                case 4:
                    System.out.println("Registro finalizado");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }

    boolean bibliotecaLlena(String[] cancionesRegistradas){
        int contadorMusica = 0;
        for (String archivo : cancionesRegistradas) {
            if (archivo != null) {
                contadorMusica++;
            }
        }
        return contadorMusica == 15;
    }
}