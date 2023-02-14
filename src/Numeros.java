import java.util.Scanner;

public class Numeros{
    public static void main(String[] args) {
        int numberOne, numberTwo, suma, resta;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        numberOne = lectura.nextInt();

        System.out.println("Ingrese el segundo numero");
        numberTwo = lectura.nextInt();



        suma = numberOne + numberTwo;
        resta = numberOne - numberTwo;


        if(numberOne>numberTwo){
        System.out.println(" el resultado es " + suma);
        }
        else{
            System.out.println("el resultado es " + resta);
        }

        lectura.close();
    }





}