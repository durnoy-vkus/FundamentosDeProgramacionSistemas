package Parcial1;

public class CicloFor {
    static void main() {
        /*
        String nombre = "Fernanda no te suelto" ;
        System.out.println(nombre.charAt(0));

        for (int i = 0; i<nombre.length(); i++){
            System.out.print(nombre.charAt(i));
        }

         */

        for (int i = 0; i<=30; i+=3){
            System.out.println(i);
        }
        for (int j = 0; j<=100; j+=5){
            System.out.println(j);
        }
        for (int k = -100; k<=100; k+=10){
            System.out.println(k);
        }
        for (int l = 1; l<=200; l++){
            if (!(l%2==0)){
                System.out.println(l);
            }
        }
    }
}