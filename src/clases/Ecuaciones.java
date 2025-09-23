package clases;

import java.lang.Math;

public class Ecuaciones {

    public double velocidadFinal(double velocidadInicial, double tiempo){

        double vf, _G = 9.8F;

        vf = velocidadInicial + _G * tiempo;

        return vf;

    }

    public double desplazamiento(double desplazamientoInicial, double velocidadInicial, double tiempo){

        double desplazamiento, _G = 9.8F;

        return desplazamiento = (desplazamientoInicial + (velocidadInicial * tiempo) + ((0.5) * _G * Math.pow(tiempo, 2)));

    }


}
