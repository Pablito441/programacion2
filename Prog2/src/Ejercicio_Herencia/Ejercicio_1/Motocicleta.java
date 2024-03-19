package Ejercicio_Herencia.Ejercicio_1;

public class Motocicleta extends Vehiculo {
    private int velocidad;
    private int cilindrada;

    public Motocicleta() {
    }
    public Motocicleta(String color, int ruedas, int velocidad, int cilindrada) {
        super(color, ruedas);
        this.velocidad = velocidad;
        this.cilindrada = cilindrada;
    }

    public int getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public int getCilindrada() {
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Motocicleta [color=" + getColor() + ", ruedas=" + getRuedas() + ", velocidad=" + velocidad + ", cilindrada=" + cilindrada + "]";
    }
}
