package Parcial2;
import java.util.Scanner;

public class MonitoreoServidor {
    String nombre1 = "Procesador", nombre2 = "RAM", nombre3 = "Almacenamiento";
    int usoProcesador, usoRam, usoAlmacenamiento;
    static MonitoreoServidor servidor = new MonitoreoServidor();

    static void main() {
        Scanner tecl = new Scanner(System.in);
        servidor.iniciarPrograma(tecl);
    }

    void iniciarPrograma(Scanner tecl){
        usoProcesador = leerPorcentaje(tecl, nombre1);
        usoRam = leerPorcentaje(tecl, nombre2);
        usoAlmacenamiento = leerPorcentaje(tecl, nombre3);
        String procesadorEvaluado = evaluarProcesador(usoProcesador);
        String ramEvaluada = evaluarMemoria(usoRam);
        String almacenamientoEvaluado = evaluarAlmacenamiento(usoAlmacenamiento);
        String servidor = evaluarServidor(procesadorEvaluado, ramEvaluada, almacenamientoEvaluado);
        mostrarResultados(usoProcesador, procesadorEvaluado, usoRam, ramEvaluada, usoAlmacenamiento, almacenamientoEvaluado, servidor);
    }

    int leerPorcentaje(Scanner tecl, String componente){
        System.out.println("Ingrese el porcentaje de uso de " + componente + ":");
        int entrada = tecl.nextInt();
        return entrada;
    }

    String evaluarProcesador(int procesador){
        String resultado = "";
        if (procesador<=70){
            resultado = "Estado normal";
        } else if(procesador>=71 && procesador<=85){
            resultado = "Requiere supervision";
        } else if(procesador>85){
            resultado = "Estado critico";
        }
        return resultado;
    }

    String evaluarMemoria(int ram){
        String resultado = "";
        if (ram<=75){
            resultado = "Estado normal";
        } else if(ram>=76 && ram<=85){
            resultado = "Requiere supervision";
        } else if(ram>85){
            resultado = "Estado critico";
        }
        return resultado;
    }

    String evaluarAlmacenamiento(int almacenamiento){
        String resultado = "";
        if (almacenamiento<=75){
            resultado = "Estado normal";
        } else if(almacenamiento>=76 && almacenamiento<=85){
            resultado = "Requiere supervision";
        } else if(almacenamiento>85){
            resultado = "Estado critico";
        }
        return resultado;
    }

    String evaluarServidor(String procesador, String ram, String almacenamiento){
        if (procesador.equals("Estado critico") || ram.equals("Estado critico")
                || almacenamiento.equals("Estado critico")) {
            return "Estado critico";
        }
        if (procesador.equals("Requiere supervision") || ram.equals("Requiere supervision")
                || almacenamiento.equals("Requiere supervision")) {
            return "Requiere supervision";
        }
        return "Estado normal";
    }

    void mostrarResultados(int procesadorUso, String procesadorEstado, int ramUso, String ramEstado, int almacenamientoUso, String almacenamientoEstado, String servidorEstado){
        System.out.println("Procesador: " + procesadorUso + "% - " + procesadorEstado);
        System.out.println("Memoria RAM: " + ramUso + "% - " + ramEstado);
        System.out.println("Almacenamiento: " + almacenamientoUso + "% - " + almacenamientoEstado);
        System.out.println("Estado del servidor: " + servidorEstado);
    }
}
