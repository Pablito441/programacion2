package TP_N2.Ejercicio_2;

public abstract class Libro implements Prestable{
    private String titulo;
    private String autor;
    private int anioDePublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anioDePublicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioDePublicacion = anioDePublicacion;
        this.prestado = prestado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnioDePublicacion() {
        return anioDePublicacion;
    }

    public void setAnioDePublicacion(int anioDePublicacion) {
        this.anioDePublicacion = anioDePublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public boolean setPrestado(boolean prestado) {
        this.prestado = prestado;
        return prestado;
    }

    @Override
    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro \"" + titulo + "\" ha sido prestado.");
        } else {
            System.out.println("El libro \"" + titulo + "\" ya está prestado.");

        }
    }

    @Override
    public void devolver() {
        if (prestado) {
            prestado = false;
            System.out.println("El libro \"" + titulo + "\" ha sido devuelto.");
        } else {
            System.out.println("El libro \"" + titulo + "\" no estaba prestado.");
        }
    }
    @Override
    public String toString() {
        return "Libro: " + titulo + ", Autor: " + autor + ", Año de publicación: " + anioDePublicacion + ", Prestado: " + (prestado ? "Sí" : "No");
    }
}
