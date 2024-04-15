package TP_N2.Ejercicio_1;

public class Ave extends Animal{
    private String especie;
    private boolean habla;


    public Ave(int edad, String nombre, double precio, String especie, boolean habla) {
        super(edad, nombre, precio, "Ave");
        this.especie = especie;
        this.habla = habla;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

}
