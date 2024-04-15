package TP_N2.Ejercicio_2;

public class Infantil extends Libro {
    private int numPag;

    public Infantil(String titulo, String autor, int anioDePublicacion, boolean prestado, int numPag) {
        super(titulo, autor, anioDePublicacion, prestado);
        this.numPag = numPag;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }
    @Override
    public String toString() {
        return super.toString() + ", Número de paginas: " + numPag;
    }
}
