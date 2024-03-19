package Ejercicio_en_clase2;

public class Director extends Empleado {
    private String departamento;

    public Director() {
    }
    public Director(String nombre, String departamento) {
        super(nombre);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Directivo [nombre=" + getNombre() + ", departamento=" + departamento + "]";
    }
}
