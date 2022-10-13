package Logica;

public class Main {
    public static void main(String[] args) {
        Pikachu pikachu = new Pikachu();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Squirtle squirtle = new Squirtle();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();

        System.out.println("Nombre del Pokemon: " + squirtle.getNombre());
        System.out.println("Numero de Pokedex: " + squirtle.getNumPokedex());
        System.out.println("Peso: " + squirtle.getPeso());
        System.out.println("Sexo: " + squirtle.getSexo());
        System.out.println("Nº de temporada: " + squirtle.getTemporada());
    }
}