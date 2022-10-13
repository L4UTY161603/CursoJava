package Paquete;

public class Ave extends Animal{

    public Ave() {
        super();
        SetNombre("Pancho");
    }

    @Override
    public void moverse() {
        System.out.println("El ave esta volando");
    }
}
