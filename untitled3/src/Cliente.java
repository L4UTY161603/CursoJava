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
