import java.util.Scanner;

import javax.security.auth.x500.X500Principal;


public class reto2{

    public static void main(String[]args) {
    Scanner lectura = new Scanner (System.in);
    int cantidad;
    double total,efectivo,cambio;

    System.out.println( "Ingrese la cantidad de productos");
    cantidad = lectura.nextDouble();

    System.out.println( "Ingrese el valor a pagar");
     efectivo = lectura.nextDouble();

    cambio = cantidad * efectivo;


    System.out.println(" la superficie a cubrir tiene " + "ancho" +" metros de ancho por " + "largo" +" metros de largo, " 
    + "con" + "area" + " metros cuadrados " + " el presupuesto del proyecto es " + "presupuesto");

    System.out.println(" el presupuesto es " + "presupuesto");
    }
}

