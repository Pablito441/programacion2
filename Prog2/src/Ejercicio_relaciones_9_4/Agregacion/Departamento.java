package Ejercicio_relaciones_9_4.Agregacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class Departamento {
    private String nombre;
    private List<Empleado> empleados;

    public Departamento(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados del departamento " + nombre + ":");
        for (Empleado empleado : empleados) {
            System.out.println("- Nombre: " + empleado.getNombre() + ", Cargo: " + empleado.getCargo());
        }
    }

    public void eliminarEmpleado(String nombreEmpleado) {
        Iterator<Empleado> iterator = empleados.iterator();
        while (iterator.hasNext()) {
            Empleado empleado = iterator.next();
            if (empleado.getNombre().equals(nombreEmpleado)) {
                iterator.remove();
                System.out.println("Se ha eliminado al empleado " + nombreEmpleado + " del departamento " + nombre);
                return;
            }
        }
        System.out.println("No se encontró al empleado " + nombreEmpleado + " en el departamento " + nombre);
    }
}