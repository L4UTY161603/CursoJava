public class Salas implements Informaciones{
    //Atributos
    int capacidad;
    String pelicula;
    String nomsala;

    public Salas(int capacidad, String pelicula, String nomsala) {
        this.capacidad = capacidad;
        this.pelicula = pelicula;
        this.nomsala = nomsala;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getPelicula() {
        return pelicula;
    }

    public String getNomsala() {
        return nomsala;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public void setNomsala(String nomsala) {
        this.nomsala = nomsala;
    }

    @Override
    public String toString() {
        return "[Sala= "+ nomsala +", capacidad= " + capacidad + ", Pelicula= "+ pelicula + "]";
    }

    @Override
    public String getName() {
        return "Nombre de la clase: Salas";
    }
}
