package TP_N2.Ejercicio_1;

public class Pez extends Animal{
    private String tipo;

    public Pez(int edad, String nombre, double precio, String especie) {
        super(edad, nombre, precio, "Pez");
        this.tipo = especie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
