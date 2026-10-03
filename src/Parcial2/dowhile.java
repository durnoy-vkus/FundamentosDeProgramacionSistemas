package Parcial2;

public class dowhile {
    static void main() {
        //Nivel 1
        int intento = 0;
        do{
            intento++;
        }while (intento<3);

        //Nivel 2
        int intentos2 = 0;
        boolean conectado = false;
        do{
            if(intentos2 == 2) conectado=true;
        }while(!conectado && intentos2<3);

        //Nivel 3
/*
boolean sinConexion(int x){
            return estado=0;
        }
        int estado = 0, intentos3 = 0;
        do{
            intentos3++;
            if (intentos3==2) estado =1;
            System.out.println("Intento"+intentos3);
        }while(sinConexion(intentos3));
 */

    }
}