package TP_N3.Ejercicio_1;
import java.util.ArrayList;
import java.util.Iterator;

public class Profesor extends Persona implements Iterable<Asignatura>{
    private String departamento;
    private ArrayList<Asignatura> asignaturas;

    public Profesor(int dni, String nombre, String departamento) {
        super(dni, nombre);
        this.departamento = departamento;
        this.asignaturas = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }
    public void mostrarNombresAsignaturas() {
        for (Asignatura asignatura : asignaturas) {
            System.out.println(asignatura.getNombre());
        }
    }
    @Override
    public Iterator<Asignatura> iterator() {
        return new AsignaturasIterator();
    }



    private class AsignaturasIterator implements Iterator<Asignatura> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < asignaturas.size();
        }

        @Override
        public Asignatura next() {
            if (hasNext()) {
                return asignaturas.get(index++);
            }
            return null;
        }
    }
}
