package Ejercicio_en_clase;

public class Director extends Empleado {
    private int Oficina;

    public Director() {
    }

    public Director(String nombre, int oficina) {
        super(nombre);
        this.Oficina = oficina;
    }
}
