<<<<<<< HEAD
public class Salas
        extends Cine
        implements Informaciones {

    //Atributos
    private int capacidad;
    private String pelicula;
    private String nomsala;
=======
public class Salas implements Informaciones{
    //Atributos
    int capacidad;
    String pelicula;
    String nomsala;
>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452

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
<<<<<<< HEAD
        return "Salas{" +
                "capacidad=" + capacidad +
                ", pelicula='" + pelicula + '\'' +
                ", nomsala='" + nomsala + '\'' +
                '}';
=======
        return "[Sala= "+ nomsala +", capacidad= " + capacidad + ", Pelicula= "+ pelicula + "]";
>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
    }

    @Override
    public String getName() {
<<<<<<< HEAD
        return "Salas: ";
=======
        return "Nombre de la clase: Salas";
>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
    }
}
