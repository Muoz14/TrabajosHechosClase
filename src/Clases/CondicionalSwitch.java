package Clases;

import java.util.Scanner;

public class CondicionalSwitch {

    public void condicionalSwitch(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("------ MENU PRINCIPAL ------");
            System.out.println(" 1. Saludo.");
            System.out.println(" 2. Firmes.");
            System.out.println(" 3. Descanso.");
        System.out.println(" -1. Salir.");

        System.out.println("Ingrese una opcion: ");
        int opcion = entrada.nextInt();

        switch (opcion){

            case 1:

                System.out.println("HOLA!");

                break;

            case 2:

                System.out.println("YA!");

                break;


            case 3:

                System.out.println("*descansa*");

                break;

            case -1:

                System.out.println("Hasta la vista baby......");

                break;

            default:

                System.out.println("Opcion ingresada invalida o no existe");

                break;
        }

    }

}
