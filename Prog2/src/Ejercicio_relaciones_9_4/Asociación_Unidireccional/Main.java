package Ejercicio_relaciones_9_4.Asociación_Unidireccional;

public class Main {
    public static void main(String[] args) {
        Universidad uni1 = new Universidad("Aconcagua");
        Universidad uni2 = new Universidad("UTN");

        Estudiante estu1 = new Estudiante("Jack");
        Estudiante estu2 = new Estudiante("Pablo");

        // Asocio los estudiantes a sus respectivas universidades
        estu1.setUni(uni1);
        estu2.setUni(uni2);

        //Mostar los datos
        System.out.println(estu1.getName() + " es alumno de la " + estu1.getUni().getNombre() + ".");
        System.out.println(estu2.getName() + " es alumno de la " + estu2.getUni().getNombre() + ".");

        //En caso de que se cambien

        estu1.setUni(uni2);
        System.out.println(estu1.getName() + " se cambió a la " + estu2.getUni().getNombre() + ".");


    }
}
