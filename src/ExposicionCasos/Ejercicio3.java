package ExposicionCasos;

import javax.swing.*;

public class Ejercicio3 {

    public static void main(String[] args){

        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 1"));

        float numero2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el numero 2"));

        int operacion = Integer.parseInt(JOptionPane.showInputDialog("Operaciones matematicas \n1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \nElija una opcion:"));

        switch (operacion){

            case 1:

                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 + numero2));

                break;

            case 2:

                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 - numero2));

                break;

            case 3:

                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 * numero2));

                break;

            case 4:

                JOptionPane.showMessageDialog(null, "El resultado es = " + (numero1 / numero2));

                break;

            default:

                JOptionPane.showMessageDialog(null, "Opcion invalida ingresada es invalida o no existe");

                break;

        }

    }

}
