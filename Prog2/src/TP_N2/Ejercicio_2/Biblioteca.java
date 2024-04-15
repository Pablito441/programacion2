package TP_N2.Ejercicio_2;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;
    private String nombre;

    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void agregarLibro(Libro libro){
        libros.add(libro);
        System.out.println("Se agregó el libro "+ libro.getTitulo() + " a la biblioteca " + nombre + ".");
    }
    public void prestarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.isPrestado()) {
                continue;
            }
            if (!libro.isPrestado() && libro.getTitulo().equals(titulo)) {
                libro.prestar();
                return;
            }
        }
        System.out.println("El libro \"" + titulo + "\" no está disponible para préstamo.");
    }

    public void devolverLibro(String titulo){
        for (Libro libro : libros){
            if(libro.getTitulo().equals(titulo) && libro.isPrestado()){
                System.out.println("El libro "+ titulo + " fue devuelto." );
                libro.devolver();
                return;
            }
        }
        System.out.println("El libro no está en prestamo.");
    }

    public void imprimirListaLibros() {
        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    public void listarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : libros) {
            if (!libro.isPrestado()) {
                System.out.println(libro);
            }
        }
    }
}
