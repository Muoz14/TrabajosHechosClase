package Clases;

import java.util.Scanner;

public class Condicionalif {

    public void condicionalIf(){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int x = entrada.nextInt();

        if(x % 2 == 0){

            System.out.println("El numero " + x + " es par");


        }
        else{

            System.out.println("El numero " + x + " es impar");

        }


    }

}
