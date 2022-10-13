package Paquete;

public class Bicicleta
        implements Rueda, Silla{

    public Bicicleta() {

    }

    @Override
    public void avanzar() {
        System.out.println("la bicicleta avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("la bicicleta se detiene");
    }

    @Override
    public void sentarse() {
        System.out.println("Sentarse");
    }
}
