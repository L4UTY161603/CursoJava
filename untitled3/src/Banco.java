import java.util.Arrays;

public class Banco
{
    private Cliente ColeccionDeClientes [];

    public Banco (Cliente clientes [])
    {
        this.ColeccionDeClientes = clientes;
    }

    public String toString() {
        return "Banco{" +
                "Cliente=" + Arrays.toString(ColeccionDeClientes) +
                '}';
    }
}
