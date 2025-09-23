import javax.swing.*;

public class Utilidades {

    public static void main(String[] args){

        int tabla;
        double n1, n2, n3, prom;

        String nombreProducto;
        double precio;
        int cantidad;
        double totalPagar, impuestoSV;

        n1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa nota 1: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa nota 2: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa nota 3: "));

        prom = (n1 + n2 + n3) / 3;

        System.out.println("El promedio de las notas = " + prom + " %");

        System.out.println("TABLAS DE MULTIPLICAR.");

        tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la tabla que desea visualizar: "));

        System.out.println("Tabla del " + tabla);

        System.out.println(tabla + " x 1" + " = " + (tabla));
        System.out.println(tabla + " x 2" + " = " + (tabla*2));
        System.out.println(tabla + " x 3" + " = " + (tabla*3));
        System.out.println(tabla + " x 4" + " = " + (tabla*4));
        System.out.println(tabla + " x 5" + " = " + (tabla*5));
        System.out.println(tabla + " x 6" + " = " + (tabla*6));
        System.out.println(tabla + " x 7" + " = " + (tabla*7));
        System.out.println(tabla + " x 8" + " = " + (tabla*8));
        System.out.println(tabla + " x 9" + " = " + (tabla*9));
        System.out.println(tabla + " x 10" + " = " + (tabla*10));

        nombreProducto = JOptionPane.showInputDialog("Ingrese nombre de producto: ");

        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa precio del producto: "));

        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de productos: "));

        System.out.println("                  Factura");

        System.out.println("  Nombre del producto : " + nombreProducto);
        System.out.println("  Precio del producto: " + precio);
        System.out.println("  Cantidad del producto: " + cantidad);

        impuestoSV = (precio * cantidad) * 0.15;

        System.out.println("  Impuesto S/V 15%: " + impuestoSV);

        totalPagar = (precio * cantidad) - impuestoSV;

        System.out.println("  El total a pagar es = " + totalPagar);

    }
}
