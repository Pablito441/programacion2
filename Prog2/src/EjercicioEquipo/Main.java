package EjercicioEquipo;

public class Main {
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("CR7", "Delantero", 10);
        Jugador jugador2 = new Jugador("Pepe", "Defensa", 5);
        Jugador jugador3 = new Jugador("Casillas", "Portero", 1);

        Equipo equipo = new Equipo();
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        System.out.println("Jugadores del equipo:");
        for (Jugador juador : equipo) {
            System.out.println(juador);
        }
    }
}