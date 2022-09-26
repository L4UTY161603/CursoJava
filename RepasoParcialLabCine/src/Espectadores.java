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
       return "Nombre: "+ super.getNombre() + "\n" +
               "Dni: " + super.getDNI() + "\n" +
               "Fila y Silla: " + this.fila + "-"+ this.silla +"\n" +
               "Tipo: " + getName() +"\n" +
               "------------------------\n";
    }

    @Override
    public String getName() {
        return "Espectador";
    }
}
