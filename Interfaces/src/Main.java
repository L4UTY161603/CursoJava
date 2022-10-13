import Paquete.Auto;
import Paquete.Ave;
import Paquete.Bicicleta;
import Paquete.Perro;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro();
        p1.comer();
        p1.moverse();

        Ave a1 = new Ave();
        a1.comer();
        a1.moverse();
    }
}