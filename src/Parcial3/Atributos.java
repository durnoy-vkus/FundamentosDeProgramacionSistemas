package Parcial3;

public class Atributos {
    static void main() {
        Coche carro = new Coche("Toyota", 2011, "Camry");
        carro.mostrarInformacion();
    }
}

class Coche{
    String marca, modelo, tipoVehiculo, motor, transmision;
    String traccion, frenos, suspension, sonido, tipoCombustible, marcha;
    int modeloAnio, numeroPuertas, numeroAsientos, potenciaMotor;
    boolean bolsasAire, asistenteConduccion, camaraTrasera, climatizacion, androidAuto, luces;
    double peso, consumoCombustible, cantidadCombustible, cantidadAceite;
    double velocidadMaxima, revolucionesMotor, temperaturaRadiador;
    boolean carga, vidrioPiloto, vidrioCopiloto, vidrioPasajeroIzquierda, VidrioPasajeroDerecha;
    boolean puertaPiloto, puertaCopiloto, puertaPasajeroIzquierda, puertaPasajeroDerecha;
    boolean puertaDepositoCombustible, taponDepositoCombustible, cinturonesPuestos;
    double cargaPeso, presionLlantas;
    boolean limpiaparabrisasEncendido;

    Coche(String marca, int modeloAnio, String modelo){
        this.marca = marca;
        this.modeloAnio = modeloAnio;
        this.modelo = modelo;
    }
    void mostrarInformacion(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(modeloAnio);
    }
    void mostrarInformacion(int velocidadMaxima){

    }
}

