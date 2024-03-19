package Ejercicio_Herencia.Ejercicio_1;

public class Camioneta extends Vehiculo {
    private double carga;

    public Camioneta() {
    }
    public Camioneta(String color, int ruedas, double carga) {
        super(color, ruedas);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }
    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Camioneta [color=" + getColor() + ", ruedas=" + getRuedas() + ", carga=" + carga + "]";
    }
}
