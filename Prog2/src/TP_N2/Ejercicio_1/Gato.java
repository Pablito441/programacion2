package TP_N2.Ejercicio_1;

public class Gato extends Animal{
    private String raza;
    private  boolean esterelizado;

    public Gato(int edad, String nombre, double precio, String raza, boolean esterelizado) {
        super(edad, nombre, precio, "Gato");
        this.raza = raza;
        this.esterelizado = esterelizado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isEsterelizado() {
        return esterelizado;
    }

    public void setEsterelizado(boolean esterelizado) {
        this.esterelizado = esterelizado;
    }

}
