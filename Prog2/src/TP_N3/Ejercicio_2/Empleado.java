package TP_N3.Ejercicio_2;

public class Empleado {
    private String nombre;
    private Empleado supervisor;

    // Constructor
    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método para asignar un supervisor al empleado
    public void asignarSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    // Método para obtener el nombre del supervisor
    public String obtenerNombreSupervisor() {
        if (supervisor != null) {
            return supervisor.nombre;
        } else {
            return "Sin supervisor";
        }
    }

    // Método para obtener el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre del empleado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        // Crear instancias de la clase Empleado
        Empleado empleado1 = new Empleado("Empleado 1");
        Empleado empleado2 = new Empleado("Empleado 2");

        // Asignar un supervisor al empleado1
        empleado1.asignarSupervisor(empleado2);

        // Mostrar el nombre del supervisor del empleado1
        System.out.println("El supervisor de " + empleado1.getNombre() + " es: " + empleado1.obtenerNombreSupervisor());
    }
}
