public class Main {
    public static void main(String[] args) {
        Circulo c1 = new Circulo();
        Cuadrado cu1 = new Cuadrado();

        c1.calcularArea();
        cu1.calcularArea();
        c1.dibujar();
        c1.rotar();
        cu1.dibujar();
    }
}