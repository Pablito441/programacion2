package TP_N3.Ejercicio_1;

public class Alumno extends Persona{

    private Grupo grupo;
    public Alumno(int dni, String nombre) {
        super(dni, nombre);
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public void asignarGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

}
