package Paquete;

public class Perro extends Animal{

    public Perro(){
        super();
        SetNombre("Bailey");
    }

    @Override
    public void moverse() {
        System.out.println("El perro se esta moviendo");
    }
}
