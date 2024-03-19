package Ejercicio_Herencia.Ejercicio_2;

public class Main {
    public static void main(String[] args) {
        //Creación de las clases derivadas

        //Mi gato tiene nombre de pájaro lo sé jaja
        Perro miPerro = new Perro("Kika", 5, "Macho", "Labrador");
        Gato miGato = new Gato("Piolín", 3, "Hembra", "Negro");
        Pajaro miPajaro = new Pajaro("Pajarraquiño", 2, "Macho", "Canario");

        // Llama al método en cada clase
        System.out.println("\n¿Qué hace cada animal?");
        miPerro.hacer_sonido();
        miGato.hacer_sonido();
        miPajaro.hacer_sonido();

        System.out.println("\n-------------------");
        miPerro.informacion();
        System.out.println("\n-------------------");
        miGato.informacion();
        System.out.println("\n-------------------");
        miPajaro.informacion();
    }
}

