package Logica;

public abstract class Pokemon {
    //Atributos
    protected int NumPokedex;
    protected String Nombre;
    protected double Peso;
    protected String Sexo;
    protected int Temporada;

    //Getters and Setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public void setNumPokedex(int numPokedex) {
        NumPokedex = numPokedex;
    }

    public void setTemporada(int temporada) {
        Temporada = temporada;
    }

    public double getPeso() {
        return Peso;
    }

    public int getNumPokedex() {
        return NumPokedex;
    }

    public int getTemporada() {
        return Temporada;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    //Metodos Abstractos
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();

}
