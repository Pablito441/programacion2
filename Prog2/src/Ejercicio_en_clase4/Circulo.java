package Ejercicio_en_clase4;

public class Circulo implements Figura, Dibujable{
    private float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }


    @Override
    public float area() {
        return (float) (3.14*radio*radio);
    }

    @Override
    public void dibujar() {
        System.out.println("Se dibujó un circulo.");
    }
}
