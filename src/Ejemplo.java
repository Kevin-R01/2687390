import java.util.Scanner;

public class Ejemplo{
    
    public static void main(String[] args) {
        
    
    int precio, cantidad, contador, subtotal, acumulador, efectivo, cambio;
    Scanner lectura = new Scanner(System.in);

        contador=0;
        acumulador=0;
        for(int x=1; x<=5; x++ )
    {
        
        System.out.println("Digite el precio del producto");
        precio=lectura.nextInt();

        System.out.println("Digite la cantidad del producto");
        cantidad=lectura.nextInt();

        contador=contador+1;
        subtotal=precio*cantidad;
        acumulador=acumulador+subtotal;
    }

    {

    System.out.println("el valor a pagar es " + acumulador);
       
    
        
        System.out.println("ingrese el billete con el que va a pagar ");
        efectivo = lectura.nextInt();
        cambio=efectivo-acumulador;
        System.out.println("el cambio de su compra es " + cambio);
        cambio = lectura.nextInt();

        

    lectura.close();
        
}
}
}
