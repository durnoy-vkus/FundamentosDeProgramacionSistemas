package Parcial1;

import java.util.Scanner;

public class IfTerniario {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        //Instancia de clase scanner para poder usar sus metodos
        System.out.println("Contraseña: ");
        String password = tecl.nextLine();
        String buenaContrasena = password.length() > 8 ? "Buena contraseña" : "Mala contraseña";
        System.out.println(buenaContrasena);

        System.exit(0);
        System.out.println("Que quieres ver?");
        String tipo = tecl.nextLine();
        String serie = (tipo.equals("Anime"))
                ? "Los 7 pecados capitales"
                : "Supernatural";
        System.out.println(serie);
    }
}