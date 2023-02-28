package estructurasdatos;

import java.util.Scanner;

public class MisArrasys {
    public static void main(String[] args) {
        
        int [] vector1;
        vector1=new int[10];

        
        int [] vector={30,50,25,85,12,6,32,41,23,63};

        vector1[6]=32;

//mostrar los datos de arrays con FOR
    for(int op=0;op<vector.length;op++){
            System.out.print(vector[op] + " ");
        }
    Scanner lectura=new Scanner(System.in);
//mostrar los datos de arrays con FOR MEJORADO
    for(int i : vector){
        System.out.println(i);
    }
//rellenar un array en forma dinamica
    for(int op=0;op<vector.length;op++){
        System.out.print("digite el dato de la pocision " + op);
        vector1[op]=lectura.nextInt();
    }
//
    for(int i : vector1){
        System.out.println(i);
    }
//



    }
}
