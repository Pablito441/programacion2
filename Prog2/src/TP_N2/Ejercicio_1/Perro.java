package TP_N2.Ejercicio_1;

public class Perro extends Animal {
    private String raza;
    protected boolean vacunado;

    public Perro(int edad, String nombre, double precio, String raza, boolean vacunado) {
        super(edad, nombre, precio, "Perro");
        this.raza = raza;
        this.vacunado = vacunado;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

}
