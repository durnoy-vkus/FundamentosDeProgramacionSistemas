package Parcial2;
import java.util.Scanner;

public class Tarea_Arrays {
    static void main() {
        Scanner tecl = new Scanner(System.in);
        String[] basesDeDatos = {"PostgreSQL", "MongoDB", "InfluxDB", "MySQL", "Redis", "Prometheus",
        "SAP HANA (cabecera-linea)", "Cassandra", "Oracle", "OpenTSDB"
        };
        String[] tipoBase = new String[10];
        String tipo = "";
        for(int i=0; i<basesDeDatos.length; i++){
            System.out.println(basesDeDatos[i]);
            System.out.println("¿Que tipo de base de datos es?");
            System.out.println("1.- Relacional");
            System.out.println("2.- No relacional?");
            System.out.println("3.- Series temporales");
            tipo = tecl.nextLine();
            if(tipo.equals("1") || tipo.equalsIgnoreCase("Relacional")){
                tipoBase[i] = "Relacional";
            } else if(tipo.equals("2") || tipo.equalsIgnoreCase("No relacional")){
                tipoBase[i] = "No relacional";
            }else if(tipo.equals("3") || tipo.equalsIgnoreCase("Series temporales")){
                tipoBase[i] = "Series temporales";
            } else {
                System.out.println("Tipo no válido");
            }
        }
        System.out.println("Bases de datos y su tipo");
        for(int k=0; k<basesDeDatos.length; k++){
            System.out.println(basesDeDatos[k] + ": " + tipoBase[k]);
        }
    }
}