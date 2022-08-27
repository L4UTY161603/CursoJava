import java.util.Random;
import java.util.Scanner;
public class NumeroAleatorio {
    public static void main (String[]Args){
        //Variables
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int numeroAleatorio = 0;
        int ingresado = 0;

        //Se genera el numero random
        numeroAleatorio = r.nextInt(100) + 1;


        System.out.print("Estre programa ha generado un numero aleatorio del 1 al 100, intente adivinarlo:  ");
        while (numeroAleatorio != (ingresado = s.nextInt())){
            if (ingresado < numeroAleatorio)
                System.out.print("Casi! pero noo has acertado, el número es mayor. Intentelo nuevamente: ");
            else
                System.out.print("Casi! pero noo has acertado, el número es menor. Intentelo nuevamente: ");
        }
        System.out.println("Usted ha adivinado el numero, felicidades!");
    }
}
