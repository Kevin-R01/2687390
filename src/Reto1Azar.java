import java.util.Random;
import java.util.Scanner;

public class Reto1Azar {

public static void main(String[] args) {
    int numero;


    String aleatorio;
        numero = (int) (Math.random() * 2 + 1);
   
Scanner lectura = new Scanner(System.in);
    System.out.println( "elija cara o sello");
    numero = lectura.nextInt();

        lectura.close();

    }
}