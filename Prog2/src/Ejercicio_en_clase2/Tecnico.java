package Ejercicio_en_clase2;

public class Tecnico extends Operario {
    private String especialidad;

    public Tecnico(String nombre, String cargo, String especialidad) {
        super(nombre, cargo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Técnico [nombre=" + getNombre() + ", cargo=" + getCargo() + ", especialidad=" + especialidad + "]";
    }
}
