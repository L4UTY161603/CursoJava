package PackageEjercicios;

import javax.swing.*;

public class EjercicioLicencia02
{
    public static void main(String[] args)
    {
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));

        if (edad > 18)
        {
            String carnet = JOptionPane.showInputDialog("Tiene licencia?");
            if (carnet.equals("si"))
            {
                JOptionPane.showMessageDialog(null,"Puede comprar el auto.");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"No puede comprar el auto.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No puede comprar el auto por ser menor de edad.");
        }
    }
}
