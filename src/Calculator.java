import java.math.MathContext;
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        int num1, num2, rest, op, multiplication, division,power, filing, addition;



        System.out.println("Ingrese el primer numero");
        num1 = lectura.nextInt();

        System.out.println("Ingrese el segundo numero");
        num2 = lectura.nextInt();

        System.out.println("Seleccione los siguientes parametros: 1.Suma 2.Resta 3.Multiplicacion 4.Division 5.Potencia 6.Radicacion");
        op=lectura.nextInt();

        switch(op) {

            case 1:
            addition=num1+num2;
            System.out.println("el resultado de la suma es " + addition);
            break;

            case 2:
            rest=num1+num2;
            System.out.println("el resultado de la resta es " + rest);
            break;

            case 3:
            multiplication=num1*num2;
            System.out.println("el resultado de la Multiplicacion es " + multiplication);
            break;

            case 4:
            division=num1/num2;
            System.out.println("es resultado de la division es entre " + num1 + "y" +num2+ "es" + division);
            break;

            case 5:
            int resultado=(int)(Math.pow(num1,num2));
            System.out.println("el resultado de la potencia es " + resultado);
            break;

            case 6:
            Double raizcuadrada=(Double)(Math.sqrt(num1+num2));
            System.out.println("el resultado de la raiz cuadrada es " + raizcuadrada);
            break;

            default:
            System.out.println("la opcion no es valida");
            break;
           
        }

        lectura.close();
    }


}
