import java.util.Scanner;



public class Bugget {
    public static void main(String[]args) {
    Scanner LECTURA= new Scanner (System.in);
    double ancho,largo,area,presupuesto;

    System.out.println( "Ingrese el ancho");
    ancho = LECTURA.nextDouble();

    System.out.println( "Ingrese el largo");
    largo = LECTURA.nextDouble();

    area = ancho * largo;

    presupuesto = area * 45.000 ;

    System.out.println(" la superficie a cubrir tiene " + ancho +" metros de ancho por " + largo +" metros de largo, " 
    + "con" + area + " metros cuadrados " + " el presupuesto del proyecto es " + presupuesto);

    System.out.println(" el presupuesto es " + presupuesto);
    }
}
