public class Empleados
        extends Personas
        implements Informaciones{

    //Atributos
    int sueldo = 30000;

    public Empleados(String nombre, int dni) {
        super.setNombre(nombre);
        super.setDNI(dni);

    }

    public void CambiarSueldo( int monto) {
<<<<<<< HEAD
        sueldo = 0;
=======

>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
        this.sueldo = sueldo + monto;
    }

    public int getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
            return "Tipo: " + getName() +"\n"+
                    "Nombre: " +super.getNombre() +"\n" +
                    "DNI: " +super.getDNI() + "\n"+
                    "Sueldo: "+this.sueldo+ "\n" +
                    "------------------------\n";
        }


    @Override
    public String getName() {
        return "Empleado";
    }
}
