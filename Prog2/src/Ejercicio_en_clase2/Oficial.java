package Ejercicio_en_clase2;

public class Oficial extends Operario {
    private int añosExperiencia;

    public Oficial(String nombre, String cargo, int añosExperiencia) {
        super(nombre, cargo);
        this.añosExperiencia = añosExperiencia;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    @Override
    public String toString() {
        return "Oficial [nombre=" + getNombre() + ", cargo=" + getCargo() + ", añosExperiencia=" + añosExperiencia + "]";
    }
}
