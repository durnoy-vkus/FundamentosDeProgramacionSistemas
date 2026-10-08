package Parcial3;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Librerias {
    static void main() {
        Path ruta = Path.of("hechizoz.txt");
        try{
            Files.writeString(ruta, "Lumos");
            Files.writeString(ruta, "Spectro patronum");
            Files.writeString(ruta, "Si\n");
            String texto = Files.readString(ruta);
            System.out.println(texto);
        } catch (IOException e) {
            System.out.println("Error al abrir el archivo");
        }
    }
}