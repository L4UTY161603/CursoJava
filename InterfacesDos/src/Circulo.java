import java.util.Random;

public class Circulo
        implements Figura, Rotable, Dibujable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo() {

    }

    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }

    @Override
    public void rotar() {
        System.out.println("Hola estoy Rotando un circulo");
    }

    @Override
    public void dibujar() {
        System.out.println("Hola estoy dibujando un circulo");
    }
}
