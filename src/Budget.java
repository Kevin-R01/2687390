import java.util.Scanner;

public class Budget {
    
    public static void main(String[] args) {
        int spent, budget, totals,op;
        Scanner lectura = new Scanner (System.in);
        op=1;
        while(op==1){

        System.out.println("Ingrese el gasto");
        spent=lectura.nextInt();

        System.out.println("Desea registar otro gasto? 1.SI 2.NO");
        op=lectura.nextInt();


        }






        lectura.close();
    }
}
