import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Variables
        Scanner sc = new Scanner(System.in);
        List<Espectadores> espectador = new ArrayList<Espectadores>();

        int rstaSala = 0;
        int monto;

        //Instancia de objetos
        Salas s1= new Salas(3,"transformers","sala 1");
        Salas s2 = new Salas(10, "Avengers", "sala 2");

        System.out.println("desea cargar espectadores? s/n");
        String rstaCarga = sc.next();
        if (rstaCarga.equals("s")) {
            System.out.println("Que numero de sala desea modificar?: ");
            rstaSala = sc.nextInt();
        if (rstaSala == 1){
                s1.CargarEspectadores(espectador);
            if(s1.getCapacidad() < espectador.size()){
                System.out.println("La capacidad de la sala es menor a la cantidad de espectadores");
            }else{
                System.out.println("****************************************************************");
                System.out.println("Se ha cargado correctamente la lista de espectadores a la sala 1");
                System.out.println("****************************************************************");
                System.out.println(s1.toString());
                System.out.println();
                System.out.println("-------------------------");
                System.out.println(espectador.toString());
            }
        }else if (rstaSala == 2) {
            s2.CargarEspectadores(espectador);
            if (s2.getCapacidad() < espectador.size()) {
                System.out.println("La capacidad de la sala es menor a la cantidad de espectadores");
            } else {
                System.out.println("****************************************************************");
                System.out.println("Se ha cargado correctamente la lista de espectadores a la sala 2");
                System.out.println("****************************************************************");
                System.out.println(s2.toString());
                System.out.println();
                System.out.println("-------------------------");
                System.out.println(espectador.toString());
            }
         }
        }else {
            System.out.println("NO HAY ESPECTADORES CARGADOS");
        }

        //EMPLEADO MODIFICACION
        Empleados e1 = new Empleados("Carlos",43268558);
        System.out.println("----------MODIFICACION SUELDO DE UN EMPLEADO---------------");
        System.out.println("Desea modificar el sueldo del empleado? s/n");
        String rstaSueldo = sc.next();
        System.out.println("-------------------------");
        System.out.println(e1.toString());
        if (rstaSueldo.equals("s")) {
            System.out.println("Indique el nuevo sueldo del empelado: ");
            monto = sc.nextInt();
            e1.CambiarSueldo(monto);
            System.out.println("-------------------------");
            System.out.println(e1.toString());
        }else{
            System.out.println("Hasta luego!");
        }

    }
}
