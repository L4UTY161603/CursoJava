import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<Persona>();

        lista.add(new Persona(1,"Lautaro",21));
        lista.add(new Persona(2,"Kevin",21));
        lista.add(new Persona(3,"Bruno",21));
        lista.add(new Persona(4,"Dante",23));

        //Remove en Arraylist
        lista.remove(1);
        //Recorrer por indice
        System.out.println("----------CLASICO----------------");
        for(int i = 0; i<lista.size(); i++){
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        //ForEach recorrido
        System.out.println("----------FOREACH----------------");
        for (Persona perso:lista) {
            System.out.println("Prueba: " + perso.getNombre());
        }


    }
}