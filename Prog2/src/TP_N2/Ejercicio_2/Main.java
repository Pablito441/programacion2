package TP_N2.Ejercicio_2;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca("Bibliotechet");


        biblioteca.agregarLibro(new Novela("PUKUPUKUPOWPOW", "NCT127", 1967, false, 127));
        biblioteca.agregarLibro(new Universitario("Cálculo", "James Stewart", 1999, false,50));
        biblioteca.agregarLibro(new Infantil("El principito", "Antoine de Saint-Exupéry", 1943, false, 128));


        biblioteca.listarLibrosDisponibles();


        biblioteca.prestarLibro("PUKUPUKUPOWPOW");


        biblioteca.listarLibrosDisponibles();


        biblioteca.devolverLibro("PUKUPUKUPOWPOW");


        biblioteca.listarLibrosDisponibles();


        biblioteca.imprimirListaLibros();
    }
}
