import java.util.Scanner;

public class Budget{
    
    public static void main(String[] args) {
        int spent, budget, totals,op;
        Scanner lectura = new Scanner (System.in);
        op=1;
        budget=100000;
        while(op==1){

        System.out.println("Ingrese el gasto");
        spent=lectura.nextInt();

        budget=budget-spent;

        System.out.println(" el gasto fue de " + spent + " y el presupuesto restante es " + budget);

        System.out.println("Desea registar otro gasto? 1.SI 2.NO");
        op=lectura.nextInt();

        for(int x=1; x<=3; x++ )
            System.out.println("ya excediste el gasto permitido ");
        }




        lectura.close();
    }
}
