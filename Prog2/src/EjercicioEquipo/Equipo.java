package EjercicioEquipo;
import java.util.ArrayList;
import java.util.Iterator;
class Equipo implements Iterable<Jugador> {
    private ArrayList<Jugador> jugadores;

    public Equipo() {
        jugadores = new ArrayList<>();
    }
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    @Override
    public Iterator<Jugador> iterator() {
        return new IteradorJugadores();
    }

    private class IteradorJugadores implements Iterator<Jugador> {
        private int indice = 0;

        @Override
        public boolean hasNext() {
            return indice < jugadores.size();
        }

        @Override
        public Jugador next() {
            if (hasNext()) {
                return jugadores.get(indice++);
            }
            return null;
        }
    }
}