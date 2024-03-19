package Ejercicio_en_clase2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Tony");
        Operario operario = new Operario("Loki", "Operario de producción");
        Director directivo = new Director("Hulk", "Departamento de ventas");
        Oficial oficial = new Oficial("Natasha", "Oficial de mantenimiento", 5);
        Tecnico tecnico = new Tecnico("Bruce", "Técnico en informática", "Redes");


        System.out.println(empleado);
        System.out.println(operario);
        System.out.println(directivo);
        System.out.println(oficial);
        System.out.println(tecnico);
    }
}