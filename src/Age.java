import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        int age;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese Edad");
        age=lectura.nextInt();
        if(age>=18) {

            System.out.println("Bienvenido Siga!");
        }
        else{

            System.out.println("Para La Casa!");
        }
        
        lectura.close();

    }




}
