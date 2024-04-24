package TP_N3.Ejercicio_1;

public class Asignatura {
    private String aula;
    private  String nombre;
    private  String hora;
    private Grupo grupo;

    public Asignatura(String aula, String nombre, String hora) {
        this.aula = aula;
        this.nombre = nombre;
        this.hora = hora;
    }
    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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

