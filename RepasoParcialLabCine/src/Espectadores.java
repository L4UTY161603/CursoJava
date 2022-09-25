public class Espectadores
        extends Personas
        implements Informaciones{

    //atribtutos
     String fila;
     int silla;

    public Espectadores() {


    }

    public String getFila() {
        return fila;
    }

    public void setFila(String fila) {
        this.fila = fila;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    @Override
    public String toString() {
       return "Espectador [nombre= "+ nombre +", dni = " + DNI + ", fila= " + fila + ", silla= "+ silla + "]";
    }

    @Override
    public String getName() {
        return "Nombre de la clase: Espectadores";
    }
}
