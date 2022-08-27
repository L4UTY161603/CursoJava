import java.util.Random;
public class CuentaCorriente
{
    //Uso Random
    Random r = new Random();

    //Atributos
    private double saldo;
    private String NombreTitular;
    private long numeroCuenta;

    //Constructor con parametros
    public CuentaCorriente(double saldo, String nombreTitular)
    {
        this.saldo = saldo;
        this.NombreTitular = nombreTitular;
        this.numeroCuenta = r.nextInt();
    }


    //Getters and Setters
    public double GetSaldo ()
    {
         return this.saldo;
    }
    public String GetDatos ()
    {
        System.out.println("Nro de cuenta:  " +  this.numeroCuenta);
        return NombreTitular;
    }
    public void SetIngreso(double n)
    {
            saldo = saldo + n;
    }
    public void SetReintegro(double n)
    {
        saldo -= n;
    }


    //Metodo Adicional
    public void Transferencias (CuentaCorriente c, double monto)
    {
            SetReintegro(monto);
            c.SetIngreso(monto);
    }

}
