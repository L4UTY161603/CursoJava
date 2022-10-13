package Logica;

public class Bulbasaur
        extends Pokemon
        implements IPlanta{

    //Constructor
    public Bulbasaur() {
        setNombre("Bulbasaur");
        setNumPokedex(7);
        setPeso(50.0);
        setSexo("Masculino");
        setTemporada(1);
    }

    //Metodos
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasaur y este es mi atque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasaur y este es mi ataque paralizar");
    }
}
