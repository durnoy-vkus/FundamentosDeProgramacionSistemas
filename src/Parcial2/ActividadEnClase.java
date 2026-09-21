package Parcial2;
import java.util.Scanner;

public class ActividadEnClase {
    static void main() {
        //Primera actividad
        String[] musica = new String[10];
        Scanner tecl = new Scanner(System.in);
        /*
        System.out.println("Ingrese 10 canciones y pon si es tu cancion favorita o si no te gusta.");
        for(int i=0; i<=10; i++){
            musica[i] = tecl.nextLine();
        }
        for(int j=0; j<musica.length; j++){
            if(musica[j].contains("fav")){
                System.out.println(musica[j]);
                break;
            }
            if(musica[j].contains("no")){
                continue;
                //System.out.println(musica[j]);
                //da error si dejo el system.out xd
            }
            if(musica[j].contains("")){
                System.out.println(musica[j]);
            }
        }
        //si
         */

        //Segunda actividad
        System.out.println("Ingresa el tamaño del arreglo: ");
        int arregloTamano = tecl.nextInt();
        System.out.println("Ingresa lo que sea que vayas a ingresar");
        for(int k=0; k<arregloTamano; k++){
            int[] arreglo = {tecl.nextInt()};
        }
        //hola jeje (ejercicio del 21 / 09 / 2026
    }
}