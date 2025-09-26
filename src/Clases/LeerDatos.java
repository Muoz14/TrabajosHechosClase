package Clases;

import java.util.Scanner;

public class LeerDatos {

    public void leerDatos(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Numero 1: ");
        int numero1 = entrada.nextInt();

        System.out.println("Numero 2: ");
        double numero2 = entrada.nextDouble();

        System.out.println("Ingrese texto: ");
        String texto = entrada.next();

        System.out.println("Entero: " + numero1 + ", Decimal: " + numero2 + ", Texto: " + texto);

        entrada.close();

    }


}
