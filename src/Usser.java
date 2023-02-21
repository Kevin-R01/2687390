import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

public class Usser {
    
    public static void main(String[] args) {
        
        String a="kevin";
        
        double user, password,correcto,incorrecto;

        Scanner lectura = new Scanner(System.in);

        System.out.println("ingrese su usuario");
        user=lectura.nextDouble();
        System.out.println("ingrese su contraseña");
        password=lectura.nextDouble();

        correcto = user+password;



        




        lectura.close();
    }
}
