import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;
=======
>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
import java.util.Scanner;

//Clase Principal
public class Cine{
<<<<<<< HEAD

    public void CargarEspectadores(List<Espectadores> espectador) {
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        Espectadores aux;
        int i = 1;
        String rsta = "s";

        //se realiza el iterador con el que el usuario va a interactuar
          try {
              while (rsta.equals("s")) {
=======
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Espectadores> espectador = new ArrayList();
    static int rstaSala , rstaSueldo;
    static int N;
    static int monto;


    public static void main(String[] args) {

        //  Instancia de objetos
        Salas s1= new Salas(3,"transformers","sala 1");
        Salas s2 = new Salas(10, "Avengers", "sala 2");



        System.out.println("Desea cargar algun espectador? 0:SI / 1: NO ");
        N = sc.nextInt();
        if (N == 1){
            System.out.println("SIN ESPECTADORES CARGADOS");
        }else {
            System.out.println("Desea cargar los espectadores para que numero de sala?: ");
            rstaSala = sc.nextInt();
        }
        if (rstaSala == 1){
            leerEspectadores(N);
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

        }else if (rstaSala == 2){
            leerEspectadores(N);
            if(s2.getCapacidad() < espectador.size()){
                System.out.println("La capacidad de la sala es menor a la cantidad de espectadores");
            }else{
                System.out.println("****************************************************************");
                System.out.println("Se ha cargado correctamente la lista de espectadores a la sala 2");
                System.out.println("****************************************************************");
                System.out.println(s2.toString());
                System.out.println();
                System.out.println("-------------------------");
                System.out.println(espectador.toString());
            }
        }


        //EMPLEADO MODIFICACION
        Empleados e1 = new Empleados("Carlos",43268558);
        System.out.println("Desea modificar el sueldo del empleado? 0:si / 1: no");
        rstaSueldo = sc.nextInt();
        if (rstaSueldo == 0) {
            System.out.println("Cuanto desea agregar al sueldo del empleado? ");
            monto = sc.nextInt();
            e1.CambiarSueldo(monto);
            System.out.println("-------------------------");
            System.out.println(e1.toString());
        }else{
            System.out.println("Hasta luego!");
        }

    }


    public static void leerEspectadores(int N) {
        //VARIABLES
        Espectadores aux;
        int i = 0;

        //se realiza el iterador con el que el usuario va a interactuar
          try {
              while (N == 0) {
>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
                  System.out.println("Espectador " + i);
                  System.out.print("Nombre del espectador: ");
                  String nombre = sc.next();
                  System.out.print("DNI del espectador: ");
                  int dni = sc.nextInt();
                  System.out.print("silla del espectador: ");
                  int silla = sc.nextInt();
                  System.out.print("fila del espectador: ");
                  String fila = sc.next();

                  sc.nextLine(); //limpiar el intro

                  aux = new Espectadores(); //Se crea un objeto espectador y se asigna su referencia a aux

                  //se asignan valores a los atributos del nuevo objeto
                  aux.setDNI(dni);
                  aux.setNombre(nombre);
                  aux.setFila(fila);
                  aux.setSilla(silla);
                  //se añade el objeto al final del array
                  espectador.add(aux);
                  i++;
<<<<<<< HEAD
                  System.out.print("Desea ingresar un nuevo espectador?  s/n ");
                  rsta = sc.next();
=======
                  System.out.print("Desea ingresar un nuevo espectador? 0:si / 1: no ");
                  N = sc.nextInt();
>>>>>>> 4ddcc21f9a68d1ba61a291b2fafe6a5bfdaa2452
              }
          }catch(Exception e){
              System.out.println("Error en el ingreso de datos");
              System.exit(0);
          }
        }
    }//fin método













