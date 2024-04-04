package Ejercicio_en_clase2;
class Operario extends Empleado {
    private String cargo;
    public Operario(String nombre, String cargo) {
        super(nombre);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Operario [nombre=" + getNombre() + ", cargo=" + cargo + "]";
    }
    

}
