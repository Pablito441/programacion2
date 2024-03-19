package Ejercicio_en_clase;
class Operario extends Empleado {
    private int numOperario;

    public Operario() {
    }

    public Operario(String nombre, int numOperario) {
        super(nombre);
        this.numOperario = numOperario;
    }

    public int getNumOperario() {
        return numOperario;
    }

    public void setNumOperario(int numOperario) {
        this.numOperario = numOperario;
    }

    @Override
    public String toString() {
        return "Hola";
    }

}
