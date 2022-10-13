public class Persona {

    private int num;
    private String nombre;
    private int edad;

    public Persona() {
    }

    public Persona (int num, String nombre, int edad){
        this.edad = edad;
        this.nombre = nombre;
        this.num  = num;
    }

    public int getNum() {
        return num;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
