package Ejercicio_en_clase4;

public class Cuadrado implements Figura, Rotable, Dibujable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float area() {
        return lado*lado;
    }


    @Override
    public void rotar() {
        System.out.println("Soy un cuadrado que está rotando.");
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibujó un cuadrado");
    }
}
