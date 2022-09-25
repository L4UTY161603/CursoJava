package Paquete;

public class Auto implements Rueda {

    @Override
    public void avanzar() {
        System.out.println("El carro avanza");
    }

    @Override
    public void detenerse() {
        System.out.println("El carro se detiene");
    }
}
