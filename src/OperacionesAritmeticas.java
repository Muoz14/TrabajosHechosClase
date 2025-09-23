public class OperacionesAritmeticas {


    public static int suma(int a, int b){

        return a + b;

    }

    public static int resta(int a, int b){

        return a - b;

    }

    public static int multi(int a, int b){

        return a * b;

    }

    public static int division(int a, int b){

        return a / b;

    }

    public static void mensaje(String msg){

        System.out.println(msg);

    }

    public static void main(String[] args) {

        System.out.println("La suma es = " + suma(1, 2));

        System.out.println("La resta es = " + resta(3, 2));

        System.out.println("La multiplicacion es = " + multi(4, 1));

        System.out.println("La division es = " + division(4, 2));

        mensaje("Hola, soy homelo xhino");

        OperacionesAritmeticas op = new OperacionesAritmeticas();

        System.out.println("\nCon packages: ");

        op.mensaje("\nHola, amigos");

        System.out.println("\nSUMA 2 = " + op.suma(2, 2));

    }

}
