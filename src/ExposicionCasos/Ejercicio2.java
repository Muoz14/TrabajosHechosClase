package ExposicionCasos;

import javax.swing.*;

public class Ejercicio2 {

    public static void main(String[] args){

        String letra = JOptionPane.showInputDialog("Ingrese su calificacion con una letra.");

        letra = letra.toUpperCase(); /// Para mayusculas.

        switch (letra){

            case "A":

                JOptionPane.showMessageDialog(null, "Sobresaliente.");

                break;

            case "B":

                JOptionPane.showMessageDialog(null, "Buena.");

                break;

            case "C":

                JOptionPane.showMessageDialog(null, "Regular.");

                break;

            case "D":

                JOptionPane.showMessageDialog(null, "Deficiente.");

                break;

            case "E":

                JOptionPane.showMessageDialog(null, "Insatisfactorio.");

                break;

            case "F":

                JOptionPane.showMessageDialog(null, "Reprobado.");

                break;

            default:

                JOptionPane.showMessageDialog(null, "Opcion ingresada no valida.");

                break;
        }


    }


}
