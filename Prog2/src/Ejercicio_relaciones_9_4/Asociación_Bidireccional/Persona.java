package Ejercicio_relaciones_9_4.Asociación_Bidireccional;

import java.util.ArrayList;
import java.util.List;

class Persona {
    private String nombre;
    private List<Libro> libros;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
        libro.agregarPoseedor(this);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
        libro.eliminarPoseedor(this);
    }

    public void mostrarLibros() {
        System.out.println("Libros de " + nombre + ":");
        for (Libro libro : libros) {
            System.out.println("- " + libro.getTitulo());
        }
    }

}
