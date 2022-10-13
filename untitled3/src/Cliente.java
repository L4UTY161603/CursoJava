<<<<<<< HEAD
public class Cliente
{
    //Atributos
    private int NroCliente;
    private String Nombre;
    private int saldo = 20000;

    public Caja caja;

    public Cliente (int NroCliente, String Nombre)
    {
        this.NroCliente = NroCliente;
        this.Nombre = Nombre;
        this.saldo = saldo;

        caja = new Caja();
    }

    //getters and setters
    public int GetSaldo ()
    {
        return saldo;
    }

    public void SetSaldo (int saldo)
    {
        this.saldo = saldo;
    }



}
=======
public class Cliente
{
    //Atributos
    private int NroCliente;
    private String Nombre;
    private int saldo = 20000;

    public Caja caja;

    public Cliente (int NroCliente, String Nombre)
    {
        this.NroCliente = NroCliente;
        this.Nombre = Nombre;
        this.saldo = saldo;

        caja = new Caja();
    }

    //getters and setters
    public int GetSaldo ()
    {
        return saldo;
    }

    public void SetSaldo (int saldo)
    {
        this.saldo = saldo;
    }



}
>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
