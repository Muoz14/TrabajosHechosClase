package OperacionesLogicas;

import Clases.CicloFor;
import Clases.CicloMientras;

public class Ejemplo_While_For {

    public static void main(String[] args){

        CicloFor cf = new CicloFor();
        CicloMientras cm = new CicloMientras();

        System.out.println("For:");

        cf.cicloFor();

        System.out.println("\nWhile:");

        cm.cicloMientras();

    }


}
