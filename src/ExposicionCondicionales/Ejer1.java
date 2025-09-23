package ExposicionCondicionales;

import javax.swing.*;

public class Ejer1 {

    public static void main(String[] args){

        /// Ejercicio #1

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));

        if (num > 10){

            System.out.println("Es mayor que 10.");

        }

        /// Ejercicio #2
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));

        if (edad >= 18){

            System.out.println("Usted es mayor de edad.");

        }

        if (edad < 18){

            System.out.println("Usted es menor de edad XD");

        }

        /// Ejercicio #3

        String name;

        name = JOptionPane.showInputDialog("Ingrese su nombre: ");

        if(name.equals("Hola")){

            System.out.println("La palabra es correcta.");

        }

    }

}
