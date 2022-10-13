import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

//Clase Principal
public class Cine{

    public void CargarEspectadores(List<Espectadores> espectador) {
        //VARIABLES
        Scanner sc = new Scanner(System.in);
        Espectadores aux;
        int i = 1;
        String rsta = "s";

        //se realiza el iterador con el que el usuario va a interactuar
          try {
              while (rsta.equals("s")) {
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
                  System.out.print("Desea ingresar un nuevo espectador?  s/n ");
                  rsta = sc.next();

              }
          }catch(Exception e){
              System.out.println("Error en el ingreso de datos");
              System.exit(0);
          }
        }
    }//fin método













