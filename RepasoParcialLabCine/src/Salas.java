public class Salas
        extends Cine
        implements Informaciones {

    //Atributos
    private int capacidad;
    private String pelicula;
    private String nomsala;

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
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nomsala='" + nomsala + '\'' +
                '}';
    }

    @Override
    public String getName() {
        return "Salas: ";
    }
}
