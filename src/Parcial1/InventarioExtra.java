package Parcial1;

import java.util.Scanner;
import java.util.ArrayList;

public class InventarioExtra {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        ArrayList<String> libros = new ArrayList<>();
        ArrayList<String> autores = new ArrayList<>();
        System.out.println("Ingrese cuantos libros hay en el estante: ");
        int cantidadLibros = tecl.nextInt();
        tecl.nextLine();;
        int contador = 0;
        while(contador<cantidadLibros){
            System.out.println("Ingrese el nombre del libro y su autor: ");
            String nombreLibro = tecl.nextLine();
            libros.add(nombreLibro);
            String autorLibro = tecl.nextLine();
            autores.add(autorLibro);
            contador++;
        }

        System.out.println("Libros registrados: ");
        for (int i=0; i<cantidadLibros; i++){
            System.out.println("Nombre: " + libros.get(i));
            System.out.println("Autor: " + autores.get(i));
        }
    }
}