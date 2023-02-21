import java.util.Scanner;

public class Genero {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        int contador, acumulador, genero;

        contador=0;
        acumulador=0;
        for(int x=1; x<=10; x++ )
        {

            System.out.println("Digite si eres hombre o mujer");
            genero=lectura.nextInt();


            contador=contador+1;
        acumulador=acumulador;


        }
    
lectura.close();
    }
}
