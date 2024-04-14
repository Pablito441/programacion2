package Ejercicio_relaciones_9_4.Asociación_Bidireccional;


public class Main {
    public static void main(String[] args) {
        // personas
        Persona persona1 = new Persona("Persona 1");
        Persona persona2 = new Persona("Persona 2");

        // libros
        Libro libro1 = new Libro("Libro 1");
        Libro libro2 = new Libro("Libro 2");

        //libros a personas
        persona1.agregarLibro(libro1);
        persona2.agregarLibro(libro1);
        persona2.agregarLibro(libro2);

        // Mostrar libros de cada persona
        persona1.mostrarLibros();
        persona2.mostrarLibros();

        // Mostrar personas que poseen un libro en particular
        libro1.mostrarPoseedores();

        // Eliminar un libro de una persona y mostrar los libros actualizados
        persona2.eliminarLibro(libro1);
        persona2.mostrarLibros();
    }
}