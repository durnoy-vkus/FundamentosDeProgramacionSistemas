package Parcial2;
import java.util.Scanner;

public class Tarea_Arrays_Extra {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        String[] alumnos = {
            "Juan", "Jose", "Gabriel", "Luis", "Oscar", "Fernando", "Gustavo", "Raul"
            };
        int numero = alumnos.length;
        String[] calificaciones = new String[numero];
        String calificacion = "";
        for(int i=0; i<alumnos.length; i++){
            System.out.println("Ingrese la calificación del alumno: " + alumnos[i]);
            calificacion = tecl.nextLine();
            calificaciones[i] = calificacion;
        }
        System.out.println("Calificaciones registradas: ");
        for(int j=0; j< alumnos.length; j++){
            System.out.println("Alumno: " + alumnos[j] + " Calificacion: " + calificaciones[j]);
        }
    }
}