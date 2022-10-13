package Logica;

public class Pikachu
        extends Pokemon
        implements IElectrico{

    //Constructor
    public Pikachu() {

        setNombre("Pikachu");
        setNumPokedex(22);
        setPeso(45.6);
        setSexo("Masculino");
        setTemporada(1);

    }





    //Metodos
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y este es mi ataque Puño trueno");
    }
}
