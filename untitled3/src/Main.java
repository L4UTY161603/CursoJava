<<<<<<< HEAD
public class Main
{

    public static void main(String[] args)
    {
        Cliente a1 = new Cliente(2233, "Lautaro");
        System.out.println(a1.caja.GetSaldo());

        //COLECCIÓN DE OBJETOS
        Cliente clientes[] =
                {
                new Cliente(22, "juan"),
                new Cliente(30, "pedro"),
                new Cliente(42, "jose")
                };

        a1.caja.depositar(22, 2000);

        System.out.println(a1.caja.GetSaldo());

        a1.caja.extraer(22, 5000);

        System.out.println(a1.caja.GetSaldo());


    }
}

=======
public class Main
{

    public static void main(String[] args)
    {
        Cliente a1 = new Cliente(2233, "Lautaro");
        System.out.println(a1.caja.GetSaldo());

        //COLECCIÓN DE OBJETOS
        Cliente clientes[] =
                {
                new Cliente(22, "juan"),
                new Cliente(30, "pedro"),
                new Cliente(42, "jose")
                };

        a1.caja.depositar(22, 2000);

        System.out.println(a1.caja.GetSaldo());

        a1.caja.extraer(22, 5000);

        System.out.println(a1.caja.GetSaldo());


    }
}

>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
