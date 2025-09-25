import Clases.Ecuaciones;

import java.util.Scanner;

public class CaidaLibre {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Ecuaciones ec = new Ecuaciones();
        double vI, tiempo, dI;

        System.out.println("Ingrese la velocidad inicial: ");
        vI = entrada.nextDouble();

        System.out.println("Ingrese el tiempo: ");
        tiempo = entrada.nextDouble();

        System.out.println("Vf = " + ec.velocidadFinal(vI, tiempo));

        System.out.println("Ingrese el desplazamiento incial: ");
        dI = entrada.nextDouble();

        System.out.println("Y = " + ec.desplazamiento(dI, vI, tiempo));

    }


}
