import java.util.Scanner;

public class PesoIdeal
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

       String gen;
       int alt; int PesoIdeal;

       System.out.println("Ingrese su altura en cm: ");
       alt = s.nextInt();
       System.out.println("Ingrese su genero: ");
       gen = s.next();

       if (gen.equals("hombre"))
       {
         PesoIdeal = alt - 110;
         System.out.println("El peso ideal del hombre es: " + PesoIdeal);
       }else if (gen.equals("mujer"))
       {
           PesoIdeal = alt - 120;
           System.out.println("El peso ideal de la mujer es: " + PesoIdeal);
       }else
       {
           System.out.println("Usted ingreso incorrectamente su genero.");
       }
    }
}
