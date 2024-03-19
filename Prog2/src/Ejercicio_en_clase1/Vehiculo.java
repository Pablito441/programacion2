package Ejercicio_en_clase1;

public abstract class Vehiculo {
    private String duenio;
    private int puertas;
    private int ruedas;

    public Vehiculo(String duenio, int puertas, int ruedas) {
        this.duenio = duenio;
        this.puertas = puertas;
        this.ruedas = ruedas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public abstract void caracteristicas();

}
