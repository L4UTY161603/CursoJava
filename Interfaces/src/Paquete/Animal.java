package Paquete;

public abstract class Animal {
    //Atributos
    private String nombre;


    public Animal ()
    {

    }

    //Getters and Setters
    public  void SetNombre (String a)
    {
        this.nombre = a;
    }

   public String GetNombre(){
        return nombre;
   }

   //Metodos
    public void comer(){
        System.out.println("El " + nombre + " esta comiendo.");
    }

    public abstract void moverse();

}
