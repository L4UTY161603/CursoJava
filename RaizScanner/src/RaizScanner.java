import java.util.Scanner;
import java.util.*;
public class RaizScanner
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
      int num;

      System.out.println("Ingrese el numero que desea calcular su raiz cuadrada: ");
      num = scanner.nextInt();

      System.out.println("La raiz cuadrada de " + num + " es: " + Math.sqrt(num));
    }
}
