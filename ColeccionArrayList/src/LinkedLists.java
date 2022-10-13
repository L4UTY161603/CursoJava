import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedLists {
        public static void main(String[] args) {

            Scanner lector = new Scanner(System.in);
           LinkedList<Persona> lista = new LinkedList<Persona>();

           //agregar personas al final de la lista
            lista.add(new Persona(1,"Lautaro",21));
            lista.add(new Persona(2,"Kevin",21));
            lista.add(new Persona(3,"Bruno",21));
            lista.add(new Persona(4,"Dante",23));

            //agregar personas al principio de la lista
            lista.add(3,new Persona(5,"Probando",98));

            //Remove en LinkedList
            for (Persona perso:lista){
                if(perso.getNombre().equals("Lautaro")){
                    lista.remove(perso);
                    break; //corto que deje de recorrer
                }

            }

            //ForEach recorrido
            System.out.println("----------FOREACH----------------");
            for (Persona perso:lista) {
                System.out.println(perso.getNombre());
            }

            //agregar un elemento entre dos elementos utilizando iterator
            System.out.println("-----------------\n");

            ListIterator<Persona> iterador = lista.listIterator();

            iterador.next();
            iterador.add(new Persona(6,"luis",21));



            //ForEach recorrido
            System.out.println("----------FOREACH----------------");
            for (Persona perso:lista) {
                System.out.println(perso.getNombre());
            }
        }
}
