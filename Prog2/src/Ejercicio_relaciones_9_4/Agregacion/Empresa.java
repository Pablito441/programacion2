package Ejercicio_relaciones_9_4.Agregacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
class Empresa {
    private String nombre;
    private List<Departamento> departamentos;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void agregarDepartamento(Departamento departamento) {
        departamentos.add(departamento);
    }

    public void mostrarDepartamentos() {
        System.out.println("Departamentos de la empresa " + nombre + ":");
        for (Departamento departamento : departamentos) {
            System.out.println("- " + departamento.getNombre());
        }
    }

    public void eliminarDepartamento(String nombreDepartamento) {
        Iterator<Departamento> iterator = departamentos.iterator();
        while (iterator.hasNext()) {
            Departamento departamento = iterator.next();
            if (departamento.getNombre().equals(nombreDepartamento)) {
                iterator.remove();
                System.out.println("Se ha eliminado el departamento " + nombreDepartamento + " de la empresa " + nombre);
                return;
            }
        }
        System.out.println("No se encontró el departamento " + nombreDepartamento + " en la empresa " + nombre);
    }
}