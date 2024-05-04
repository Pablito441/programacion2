package TP_N3.Ejercicio_5;
import java.util.ArrayList;
import java.util.Iterator;

class ListaDeTareas implements Iterable<Tarea> {
    private ArrayList<Tarea> tareas;

    public ListaDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public boolean eliminarTarea(String descripcion) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(descripcion)) {
                tareas.remove(tarea);
                return true;
            }
        }
        return false;
    }

    public int obtenerNumeroTotalTareas() {
        return tareas.size();
    }

    @Override
    public Iterator<Tarea> iterator() {
        return new TareasIterator();
    }

    private class TareasIterator implements Iterator<Tarea> {
        private int index = tareas.size() - 1;

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Tarea next() {
            return tareas.get(index--);
        }
    }
}
