public class Main {
    public static void main(String[] args)
    {
        //variables
        double angulo = 45.0 * Math.PI/180.0;
        double y=-6.2;  //ordenada
        double x=1.2;   //abscisa

        //funciones trigonometricas
        System.out.println("cos de (" + angulo + ") es " + Math.cos(angulo));
        System.out.println();
        System.out.println("sin de (" + angulo + ") es " + Math.sin(angulo));
        System.out.println();
        System.out.println("tan de (" + angulo + ") es " + Math.tan(angulo));
        System.out.println();


        System.out.println("atan2 (" + y+" , "+x + ") es " + Math.atan2(y, x));
        System.out.println();

        //constantes PI y e
        System.out.println("El numero e es: " + Math.E);
        System.out.println("El numero pi es: " + Math.PI);

        //Funcion exponencial y su inversa
        System.out.println("exp(2.0) es " +  Math.exp(2.0));
        System.out.println("log(10.0) es " + Math.log(10.0));

    }
}