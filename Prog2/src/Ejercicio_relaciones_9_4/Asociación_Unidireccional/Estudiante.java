package Ejercicio_relaciones_9_4.Asociación_Unidireccional;

public class Estudiante {
    private Universidad uni;
    private String name;

    public Estudiante(String name) {
        this.name = name;
    }

    public Universidad getUni() {
        return uni;
    }

    public void setUni(Universidad uni) {
        this.uni = uni;
    }

    public String getName() {
        return name;
    }

}
