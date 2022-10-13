public class UsoCuenta {
    public static void main(String[] args)
    {
        //Instancias
        CuentaCorriente cuenta1 = new CuentaCorriente(20000, "Lautaro Kaufmann");
        CuentaCorriente cuenta2 = new CuentaCorriente(30000, "Facundo Uferer");

        //Se muestran los datos actuales de ambas cuentas
        System.out.println("El saldo actual de la cuenta del titular " + cuenta1.GetDatos() + " es: " +  cuenta1.GetSaldo());
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("El saldo actual de la cuenta del titular " + cuenta2.GetDatos() + " es: " +  cuenta2.GetSaldo());
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println();

        //Se realiza la transferencia
        cuenta1.Transferencias(cuenta2, 2500);
        System.out.println("*************************SE REALIZO LA TRANSFERENCIA CON EXITO**********************************");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------------");
        //Se muestran los datos actuales de ambas cuentas
        System.out.println("El saldo actual de la cuenta del titular " + cuenta1.GetDatos() + " es: " +  cuenta1.GetSaldo());
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("El saldo actual de la cuenta del titular " + cuenta2.GetDatos() + " es: " +  cuenta2.GetSaldo());
    }
}