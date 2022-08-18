package PackageEjercicios;

import javax.swing.*;

public class EjercicioOptionPane
{
    public static void main(String[] args)
    {
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
        int c = a + b;
        JOptionPane.showMessageDialog(null,"Hola! "+ nombre +" El resultado es: " + c);
    }

    }
