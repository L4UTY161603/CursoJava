package PackageEjercicios;

import javax.swing.*;

public class EjercicioSumaNumeros04
{
    public static void main(String[] args)
    {
        int numeros[] = new int[6];
        int i = 0; int resultado = 0;
        String rsta = "s";

        do
        {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
            i = i+1;
            rsta = JOptionPane.showInputDialog("Quiere seguir ingresando numeros? ");
        }while(rsta.equals("v"));

        for(int a = 0; a < numeros.length; a++)
        {
            resultado = resultado + numeros[a];
            JOptionPane.showMessageDialog(null, "los numeros ingresados son: " + numeros[a]);
        }

        JOptionPane.showMessageDialog(null,"El resultadod e la suma es: " + resultado);


    }
}

