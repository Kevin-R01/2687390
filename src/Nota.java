import java.util.Scanner;

public class Nota{

    public static void main(String[] args) {

        double nota1, nota2, nota3, asistencia, promedio;

        Scanner lectura = new Scanner(System.in);

        System.out.println("ingrese su primer nota");
        nota1=lectura.nextDouble();
        System.out.println("ingrese su segunda nota");
        nota2=lectura.nextDouble();
        System.out.println("ingrese su tercera nota");
        nota3=lectura.nextDouble();
        System.out.println("ingrese su porcentaje de asistencia");
        asistencia=lectura.nextDouble();


        promedio=(nota1+nota2+nota3)/3;

        if(promedio>=3.5 && asistencia>=70){
            //si esta condicion se cumple se le manda un mesanje de diga
            System.out.println("aprobaste");
        }
        else{
            System.out.println("no aprobaste");
        
        }
        



        lectura.close();

    }





}
